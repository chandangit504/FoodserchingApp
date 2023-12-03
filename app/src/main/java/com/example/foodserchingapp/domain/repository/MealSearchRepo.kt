package com.example.foodserchingapp.domain.repository

import com.example.foodserchingapp.data.model.MealsDTO

interface MealSearchRepo {

    suspend fun getMealsList(s: String) : MealsDTO
}