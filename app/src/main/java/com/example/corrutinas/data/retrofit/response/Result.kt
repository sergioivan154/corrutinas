package com.example.corrutinas.data.retrofit.response

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("_id")
    val id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded: String,
    val dateModified: String,
    val length: Int,
    val tags: List<String>
)