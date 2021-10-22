package dev.jahidhasanco.mealsapp.domain.use_case

import dev.jahidhasanco.mealsapp.data.model.toDomainMeal
import dev.jahidhasanco.mealsapp.domain.model.Meal
import dev.jahidhasanco.mealsapp.domain.repository.MealSearchRepository
import dev.jahidhasanco.mealsapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject

class GetMealSearchListUseCase
@Inject
constructor(private val repository: MealSearchRepository){

    operator fun invoke(s: String): Flow<Resource<List<Meal>>> = flow {

        try {

            emit(Resource.Loading())

            val response = repository.getMealList(s)

            val list = if(response.meals.isNullOrEmpty()) emptyList<Meal>() else response.meals.map {
                it.toDomainMeal()
            }

            emit((Resource.Success(data = list)))


        }

        catch (e: HttpException){
            emit(Resource.Error(message = e.localizedMessage?:"Unknown Error"))
        }
        catch (e: IOException){
            emit(Resource.Error(message = e.localizedMessage?:"Check Your Internet Connection"))
        }
        catch (e: Exception){
            emit(Resource.Error(message = e.localizedMessage?:""))
        }

    }

}