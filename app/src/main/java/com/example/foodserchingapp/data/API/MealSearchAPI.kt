package com.example.foodserchingapp.data.API

import com.example.foodserchingapp.data.model.MealsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface MealSearchAPI {

    @GET("api/json/v1/1/search.php")
     suspend fun getMealsList(@Query("s")s:String): MealsDTO

    @GET("api/json/v1/1/lookup.php")
    suspend fun getMealListDetails(@Query("i")I:String): MealsDTO



}