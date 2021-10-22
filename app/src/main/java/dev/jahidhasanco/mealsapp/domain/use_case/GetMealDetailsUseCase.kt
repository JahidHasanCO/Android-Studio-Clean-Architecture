package dev.jahidhasanco.mealsapp.domain.use_case

import dev.jahidhasanco.mealsapp.data.model.toDomainMealDetails
import dev.jahidhasanco.mealsapp.domain.model.MealDetails
import dev.jahidhasanco.mealsapp.domain.repository.MealDetailsRepository
import dev.jahidhasanco.mealsapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject

class GetMealDetailsUseCase
@Inject
constructor(private val repository: MealDetailsRepository){

    operator fun invoke(id: String): Flow<Resource<MealDetails>> = flow {

        try {

            emit(Resource.Loading())

            val response = repository.getMealDetails(id).meals[0].toDomainMealDetails()

            emit((Resource.Success(data = response)))

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