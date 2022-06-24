package store.dide.cifravetcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import store.dide.cifravetcompose.R

@Composable
fun ShopScreen(navController: NavController) {
    LazyColumn(modifier = Modifier
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center){

    }
}


@Composable
fun EmptyShopScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Image(painter = painterResource(id = R.drawable.nodatabox), contentDescription = "nodatashops")
        Text(text = stringResource(id = R.string.no_data))
    }
}

@Preview (showBackground = true)
@Composable
fun showShopScreen() {
//    ShopScreen()
//    EmptyShopScreen()
}