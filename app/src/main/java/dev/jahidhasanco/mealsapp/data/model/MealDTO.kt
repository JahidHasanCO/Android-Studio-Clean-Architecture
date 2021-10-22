package dev.jahidhasanco.mealsapp.data.model


import com.google.gson.annotations.SerializedName
import dev.jahidhasanco.mealsapp.domain.model.Meal
import dev.jahidhasanco.mealsapp.domain.model.MealDetails

data class MealDTO(
    @SerializedName("dateModified")
    val dateModified: String?,
    @SerializedName("idMeal")
    val idMeal: String,
    @SerializedName("strArea")
    val strArea: String,
    @SerializedName("strCategory")
    val strCategory: String,
    @SerializedName("strCreativeCommonsConfirmed")
    val strCreativeCommonsConfirmed: String?,
    @SerializedName("strDrinkAlternate")
    val strDrinkAlternate: String?,
    @SerializedName("strImageSource")
    val strImageSource: String?,
    @SerializedName("strIngredient1")
    val strIngredient1: String,
    @SerializedName("strIngredient10")
    val strIngredient10: String?,
    @SerializedName("strIngredient11")
    val strIngredient11: String?,
    @SerializedName("strIngredient12")
    val strIngredient12: String?,
    @SerializedName("strIngredient13")
    val strIngredient13: String?,
    @SerializedName("strIngredient14")
    val strIngredient14: String?,
    @SerializedName("strIngredient15")
    val strIngredient15: String?,
    @SerializedName("strIngredient16")
    val strIngredient16: String?,
    @SerializedName("strIngredient17")
    val strIngredient17: String?,
    @SerializedName("strIngredient18")
    val strIngredient18: String?,
    @SerializedName("strIngredient19")
    val strIngredient19: String?,
    @SerializedName("strIngredient2")
    val strIngredient2: String,
    @SerializedName("strIngredient20")
    val strIngredient20: String?,
    @SerializedName("strIngredient3")
    val strIngredient3: String,
    @SerializedName("strIngredient4")
    val strIngredient4: String,
    @SerializedName("strIngredient5")
    val strIngredient5: String?,
    @SerializedName("strIngredient6")
    val strIngredient6: String?,
    @SerializedName("strIngredient7")
    val strIngredient7: String?,
    @SerializedName("strIngredient8")
    val strIngredient8: String?,
    @SerializedName("strIngredient9")
    val strIngredient9: String?,
    @SerializedName("strInstructions")
    val strInstructions: String,
    @SerializedName("strMeal")
    val strMeal: String,
    @SerializedName("strMealThumb")
    val strMealThumb: String,
    @SerializedName("strMeasure1")
    val strMeasure1: String,
    @SerializedName("strMeasure10")
    val strMeasure10: String?,
    @SerializedName("strMeasure11")
    val strMeasure11: String?,
    @SerializedName("strMeasure12")
    val strMeasure12: String?,
    @SerializedName("strMeasure13")
    val strMeasure13: String?,
    @SerializedName("strMeasure14")
    val strMeasure14: String?,
    @SerializedName("strMeasure15")
    val strMeasure15: String?,
    @SerializedName("strMeasure16")
    val strMeasure16: String?,
    @SerializedName("strMeasure17")
    val strMeasure17: String?,
    @SerializedName("strMeasure18")
    val strMeasure18: String?,
    @SerializedName("strMeasure19")
    val strMeasure19: String?,
    @SerializedName("strMeasure2")
    val strMeasure2: String,
    @SerializedName("strMeasure20")
    val strMeasure20: String?,
    @SerializedName("strMeasure3")
    val strMeasure3: String,
    @SerializedName("strMeasure4")
    val strMeasure4: String,
    @SerializedName("strMeasure5")
    val strMeasure5: String?,
    @SerializedName("strMeasure6")
    val strMeasure6: String?,
    @SerializedName("strMeasure7")
    val strMeasure7: String?,
    @SerializedName("strMeasure8")
    val strMeasure8: String?,
    @SerializedName("strMeasure9")
    val strMeasure9: String?,
    @SerializedName("strSource")
    val strSource: String?,
    @SerializedName("strTags")
    val strTags: String?,
    @SerializedName("strYoutube")
    val strYoutube: String
)


fun MealDTO.toDomainMeal(): Meal{
    return Meal(
        mealId = this.idMeal,
        name = this.strMeal?:"",
        image = this.strMealThumb ?:""
    )

}

fun MealDTO.toDomainMealDetails(): MealDetails {
    return MealDetails(
        name = this.strMeal ?: "",
        image = this.strMealThumb ?: "",
        instructions = this.strInstructions ?: "",
        category = this.strCategory ?: "",


        ingredient1 = this.strIngredient1 ?: "",
        ingredient2 = this.strIngredient2 ?: "",
        ingredient3 = this.strIngredient3 ?: "",
        ingredient4 = this.strIngredient4 ?: "",
        ingredient5 = this.strIngredient5 ?: "",
        ingredient6 = this.strIngredient6 ?: "",
        ingredient7 = this.strIngredient7 ?: "",
        ingredient8 = this.strIngredient8 ?: "",
        ingredient9 = this.strIngredient9 ?: "",
        ingredient10 = this.strIngredient10 ?: "",
        ingredient11 = this.strIngredient11 ?: "",
        ingredient12 = this.strIngredient12 ?: "",
        ingredient13 = this.strIngredient13 ?: "",
        ingredient14 = this.strIngredient14 ?: "",
        ingredient15 = this.strIngredient15 ?: "",
        ingredient16 = this.strIngredient16 ?: "",
        ingredient17 = this.strIngredient17 ?: "",
        ingredient18 = this.strIngredient18 ?: "",
        ingredient19 = this.strIngredient19 ?: "",
        ingredient20 = this.strIngredient20 ?: "",

        measure1 = this.strMeasure1 ?: "",
        measure2 = this.strMeasure2 ?: "",
        measure3 = this.strMeasure3 ?: "",
        measure4 = this.strMeasure4 ?: "",
        measure5 = this.strMeasure5 ?: "",
        measure6 = this.strMeasure6 ?: "",
        measure7 = this.strMeasure7 ?: "",
        measure8 = this.strMeasure8 ?: "",
        measure9 = this.strMeasure9 ?: "",
        measure10 = this.strMeasure10 ?: "",
        measure11 = this.strMeasure11 ?: "",
        measure12 = this.strMeasure12 ?: "",
        measure13 = this.strMeasure13 ?: "",
        measure14 = this.strMeasure14 ?: "",
        measure15 = this.strMeasure15 ?: "",
        measure16 = this.strMeasure16 ?: "",
        measure17 = this.strMeasure17 ?: "",
        measure18 = this.strMeasure18 ?: "",
        measure19 = this.strMeasure19 ?: "",
        measure20 = this.strMeasure20 ?: "",

        )

}