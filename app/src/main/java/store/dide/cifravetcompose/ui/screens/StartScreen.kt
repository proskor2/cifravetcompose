package store.dide.cifravetcompose.ui.screens

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
import store.dide.cifravetcompose.ui.components.ButtonNext
import store.dide.cifravetcompose.ui.components.buttonQR
import store.dide.cifravetcompose.ui.components.logoImage
import store.dide.cifravetcompose.ui.components.titleImage

@Composable
fun startScreen() {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            buttonQR()
            titleImage()
            Spacer(modifier = Modifier
                .padding(top = 20.dp))
            logoImage()
            Spacer(modifier = Modifier
                .padding(top = 20.dp))
            ButtonNext(title = stringResource(id = R.string.button_connect))
            Divider(modifier = Modifier
                .padding(20.dp))
            Spacer(modifier = Modifier
                .padding(top = 20.dp))
            Text(text = stringResource(id = R.string.text_nocards))
            Spacer(modifier = Modifier
                .padding(top = 20.dp))
            Text(text = stringResource(id = R.string.ihavepets))
        }
    }



@Preview (showBackground = true)
@Composable
fun showStartScreen() {
    startScreen()
}


