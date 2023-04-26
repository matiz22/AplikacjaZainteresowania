package com.example.aplikacja_zainteresowania.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.aplikacja_zainteresowania.ZainteresowaniaViewModel
import com.example.aplikacja_zainteresowania.data.Tabela

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DodajScreen(navController: NavHostController, viewModel: ZainteresowaniaViewModel) {
    val context = LocalContext.current
    var plec by remember { mutableStateOf(true) }
    var muzyka by remember { mutableStateOf(false) }
    var film by remember { mutableStateOf(false) }

    var name by remember {
        mutableStateOf("")
    }
    var surname by remember {
        mutableStateOf("")
    }


    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.size(30.dp))
        Row() {
            RadioButton(
                selected = plec,
                onClick = { plec = true },
                modifier = Modifier.semantics { contentDescription = "Localized Description" }
            )
            Text(text = "Kobieta")
        }
        Row() {
            RadioButton(
                selected = !plec,
                onClick = { plec = false },
                modifier = Modifier.semantics { contentDescription = "Localized Description" }
            )
            Text(text = "Chłop")
        }

        Spacer(modifier = Modifier.size(20.dp))
        TextField(label = { Text(text = "Imie") }, value = name, onValueChange = {
            name = it
        }
        )
        Spacer(modifier = Modifier.size(20.dp))
        TextField(label = { Text(text = "Nazwisko") }, value = surname, onValueChange = {
            surname = it
        }
        )
        Row() {
            Checkbox(
                checked = muzyka,
                onCheckedChange = { muzyka = it }
            )
            Text(text = "Muzyka")
        }
        Row() {
            Checkbox(
                checked = film,
                onCheckedChange = { film = it }
            )
            Text(text = "Film")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = {
            viewModel.insert(Tabela(imie = name, nazwisko = surname, plec = plec, muzyka = muzyka, film = film))
            Toast.makeText(context, "Zapisano", Toast.LENGTH_LONG).show()
        }) {
            Text(text = "Zapisz")
        }

    }

}