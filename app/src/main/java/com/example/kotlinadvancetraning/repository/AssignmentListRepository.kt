package com.example.kotlinadvancetraning.repository


import com.example.kotlinadvancetraning.ApiInterface
import com.example.kotlinadvancetraning.model.AssignmentModel
import com.example.kotlinadvancetraning.model.NetworkResult
import com.example.kotlinadvancetraning.model.ResultError
import com.example.kotlinadvancetraning.model.ResultSuccess
import javax.inject.Inject

class AssignmentListRepository @Inject constructor(private val apiInterface: ApiInterface) {

    suspend fun getAssignment(): NetworkResult<List<AssignmentModel>> {
    return try {
        ResultSuccess(apiInterface.getAssignment())
    } catch (e: Exception) {
        ResultError(e)
    }
}

}