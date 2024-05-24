package com.learning.diceroller.pages

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.diceroller.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


class HomeScreen : ComponentActivity() {

    @Composable
    fun HomeScreenApp(modifier: Modifier = Modifier) {
        var result by remember {
            mutableStateOf(1)
        }
        val imageResource = when (result) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(painter = painterResource(imageResource), contentDescription = "diceRoll")
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /*TODO*/
                    result = (1..6).random()
//                    getRandomRoll()
                },
            ) {
                Text(stringResource(R.string.roll))
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun HomeScreenPreview() {
        HomeScreenApp(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center),
        )
    }

//    private fun getRandomRoll() {
//        result = (1..6).random()
//    }
}

