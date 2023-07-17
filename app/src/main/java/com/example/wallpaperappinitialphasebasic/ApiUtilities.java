package com.example.wallpaperappinitialphasebasic;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
    private static Retrofit retrofit=null;
    static final String API ="3YZebax22UCvlGVAXxUnIJUZ6OzyMUFBo8iBOwLx5191cIPYLLXxjdeF";


    public static ApiInterface getApiInterface(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit.create(ApiInterface.class);}
    }

