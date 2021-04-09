package com.service.web.network.ekyc.res;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseData {

    @SerializedName("responseCode")
    @Expose
    private String responseCode;
    @SerializedName("responseMessage")
    @Expose
    private String responseMessage;
    @SerializedName("errorDesc")
    @Expose
    private String errorDesc;
    @SerializedName("bfilRefNum")
    @Expose
    private Object bfilRefNum;
    @SerializedName("TokenID")
    @Expose
    private Object tokenID;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public Object getBfilRefNum() {
        return bfilRefNum;
    }

    public void setBfilRefNum(Object bfilRefNum) {
        this.bfilRefNum = bfilRefNum;
    }

    public Object getTokenID() {
        return tokenID;
    }

    public void setTokenID(Object tokenID) {
        this.tokenID = tokenID;
    }

}