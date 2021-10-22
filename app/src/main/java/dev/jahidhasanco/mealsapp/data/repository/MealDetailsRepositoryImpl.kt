package dev.jahidhasanco.mealsapp.data.repository

import dev.jahidhasanco.mealsapp.data.model.MealsDTO
import dev.jahidhasanco.mealsapp.data.remote.MealSearchAPI
import dev.jahidhasanco.mealsapp.domain.repository.MealDetailsRepository

class MealDetailsRepositoryImpl(private val mealSearchAPI: MealSearchAPI): MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchAPI.getMealDetails(id)
    }
}