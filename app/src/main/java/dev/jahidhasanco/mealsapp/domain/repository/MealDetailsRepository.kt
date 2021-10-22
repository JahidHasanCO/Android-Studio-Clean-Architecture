package dev.jahidhasanco.mealsapp.domain.repository

import dev.jahidhasanco.mealsapp.data.model.MealsDTO

interface MealDetailsRepository {

    suspend fun getMealDetails(id:String): MealsDTO

}