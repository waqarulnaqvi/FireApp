package com.mysteriouscoder.fireapp.ui.screens.register

import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.mysteriouscoder.fireapp.service.AuthService
import com.mysteriouscoder.fireapp.ui.screens.login.LoginEvent
import com.mysteriouscoder.fireapp.ui.screens.login.LoginUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RegisterViewModel: ViewModel()
{
    private val _state= MutableStateFlow(RegisterState())
    val state=_state.asStateFlow()

    private val authservice=AuthService()
    fun onEvent(event: RegisterEvent)
    {
        when(event)
        {
            RegisterEvent.OnNavigateLogin -> TODO()
            RegisterEvent.OnSaveUser-> {

                authservice.register(state.value)
            }
            is RegisterEvent.SetConfirmPassword -> {
                _state.update { it.copy(confirmPassword = event.confirmPassword) }
            }
            is RegisterEvent.SetEmail -> {

                _state.update { it.copy(email = event.email)
                }
            }
            is RegisterEvent.SetPassword -> {
                _state.update { it.copy(password = event.password)
                }

            }
            is RegisterEvent.SetUsername -> {
                _state.update { it.copy(username = event.username)
                }

            }
        }
    }
}