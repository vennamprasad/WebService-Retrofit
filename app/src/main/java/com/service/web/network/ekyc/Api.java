package com.service.web.network.ekyc;

import com.service.web.network.ekyc.req.RequestData;
import com.service.web.network.ekyc.res.ResponseData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {

    String BASE_URL = "https://iblacc.bfil.co.in:8888/RefNumFetch/api/";

    /**
     * The return type is important here
     * The class structure that you've defined in Call<T>
     * should exactly match with your json response
     * If you are not using another api, and using the same as mine
     * then no need to worry, but if you have your own API, make sure
     * you change the return type appropriately
     **/
    @POST("getBFILRefNum")
    Call<ResponseData> getBFILRefNum(@Body RequestData requestData);

}
