package com.example.foodserchingapp.domain.repository

import com.example.foodserchingapp.data.model.MealsDTO

interface MealDetailsRepo {
    suspend fun getMealsDetails(s: String) : MealsDTO

}