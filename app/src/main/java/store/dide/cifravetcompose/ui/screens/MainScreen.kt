package store.dide.cifravetcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.theme.PrimaryColor
import store.dide.cifravetcompose.ui.theme.Typography


@Composable
fun MainScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
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
                    painter = painterResource(id = R.drawable.avatarplug),
                    contentDescription = "AvatarEmpty"
                )
            }

            Text(
                text = stringResource(id = R.string.kind),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 2.dp),
                style = Typography.h4
            )

            Text(
                text = stringResource(id = R.string.name_pet),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                style = Typography.h6,
                color = Color.DarkGray
            )

            Text(
                text = stringResource(id = R.string.breed),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                style = Typography.h5,
                color = PrimaryColor
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = R.string.age),
                    modifier = Modifier
                        .padding(top = 10.dp, start = 6.dp),
                    style = Typography.h1
                )

                Text(
                    text = stringResource(id = R.string.gender),
                    modifier = Modifier
                        .padding(top = 10.dp, end = 6.dp),
                    style = Typography.h1
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "5 лет",
                    modifier = Modifier
                        .padding(top = 2.dp, start = 6.dp),
                    style = Typography.h3,
                    color = PrimaryColor
                )

                Text(
                    text = "Мальчик",
                    modifier = Modifier
                        .padding(top = 2.dp, end = 6.dp),
                    style = Typography.h3,
                    color = PrimaryColor
                )
            }

            Text(
                text = stringResource(id = R.string.color_pet),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 6.dp),
                style = Typography.h1,
                textAlign = TextAlign.Left
            )

            Text(
                text = "Белый",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp, start = 6.dp),
                textAlign = TextAlign.Start,
                style = Typography.h3
            )

            Text(
                text = stringResource(id = R.string.phone_owner),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp, start = 6.dp),
                style = Typography.h1,
                textAlign = TextAlign.Left
            )

            Text(
                text = "89997778888",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp, start = 6.dp),
                textAlign = TextAlign.Start,
                style = Typography.h3
            )

            Text(
                text = "Комментарий",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, start = 6.dp),
                textAlign = TextAlign.Start,
                style = Typography.h3
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun showMainScreen() {
    MainScreen()
}
