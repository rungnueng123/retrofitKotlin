package com.rungnueng.restfulnodejsproject.activity.activity.Activities.manager

import com.rungnueng.restfulnodejsproject.activity.activity.Activities.dao.StyleDao
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceAPI {

    @GET("posts")
//    @GET("api/style")
    fun getAllStyle(
        @Query("id") id: Int // ส่งค่าแบบ GET Url
    ): Observable<List<StyleDao>>
//    fun getAllStyle(): Observable<List<StyleDao>>
}