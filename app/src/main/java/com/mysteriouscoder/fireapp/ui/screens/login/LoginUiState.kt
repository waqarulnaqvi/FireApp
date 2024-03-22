package com.mysteriouscoder.fireapp.ui.screens.login

import android.provider.ContactsContract.CommonDataKinds.Email

data class LoginUiState(
    val email: String="",
    val password:String="",
    var isLoading: Boolean=false,
    var error:String="",
    var isLoginSuccess:Boolean=false
    )
