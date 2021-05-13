package com.example.technicaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.technicaltest.entity.dst;
import com.example.technicaltest.entity.smsLleida;
import com.example.technicaltest.interfaces.lleidaApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private lleidaApi lleidaApi ;
    private smsLleida sms;
    private ArrayList<dst> numeros = new ArrayList<dst>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.lleida.net").addConverterFactory(GsonConverterFactory.create()).build();
        lleidaApi = retrofit.create(lleidaApi.class);

        dst num1 = new dst("%2B34685775927");
        dst num2 = new dst("%2B34685775927");

        numeros.add(num1);
        numeros.add(num2);

        sms = new smsLleida("user1@proves_frontend", "prova1234", numeros, "this is the SMS text");

        Call<smsLleida> call = lleidaApi.sendSms(sms);
        call.enqueue(new Callback<smsLleida>() {
            @Override
            public void onResponse(Call<smsLleida> call, Response<smsLleida> response) {
                try {
                    if (response.isSuccessful()) {


                    }
                } catch (Exception ignored) {

                }
            }

            @Override
            public void onFailure(Call<smsLleida> call, Throwable t) {

            }
        });

    }
}