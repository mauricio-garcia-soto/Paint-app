package com.example.myapplication


import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


@Composable
fun pantallaFuncionamiento(navController: NavController) {
    val colors = listOf(Color.Red, Color.Green, Color.Blue, Color.Black)
    val context = LocalContext.current
    val rojoFondo = Color(ContextCompat.getColor(context, R.color.redBack))
    val rojoLetra = Color(ContextCompat.getColor(context, R.color.redFont))

    Box(modifier = Modifier.fillMaxSize()) {
        IconButton(
            onClick = { navController.navigate("Inicio") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 35.dp , start = 10.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_arrow_back_ios_24),
                contentDescription = "flecha hacia atras"
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Aqui eliges el color en el que dibujaras", fontSize = 20.sp)

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(16.dp)
            ) {
                colors.forEach { color ->
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .background(color, CircleShape)
                    )
                }
            }

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                "Aqui introducimos el tamaño del cursor a la hora de pintar",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 10.dp)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .background(Color.LightGray)
                )
                Text("px", fontSize = 14.sp)
            }

            Spacer(modifier = Modifier.height(50.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = {},
                    modifier = Modifier.height(35.dp).width(75.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = rojoFondo)
                ) {
                    Text("Eraser", fontSize = 10.sp, color = rojoLetra)
                }

                Button(
                    onClick = {},
                    modifier = Modifier.height(35.dp).width(75.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = rojoFondo)
                ) {
                    Text("Reset", fontSize = 10.sp, color = rojoLetra)
                }

                Button(
                    onClick = {},
                    modifier = Modifier.height(35.dp).width(75.dp),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = rojoFondo)
                ) {
                    Text("Save", fontSize = 10.sp, color = rojoLetra)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text("- El boton Eraser sirve para borrar como si fuera una goma", Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.height(20.dp))
            Text("- El boton Reset sirve para empezar de 0")
            Spacer(modifier = Modifier.height(20.dp))
            Text("- El boton Save sirve para guardar en tu galeria el dibujo", Modifier.padding(start = 10.dp))
        }
    }
}