package com.example.foodserchingapp.data.repository

import com.example.foodserchingapp.data.API.MealSearchAPI
import com.example.foodserchingapp.data.model.MealsDTO
import com.example.foodserchingapp.domain.repository.MealDetailsRepo
import com.example.foodserchingapp.domain.repository.MealSearchRepo

class GetMealsDetailsImpl(private  val mealSearchAPI: MealSearchAPI): MealDetailsRepo {
    override suspend fun getMealsDetails(Id: String): MealsDTO {

        return  mealSearchAPI.getMealListDetails(Id)
    }


}