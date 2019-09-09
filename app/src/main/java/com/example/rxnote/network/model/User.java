package com.example.rxnote.network.model;

import com.example.rxnote.network.model.BaseResponse;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class User extends BaseResponse {

    @SerializedName("api_key")
    String apiKey;

}
