package com.example.technicaltest.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class smsLleida implements Serializable {

    @SerializedName("user")
    private String user ;

    @SerializedName("password")
    private String password ;

    @SerializedName("dst")
    private ArrayList<dst> numeros ;

    @SerializedName("txt")
    private String txt ;


    public smsLleida(String user, String password, ArrayList<dst> numeros, String txt) {
        this.user = user;
        this.password = password;
        this.numeros = numeros;
        this.txt = txt;
    }
}
