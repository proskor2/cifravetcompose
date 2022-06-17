package store.dide.cifravetcompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.components.*

@Composable
fun StartScreen() {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable { }
    ) {
        buttonQR()
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        titleImage()
        Spacer(
            modifier = Modifier
                .padding(all = 20.dp)
        )
        logoImage()
        Spacer(
            modifier = Modifier
                .padding(all = 20.dp)
        )
        ButtonGreen(title = stringResource(id = R.string.button_connect))
        Divider(
            modifier = Modifier
                .padding(20.dp)
        )
        Spacer(
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(text = stringResource(id = R.string.text_nocards))
        Spacer(
            modifier = Modifier
                .padding(top = 20.dp)
        )
    }

    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .clickable { }
    ) {
        Text(
            text = stringResource(id = R.string.ihavepets),
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ShowStartScreen() {
    StartScreen()
}


