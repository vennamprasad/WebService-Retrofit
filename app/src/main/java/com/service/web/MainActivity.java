package com.service.web;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.service.web.network.client.RetrofitClient;
import com.service.web.network.ekyc.req.RequestData;
import com.service.web.network.ekyc.res.ResponseData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("StaticFieldLeak")
    public TextView textView;
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.hello);
        progressBar=findViewById(R.id.progressBar);
        makeApiCall();
    }

    private void makeApiCall() {
        //Creating a call instance using our RetrofitClient
        //here basically we are calling the method getBFILRefNum() that we created inside
        //our API Interface

        RequestData requestData=new RequestData();
        requestData.setBioAuthEKYC("EKYC");
        requestData.setToken("01000733xzGpAm8kJ9mr7dlV2LH4KdQh7KaMNdIIygmFMNNuXXhC4fzj4AbaHynQnEL4HeZU");

        Call<ResponseData> call = RetrofitClient.getInstance().getMyApi().getBFILRefNum(requestData);

        //to perform the API call we need to call the method enqueue()
        //We need to pass a Callback with enqueue method
        //And Inside the callback functions we will handle success or failure of
        //the result that we got after the API call
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {

                //In this point we got our response
                ResponseData res = response.body();
                Gson gson = new Gson();
                String json = gson.toJson(res);
                progressBar.setVisibility(View.GONE);
                textView.setText(json);

                //now we can do whatever we want with this data
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {
                //handle error or failure cases here
                progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}