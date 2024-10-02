package com.wtt.wttapp.ui.model

data class User(
    val id: String,
    val username: String,
    val email: String,
    val profilePictureUrl: String? = null  // Optional profile picture
)
