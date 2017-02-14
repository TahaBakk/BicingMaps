package com.example.x3727349s.bicingmaps;

import android.net.Uri;
import android.support.annotation.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by x3727349s on 13/02/17.
 */

public class BicingApi {

    String BASE_URL = "http://wservice.viabicing.cat/v2/stations";

    POJO getStacion(){

        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .build();
        String url = builtUri.toString();
        try {
            return docall(url);
        } catch (IOException e) {e.printStackTrace();
        } catch (JSONException e) {e.printStackTrace();
        }return null;

    }

    @Nullable
    private POJO docall(String url) throws IOException, JSONException {

        String JsonResponse = HttpUtils.get(url);
        return processJson(JsonResponse);

    }

    private POJO processJson(String jsonResponse) throws JSONException {

        JSONObject data = new JSONObject(jsonResponse);
        JSONObject datos = data.getJSONObject("stations");

        POJO pojo = new POJO();

        pojo.setIds(datos.getInt(""));
        pojo.setType(datos.getString(""));
        pojo.setLatitude(datos.getDouble(""));
        pojo.setLongitude(datos.getDouble(""));
        pojo.setStreetName(datos.getString(""));
        pojo.setStreetNumber(datos.getInt(""));
        pojo.setAltitude(datos.getInt(""));
        pojo.setSlots(datos.getInt(""));
        pojo.setBikes(datos.getInt(""));
        pojo.setStatus(datos.getString(""));
        pojo.setNearbyStation(datos.getString(""));

        return pojo;
    }


}
