package com.service.web.network.ekyc.req;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestData {

    @SerializedName("Token")
    @Expose
    private String token;
    @SerializedName("BioAuth_eKYC")
    @Expose
    private String bioAuthEKYC;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBioAuthEKYC() {
        return bioAuthEKYC;
    }

    public void setBioAuthEKYC(String bioAuthEKYC) {
        this.bioAuthEKYC = bioAuthEKYC;
    }

}