package dev.jahidhasanco.mealsapp.data.repository

import dev.jahidhasanco.mealsapp.data.model.MealsDTO
import dev.jahidhasanco.mealsapp.data.remote.MealSearchAPI
import dev.jahidhasanco.mealsapp.domain.repository.MealSearchRepository

class MealListRepositoryImpl(private val mealSearchAPI: MealSearchAPI) : MealSearchRepository {

    override suspend fun getMealList(s: String): MealsDTO {
        return mealSearchAPI.getMealList(s)
    }

}