package kr.co.moreversal.grapthathoe.network.api

import kr.co.moreversal.grapthathoe.network.request.ConfirmRequest
import kr.co.moreversal.grapthathoe.network.request.JoinRequest
import kr.co.moreversal.grapthathoe.network.request.LoginRequest
import kr.co.moreversal.grapthathoe.network.response.ConfirmResponse
import kr.co.moreversal.grapthathoe.network.response.JoinResponse
import kr.co.moreversal.grapthathoe.network.response.LoginResponse
import kr.co.moreversal.grapthathoe.network.response.PhoneResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Sign {
    @GET("auth/phone/{phone}")
    fun phone(@Path("phone") phone: Int): Call<PhoneResponse>

    @POST("auth/phone/{phone}")
    fun confirm(@Body confirmRequest: ConfirmRequest, @Path("phone") phone: Int): retrofit2.Call<ConfirmResponse>

    @POST("auth/join")
    fun join(@Body joinRequest: JoinRequest) : retrofit2.Call<JoinResponse>

    @POST("auth/login")
    fun login(@Body loginRequest: LoginRequest) : retrofit2.Call<LoginResponse>
}