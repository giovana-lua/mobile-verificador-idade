package com.aulasandroid.veridicadordeidade

import android.R.attr.onClick
import android.R.attr.text
import android.os.Bundle
import android.util.Log.i
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

    var idade by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {

            //Spacer(modifier = Modifier.height(12.dp))
            Row ( modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "Qual é a sua idade?",
                    color = Color.Blue,
                    fontSize = 32.sp
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
                ) {
                Text(
                    text = "Aperte os botões para informar sua idade",
                    color = Color.Black
                )
            }


        Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "${idade}",
                    fontSize = 32.sp

                    )
            }
        Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ) {

                Button(

                    onClick = { idade --},
                    shape = RoundedCornerShape( 10.dp, 10.dp, 10.dp, 10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(63, 67, 197, 255)
                    )

                ){
                    Text( text = "-",
                        fontSize = 24.sp)
                }

            Spacer(modifier = Modifier.width(10.dp))

                Button(
                    onClick = {idade ++},
                    shape = RoundedCornerShape( 10.dp, 10.dp, 10.dp, 10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(63, 67, 197, 255)
                    )
                    ) {
                    Text( text = "+",
                        fontSize = 24.sp)
                }

            }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier) {
            Text(
                text = "Você é ${if ( idade >= 18 ) "MAIOR" else if ( idade <= -1 || idade > 180) "XXX" else "MENOR" } de idade",
                fontSize = 24.sp,
                color = Color.Blue
            )

        }
    }
}

