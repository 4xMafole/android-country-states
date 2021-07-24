package com.fole_studios.android_country_states.background;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CountryStates
{
    public JSONObject listOfCities(String country)
    {

        OkHttpClient _client = new OkHttpClient().newBuilder().build();
        MediaType _mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody _body = RequestBody.create(_mediaType, "{\n" + "    \"country\": \"" + country + "\"\n" + "}");
        Request _request = new Request.Builder()
                .url("https://countriesnow.space/api/v0.1/countries/states")
                .post(_body)
                .addHeader("X-Powered-By", "Express")
                .addHeader("Access-Control-Allow-Origin", "*")
                .addHeader("Access-Control-Allow-Headers", "*")
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .addHeader("Content-Length", "1603")
                .addHeader("ETag", "W/\"643-K3YS4WMINUtkPWnzM2utdIFgdIg\"")
                .addHeader("Date", "Wed, 16 Sep 2020 08:03:22 GMT")
                .addHeader("Connection", "keep-alive")
                .build();

        JSONObject _listOfCities = null;
        try
        {
            Response _response = _client.newCall(_request).execute();
            String _list = _response.body().string();
            _listOfCities = new JSONObject(_list);
        }
        catch(IOException | JSONException e)
        {
            e.printStackTrace();
        }

        return _listOfCities;
    }
}
