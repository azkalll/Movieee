package com.example.movieee.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstanse {
    public static String BASE_URL = "https://api.themoviedb.org/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstanse() {

        if (retrofit == null) {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
