package store.dide.cifravetcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
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
import store.dide.cifravetcompose.ui.components.ButtonGreen
import store.dide.cifravetcompose.ui.components.ButtonGreenWide
import store.dide.cifravetcompose.ui.theme.Shapes

@Composable
fun EditScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            // avatar
            Box(
                modifier = Modifier
                    .size(175.dp, 175.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp),
                contentAlignment = Alignment.Center,
            ) {
                Card(
                    modifier = Modifier
                        .size(175.dp, 175.dp),
                    shape = CircleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avatarplug),
                        contentDescription = "avatarplug"
                    )
                }
                Card(
                    modifier = Modifier
                        .size(50.dp, 50.dp)
                        .align(Alignment.BottomEnd)
                        .clickable { },
                    shape = CircleShape,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.addaphoto),
                        contentDescription = "addphoto"
                    )
                }

            }

            // edittexts
            TextField(
                value = stringResource(id = R.string.kind), onValueChange = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 6.dp, end = 6.dp, bottom = 2.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
            )

            TextField(
                value = stringResource(id = R.string.name_pet), onValueChange = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 2.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
            )

            TextField(
                value = stringResource(id = R.string.breed), onValueChange = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 2.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
            )

            TextField(
                value = stringResource(id = R.string.color_pet), onValueChange = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 2.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                TextField(
                    value = stringResource(id = R.string.gender), onValueChange = { },
                    modifier = Modifier
                        .padding(6.dp)
                        .weight(1f),
                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
                )

                TextField(
                    value = stringResource(id = R.string.year_birth), onValueChange = { },
                    modifier = Modifier
                        .padding(6.dp)
                        .weight(1f),
                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_calendar),
                            contentDescription = "iccalendar"
                        )
                    }
                )
            }

            TextField(
                value = stringResource(id = R.string.phone_owner), onValueChange = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 2.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
            )

            OutlinedTextField(
                value = stringResource(id = R.string.note), onValueChange = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 2.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
            )

        }

        ButtonGreenWide(title = stringResource(id = R.string.button_save))
    }

}


@Preview(showBackground = true)
@Composable
fun showEditScreen() {
    EditScreen()
}