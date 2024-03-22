package com.mysteriouscoder.fireapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mysteriouscoder.fireapp.ui.screens.login.LoginScreen
import com.mysteriouscoder.fireapp.ui.screens.login.LoginViewModel
import com.mysteriouscoder.fireapp.ui.screens.register.RegisterScreen

enum class Screen(val route:String){
    Home("Home"),
    Login("login"),
    Register("register"),
    Notes("notes"),
    Document("documents")
}

@Composable
fun AppNaviagation() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route )
    {
        composable(Screen.Login.route)
        {
            val vm:LoginViewModel= viewModel()
            LoginScreen(state=vm.state.collectAsState().value,
                onEvent=vm::onEvent)

        }
        composable(Screen.Register.route)
        {
            val vm:LoginViewModel= viewModel()
            RegisterScreen(
                state =vm.state.collectAsState().value,
                onEvent =vm::onEvent)
        }
        composable(Screen.Home.route)
        {

        }
        composable(Screen.Notes.route)
        {

        }
        composable(Screen.Document.route)
        {

        }
    }

}