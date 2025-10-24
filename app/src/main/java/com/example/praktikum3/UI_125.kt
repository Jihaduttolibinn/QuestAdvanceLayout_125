package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp



@Composable
fun ActivasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            stringResource(R.string.Prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = modifier.height(height = 25.dp))

        // Kartu informasi
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                val gambar = painterResource(id = R.drawable.img)

                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(7.dp)
                )

                Spacer(modifier = Modifier.width(30.dp))


                // Column mengambil sisa ruang, teks berada di tengah secara vertikal & horizontal
                Column(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(vertical = 27.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 25.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = stringResource(id = R.string.Alamat),
                        fontSize = 25.sp,
                        color = Color.Yellow
                    )

                }
            }
        }
        // Kartu informasi 2
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(10.dp)
            ){

            }
        }
    }
}






