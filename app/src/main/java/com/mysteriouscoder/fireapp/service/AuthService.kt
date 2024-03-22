package com.mysteriouscoder.fireapp.service


import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.userProfileChangeRequest
import com.google.firebase.ktx.Firebase
import com.mysteriouscoder.fireapp.ui.screens.login.LoginUiState
import com.mysteriouscoder.fireapp.ui.screens.register.RegisterEvent
import com.mysteriouscoder.fireapp.ui.screens.register.RegisterState

class AuthService(
    private val auth: FirebaseAuth = Firebase.auth,
) {
    fun login(state: LoginUiState) {
        auth.signInWithEmailAndPassword(state.email, state.password).addOnFailureListener {
            state.error = it.message ?: "An error occurred"
            state.isLoading = false
        }.addOnSuccessListener {
            state.isLoading = false
            state.error = ""
            state.isLoginSuccess = true
        }
    }

    fun register(state: RegisterState) {
        auth.createUserWithEmailAndPassword(state.email, state.password)
            .addOnFailureListener {
                state.error = it.message ?: "An error occurred"
                state.isLoading = false
            }.addOnSuccessListener {
                state.isLoading = false
                state.error = ""
                state.isRegisterSuccess = true
                val profileUpdates = userProfileChangeRequest { displayName = state.username }
                it.user?.updateProfile(profileUpdates)
            }
    }

    fun isUserLoggedIn() = auth.currentUser != null


}
