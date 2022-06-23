package store.dide.cifravetcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.components.PinButton
import store.dide.cifravetcompose.ui.theme.Typography

@Composable
fun PinScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Введите пароль",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 30.dp),
            style = Typography.h3
        )

        Row(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.pinempty),
                contentDescription = "pinempty",
                modifier = Modifier
                    .padding(5.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.pinempty),
                contentDescription = "pinempty",
                modifier = Modifier
                    .padding(5.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.pinempty),
                contentDescription = "pinempty",
                modifier = Modifier
                    .padding(5.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.pinempty),
                contentDescription = "pinempty",
                modifier = Modifier
                    .padding(5.dp)
            )
        }

        Spacer(
            modifier = Modifier
                .padding(50.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PinButton(digit = 1)
            PinButton(digit = 2)
            PinButton(digit = 3)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PinButton(digit = 4)
            PinButton(digit = 5)
            PinButton(digit = 6)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PinButton(digit = 7)
            PinButton(digit = 8)
            PinButton(digit = 9)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_visibility_off),
                contentDescription = "visibilityoff"
            )
            PinButton(digit = 0)
            Image(
                painter = painterResource(id = R.drawable.ic_backspace),
                contentDescription = "backspace"
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun showPinScreen() {
    PinScreen()
}