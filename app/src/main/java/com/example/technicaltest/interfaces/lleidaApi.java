package com.example.technicaltest.interfaces;
import android.provider.Telephony;

import com.example.technicaltest.entity.smsLleida;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface lleidaApi {

    @POST("/sms/v2/")
    Call<smsLleida> sendSms(@Body smsLleida sms);
}
