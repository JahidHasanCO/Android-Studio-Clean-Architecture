package dev.jahidhasanco.mealsapp.data.model


import com.google.gson.annotations.SerializedName

data class MealsDTO(
    @SerializedName("meals")
    val meals: List<MealDTO>
)