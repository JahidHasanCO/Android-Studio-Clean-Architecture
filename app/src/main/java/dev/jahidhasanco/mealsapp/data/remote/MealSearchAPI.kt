package dev.jahidhasanco.mealsapp.data.remote

import dev.jahidhasanco.mealsapp.data.model.MealsDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface MealSearchAPI {

    @GET("api/json/v1/1/search.php")
    suspend fun getMealList(
        @Query("s") s:String
    ): MealsDTO

    @GET("api/json/v1/1/lookup.php")
    suspend fun getMealDetails(
        @Query("i") i:String
    ): MealsDTO


}