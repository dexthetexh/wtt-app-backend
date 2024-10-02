package com.wtt.wttapp.data

import com.wtt.wttapp.ui.model.User

class AuthenticationManager {
    private var currentUser: User? = null

    // Simulate login function; replace this with real authentication logic
    fun login(username: String, password: String): Result<User> {
        // Simulated backend authentication logic
        return if (username == "test" && password == "password") {
            val user = User(id = "1", username = username, email = "test@example.com")
            currentUser = user
            Result.success(user)
        } else {
            Result.failure(Exception("Invalid credentials"))
        }
    }

    // Get the current logged-in user
    fun getCurrentUser(): User? {
        return currentUser
    }

    // Logout function
    fun logout() {
        currentUser = null
    }
}
