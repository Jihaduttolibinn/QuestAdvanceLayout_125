package com.example.praktikum3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier


@Composable
fun ActivasPertama(modifier: Modifier){
    Column {
        modifier = modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAligment = Alignment.CenterHorizontally
        ){
