package com.aulasandroid.veridicadordeidade

import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.veridicadordeidade.ui.theme.VeridicadorDeIdadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VeridicadorDeIdadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    verificarIdade(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun verificarIdade (modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),


    ) {
        Column( modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Column( modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text( modifier = Modifier
                    .fillMaxWidth()
                    ,
                    text = "Qual é a sua idade?",
                    color = Color.Blue,
                    fontSize = 32.sp
                )
                Text( modifier = Modifier
                    .fillMaxWidth(),
                    text = "Aperte os botões para informar sua idade",
                    color = Color.Black
                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {},

                ) {
                    Text( text = "-")
                }

                Button(
                    onClick = {},

                    ) {
                    Text( text = "+")
                }

            }
            Text(text = "Você é ... de idade")
        }
    }
}