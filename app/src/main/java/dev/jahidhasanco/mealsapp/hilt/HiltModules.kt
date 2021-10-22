package dev.jahidhasanco.mealsapp.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.jahidhasanco.mealsapp.data.remote.MealSearchAPI
import dev.jahidhasanco.mealsapp.data.repository.MealDetailsRepositoryImpl
import dev.jahidhasanco.mealsapp.data.repository.MealListRepositoryImpl
import dev.jahidhasanco.mealsapp.domain.repository.MealDetailsRepository
import dev.jahidhasanco.mealsapp.domain.repository.MealSearchRepository
import dev.jahidhasanco.mealsapp.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltModules {

    @Provides
    @Singleton
    fun provideMealSearchAPI(): MealSearchAPI{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(MealSearchAPI::class.java)
    }


    @Provides
    fun provideMealSearchRepository(mealSearchAPI: MealSearchAPI): MealSearchRepository{
        return MealListRepositoryImpl(mealSearchAPI)
    }


    @Provides
    fun provideMealDetailsRepository(mealSearchAPI: MealSearchAPI): MealDetailsRepository{
        return MealDetailsRepositoryImpl(mealSearchAPI)
    }


}