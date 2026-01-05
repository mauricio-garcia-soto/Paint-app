    package com.example.myapplication

    import android.os.Bundle
    import android.print.PrintAttributes
    import android.view.Gravity
    import android.webkit.WebSettings
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.width
    import androidx.compose.material3.Button
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.BiasAlignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.geometry.Size
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.navigation.NavController
    import androidx.navigation.compose.rememberNavController


    @Composable
    fun pantallaInicio(navController: NavController ) {
            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ){
                Text("Bienvenido al Paint de Mauricio", fontSize = 20.sp)
                    Row(modifier = Modifier.padding(16.dp)){
                        Button(onClick = {
                            navController.navigate("Funcionamiento")
                        }, modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 16.dp)) {
                            Text("Funcionamineto")

                        }
                        Button(onClick = {
                            navController.navigate("MainActivity")
                        }, modifier = Modifier.padding(start = 20.dp, 16.dp,)) {
                            Text("Paint")
                        }
                    }

                }

            }

    @Preview(showBackground = true)
    @Composable
    fun pantallaInicioPreview() {
        val navController = rememberNavController()
        pantallaInicio(navController)
    }