package com.example.appauladb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.Room
import com.example.appauladb.roomDB.PessoaDataBase
import com.example.appauladb.ui.theme.APPaulaDbTheme

class MainActivity : ComponentActivity() {
    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            PessoaDataBase::class.java,
            "pessoa.bd"
        ).build()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APPaulaDbTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    var nome by remember {
        mutableStateOf("")
    }
    var telefone by remember {
        mutableStateOf("")
    }

    Column(
        Modifier.background(Color.White)
            .fillMaxSize()
    ) {
        Row (
            Modifier
                .background(Color.White)
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App Cadastro Cliente",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }

        padding()

        Row (
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text(text = "Nome:")},
            )
        }

        padding()

        Row (
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = {Text(text = "Telefone:")},
            )
        }
        
        padding()
        
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cadastrar")
            }
        }


    }
}

@Composable
fun padding(){
    Row (
        Modifier
            .padding(20.dp)
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    App()
}