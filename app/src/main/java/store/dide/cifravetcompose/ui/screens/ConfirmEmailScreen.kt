package store.dide.cifravetcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.components.ButtonGreen175
import store.dide.cifravetcompose.ui.theme.Typography

@Composable
fun ConfirmEmailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.change_pin_text),
            style = Typography.h3,
            modifier = Modifier
                .padding(10.dp)
        )
        TextField(
            value = stringResource(id = R.string.email), onValueChange = { },
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth(),
        )

        Spacer(modifier = Modifier
            .padding(30.dp))
        Image(
            painter = painterResource(id = R.drawable.email),
            contentDescription = "email",
            modifier = Modifier
                .size(150.dp, 142.dp)
        )
        Spacer(modifier = Modifier
            .padding(50.dp))
        ButtonGreen175(title = stringResource(id = R.string.button_change_pin))
    }

}


@Preview(showBackground = true)
@Composable
fun showConfirmEmailScreen() {
    ConfirmEmailScreen()
}