package com.example.mainactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainactivity.ui.theme.MainActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MainActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        tiara = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable

fun BasicCompose(tiara: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Login", modifier = tiara,
            fontSize = 25.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Ini halaman login",
            fontSize = 25.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )

        Image(
            painter = painterResource(id = R.drawable.logoumy),
            contentDescription = null,
            Modifier.size(250.dp)
        )
        Text(
            text = "Nama",)

        Text(
            text = "Tiara Hasna Nabila",
            fontSize = 25.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif)

        Text(text = "20220140004",
            fontSize = 25.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )

        Image(painter = painterResource(id = R.drawable.fotonya),
            contentDescription = null,
            Modifier.size(270.dp))
    }
    }




//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MainActivityTheme {
//        Greeting("Android")
//    }
//}