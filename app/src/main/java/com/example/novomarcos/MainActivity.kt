package com.example.novomarcos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.novomarcos.ui.theme.NovoMarcosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NovoMarcosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {

     //Image(painter = painterResource(id = R.drawable.ciberseguranca_fccn), contentDescription = "", modifier = Modifier.size(48.dp))
    }
    Row {
        Column {
            Text(text = "Marcos Araujo")
            Text(text = "2023/10/19")
        }
        Image(
            painter = painterResource(id = R.drawable.ciberseguranca_fccn),
            contentDescription = "",
            modifier = Modifier.size(48.dp))


    }
 
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NovoMarcosTheme {
        Greeting("Android")
    }
}