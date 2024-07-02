package com.example.tickets_app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tickets_app.R
import com.example.tickets_app.ui.theme.Tickets_appTheme


@Composable
fun InfoAppScaffold() {
    Scaffold(modifier = Modifier,
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.plane),
                                modifier = Modifier,
                                contentDescription = ""
                            )
                            Text(
                                text = "Авиабилеты",
                                fontSize = 10.sp
                            )
                        }
                    }
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.bed),
                                modifier = Modifier,
                                contentDescription = ""
                            )
                            Text(
                                text = "Отель",
                                fontSize = 10.sp
                            )
                        }
                    }
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.place),
                                modifier = Modifier,
                                contentDescription = ""
                            )
                            Text(
                                text = "Короче",
                                fontSize = 10.sp
                            )
                        }
                    }
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.bell),
                                modifier = Modifier,
                                contentDescription = ""
                            )
                            Text(
                                text = "Подписки",
                                fontSize = 10.sp
                            )
                        }
                    }
                    IconButton(
                        onClick = {}, modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    ) {
                        Column(
                            modifier = Modifier,
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.profile),
                                modifier = Modifier,
                                contentDescription = ""
                            )
                            Text(
                                text = "Профиль",
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            }
        }
    ) { innerPaddingValues ->
        HomeScreen(innerPaddingValues)
    }
}

@Composable
fun HomeScreen(innerPaddingValues: PaddingValues) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        HardcodeTextOne()
        Spacer(modifier = Modifier.height(50.dp))
        ChoosingCityBoard()
        Spacer(modifier = Modifier.height(50.dp))
        HardcodeTextTwoWithScreens()
        Spacer(modifier = Modifier.height(40.dp))
        HardcodeTextThree()
    }

}

@Composable
fun HardcodeTextOne() {
    Box(
        modifier = Modifier
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Поиск дешевых авиабилетов",
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .height(52.dp)
                .width(172.dp)
                .wrapContentSize(Alignment.Center)
        )
    }
}

@Composable
fun ChoosingCityBoard() {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier.wrapContentSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.icon),
                contentDescription = "",
                modifier = Modifier
            )
            Column {
                TextField(value = "Откуда - Москва", onValueChange = {})
                TextField(value = "Куда - Турция", onValueChange = {})
            }
        }
    }
}

@Composable
fun HardcodeTextTwoWithScreens() {
    Column {
        Text(
            text = "Музыкально отлететь",
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(15.dp))
        BodyOfCells()
        Spacer(modifier = Modifier.height(15.dp))
        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Показать все места", fontSize = 16.sp)
        }

    }
}

@Composable
fun HardcodeTextThree() {
    Text(text = "Ваш первый раз", fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
}



@Composable
fun BodyOfCells() {
    LazyRow {
        items(10) { item ->
            Cell()
            Spacer(modifier = Modifier.width(70.dp))
        }
    }
}


@Composable
fun Cell() {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.test_img),
            contentDescription = "",
            modifier = Modifier.size(132.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Leopard",
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
        )
        Text(
            text = "Jungle", modifier = Modifier.padding(bottom = 5.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.W400
        )
        Row() {
            Icon(painter = painterResource(id = R.drawable.mini_icon), contentDescription = "")
            Text(
                text = "от 22.300",
                fontSize = 14.sp,
                fontWeight = FontWeight.W400
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tickets_appTheme {
        InfoAppScaffold()
    }
}