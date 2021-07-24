package com.fole_studios.android_country_states.background;

import android.annotation.SuppressLint;

import java.util.ArrayList;

public class StateClient
{

    private String _country;
    private ArrayList<String> _states;

    public StateClient()
    { }

    public void setCountry(String countryName)
    {
        _country = countryName;
    }

    public void run()
    {
        getStates();
    }

    public ArrayList<String> statesList()
    {
        return _states;
    }

    @SuppressLint("StaticFieldLeak")
    private void getStates()
    {
        _states = new ArrayList<>();
        new StateDataTask()
        {

            @Override
            public void onResponseReceived(ArrayList<String> states)
            {
                _states = states;
            }
        }.execute(_country);
    }

}
