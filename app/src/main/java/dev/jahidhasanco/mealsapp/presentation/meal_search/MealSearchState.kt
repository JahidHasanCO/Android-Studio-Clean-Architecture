package dev.jahidhasanco.mealsapp.presentation.meal_search

import dev.jahidhasanco.mealsapp.domain.model.Meal

data class MealSearchState(
    val data: List<Meal>? = null,
    val error: String = "",
    val isLoading: Boolean = false
)
