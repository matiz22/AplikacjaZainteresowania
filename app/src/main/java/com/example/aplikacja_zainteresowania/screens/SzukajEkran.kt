package com.example.aplikacja_zainteresowania.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SzukajScreen() {
    var name by remember {
        mutableStateOf("")
    }
    var surname by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.size(20.dp))
        TextField(label = { Text(text = "Imie") }, value = name, onValueChange = {
            name = it
        }
        )
        Spacer(modifier = Modifier.size(20.dp))
        TextField(label = { Text(text = "Imie") }, value = surname, onValueChange = {
            surname = it
        }
        )
        Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = { /*TODO*/ }) {
          Text(text = "Szukaj po imieniu")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Szukaj po nazwisku")
        }
    }

}