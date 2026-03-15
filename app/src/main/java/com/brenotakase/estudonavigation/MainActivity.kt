package com.brenotakase.estudonavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brenotakase.estudonavigation.screens.LoginScreen
import com.brenotakase.estudonavigation.screens.MenuScreen
import com.brenotakase.estudonavigation.screens.PedidosScreen
import com.brenotakase.estudonavigation.screens.PerfilScreen
import com.brenotakase.estudonavigation.ui.theme.Estudo_navigation_between_screeensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Estudo_navigation_between_screeensTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "pedidos") {
                            PedidosScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "perfil") {
                            PerfilScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}