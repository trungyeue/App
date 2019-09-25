package com.example.appduan;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import com.android.volley.toolbox.Volley;

import com.example.appduan.mode.InHomeAdapter;
import com.google.gson.JsonObject;


import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;


public class InHome extends AppCompatActivity {
    String urlJson = "https://extranet.sophiapms.com/api/InHouse?companyId=5&fromDate=2019-9-25";
ListView listView;
TextView home;
    ArrayList<com.example.appduan.mode.InHome> inHomess;
    InHomeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_home);
        listView=findViewById(R.id.listviewinhome);
        home=findViewById(R.id.home1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InHome.this,MainActivity.class));
            }
        });
        inHomess=new ArrayList<>();
        adapter=new InHomeAdapter(this,R.layout.tem,inHomess);
        listView.setAdapter(adapter);
        GetJsonYouTube(urlJson);
//        URL githubEndpoint = null;
//        try {
//            githubEndpoint = new URL("https://extranet.sophiapms.com/api/InHouse?companyId=5&fromDate=2019-9-25");
//            HttpURLConnection myConnection=(HttpURLConnection)githubEndpoint.openConnection();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.github.com")
//                .addConverterFactory(GsonConverterFactory.create()).build();
//
//
//        Json service = retrofit.create(Json.class);
//        Call<List<InHome>> call=service.getPost();
//
//        call.enqueue(new Callback<List<InHome>>() {
//            @Override
//            public void onResponse(Response<List<InHome>> response, Retrofit retrofit) {
//
//                if (!response.isSuccess()){
//                    JSONObject jsonObject=
//                }
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//
//            }
//        });
    }

    private void GetJsonYouTube(String urlJson) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, urlJson, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                    for (int i=0;i<response.length();i++){
                        try {
                            JSONObject object=response.getJSONObject(i);
                            inHomess.add(new com.example.appduan.mode.InHome(
                                    object.getString("roomType"),
                                    object.getString("roomName"),
                                    object.getString("arrival"),
                                    object.getString("roomRate")
                            ));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    adapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(jsonArrayRequest);

//                            try {
//                                JSONArray jsonArray = response.getJSONArray("items");
//                                String title = "";
//                                String url = "";
//                                String idvideo = "";
//                                for (int i = 0; i < jsonArray.length(); i++) {
//                                    JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//                                    title = jsonObject.getString("roomType");
//                                    JSONObject jsonThumbnail = jsonSnipper.getJSONObject("thumbnails");
//                                    JSONObject jsonMedium = jsonThumbnail.getJSONObject("medium");
//                                    url = jsonMedium.getString("url");
//                                    JSONObject jsonResourceID = jsonSnipper.getJSONObject("resourceId");
//                                    idvideo = jsonResourceID.getString("videoId");
//                                    inHomess.add(new com.example.appduan.mode.InHome(title, url, idvideo));
////                                Toast.makeText(getContext(), title, Toast.LENGTH_SHORT).show();
//                                    adapter.notifyDataSetChanged();
//                                }
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }

    }
//        AsyncTask.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    URL githubEndpoint = new URL("https://extranet.sophiapms.com/api/InHouse?companyId=5&fromDate=2019-9-25");
//                    HttpsURLConnection myConnection = (HttpsURLConnection) githubEndpoint.openConnection();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
}

