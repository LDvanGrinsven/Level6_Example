package com.example.level6_example_numbertrivia

import retrofit2.Call
import retrofit2.http.GET

interface NumbersApiService {
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>

}