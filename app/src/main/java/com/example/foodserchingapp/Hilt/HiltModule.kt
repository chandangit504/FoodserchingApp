package com.example.foodserchingapp.Hilt

import com.example.foodserchingapp.Common.Constant
import com.example.foodserchingapp.data.API.MealSearchAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object HiltModule {


    @Provides
    @Singleton
    fun provideMealSearchApi() : MealSearchAPI{
     return  Retrofit.Builder().baseUrl(Constant.bas_url).addConverterFactory(GsonConverterFactory.create()).build().create(MealSearchAPI::class.java)
    }
}