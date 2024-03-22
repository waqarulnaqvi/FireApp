package com.mysteriouscoder.fireapp.ui.screens.login

sealed class LoginEvent{
    data class SetEmail(val email: String):LoginEvent()
    data class SetPassword(val password: String) :LoginEvent()
    data object OnLogin : LoginEvent()
    data object OnNavigationToRegister :LoginEvent()

}
