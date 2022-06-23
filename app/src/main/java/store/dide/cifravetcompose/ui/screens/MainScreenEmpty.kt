package store.dide.cifravetcompose.ui.screens

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.components.ButtonGreen
import store.dide.cifravetcompose.ui.components.ButtonGreen175
import store.dide.cifravetcompose.ui.theme.PrimaryColor

@Composable
fun MainScreenEmpty() {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxWidth()
            .size(200.dp)
            .background(PrimaryColor)
    )
    {
        
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Card(
            shape = CircleShape,
            modifier = Modifier
                .padding(top = 65.dp)
                .size(250.dp, 250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.round_logo),
                contentDescription = "AvatarEmpty"
            )
        }

        Text(
            text = stringResource(id = R.string.pet_info_empty),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            textAlign = TextAlign.Center

        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp),
        contentAlignment = BottomCenter
    ) {
        ButtonGreen175(title = stringResource(id = R.string.button_edit))
    }
}


@Preview(showBackground = true)
@Composable
fun ShowMainScreen() {
    MainScreenEmpty()
}