package com.fole_studios.android_country_states.background;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public abstract class StateDataTask extends AsyncTask<String, String, JSONObject> implements ClientStatesCallback
{
    private static final String STATE_DATA_TASK = "State Data Task";

    @Override
    protected JSONObject doInBackground(String... params)
    {

        CountryStates _countryStatesAPI = new CountryStates();
        return _countryStatesAPI.listOfCities(params[0]);
    }

    @Override
    protected void onPostExecute(JSONObject response)
    {
        if(response != null)
        {
            try
            {
                Log.i(STATE_DATA_TASK, "Success: " + response.getJSONObject("data"));
                JSONObject Jdata = response.getJSONObject("data");
                JSONArray Jstate = Jdata.getJSONArray("states");

                ArrayList<String> _states = new ArrayList<>();

                for(int i = 0; i < Jstate.length(); i++)
                {
                    JSONObject object = Jstate.getJSONObject(i);
                    _states.add(object.get("name").toString());
                }

                onResponseReceived(_states);
            }
            catch(JSONException ex)
            {
                Log.e(STATE_DATA_TASK, "Failure", ex);
            }
        }
    }

    public abstract void onResponseReceived(ArrayList<String> states);
}
