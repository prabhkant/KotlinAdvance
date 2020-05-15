package com.example.kotlinadvancetraning

import com.example.kotlinadvancetraning.model.AssignmentModel
import retrofit2.http.GET


interface ApiInterface {

    @GET("/todos")
    suspend fun getAssignment(): List<AssignmentModel>

}