package com.rungnueng.restfulnodejsproject.activity.activity.Activities.dao

import com.google.gson.annotations.SerializedName

data class StyleDao(
//    @SerializedName("courseStyleID") val id: String,
//    @SerializedName("courseStyleName") val name: String,
//    @SerializedName("courseStyleDesc") val desc: String,
//    @SerializedName("courseStyleImage") val image: String
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
)