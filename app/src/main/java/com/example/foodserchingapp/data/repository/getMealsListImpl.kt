package com.example.foodserchingapp.data.repository

import com.example.foodserchingapp.data.API.MealSearchAPI
import com.example.foodserchingapp.data.model.MealsDTO
import com.example.foodserchingapp.domain.repository.MealSearchRepo

class getMealsListImpl(private  val mealSearchAPI: MealSearchAPI)  : MealSearchRepo {

    override suspend fun getMealsList(s: String): MealsDTO {
       return mealSearchAPI.getMealsList(s)
    }

}