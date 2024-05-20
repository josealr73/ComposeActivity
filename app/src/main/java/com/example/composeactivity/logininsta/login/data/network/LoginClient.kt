package com.example.composeactivity.logininsta.login.data.network

import com.example.composeactivity.logininsta.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    // https://run.mocky.io/v3/f6d119db-ab25-4a22-8b9a-98f78dbb6aa2
    @GET("/v3/f78c9d33-28b1-4f81-9cf1-6d6ff78fa014")

    suspend fun doLogin(): Response<LoginResponse>
}