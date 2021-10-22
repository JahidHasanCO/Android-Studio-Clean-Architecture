package dev.jahidhasanco.mealsapp.domain.repository

import dev.jahidhasanco.mealsapp.data.model.MealsDTO

interface MealSearchRepository {

    suspend fun getMealList(s:String): MealsDTO


}