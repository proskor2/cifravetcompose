package store.dide.cifravetcompose.ui.screens

import android.nfc.NfcAdapter
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.data.singletons.FirestoreGetSingletone
import store.dide.cifravetcompose.ui.components.*
import store.dide.cifravetcompose.ui.navigation.MainNavigation
import store.dide.cifravetcompose.ui.theme.PrimaryColor
import store.dide.cifravetcompose.ui.theme.Typography

@Composable
fun StartScreen(navController: NavController) {
    val openDialog = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {

        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .clickable {

                },
            contentAlignment = Alignment.TopEnd

        ) {
            buttonQR()
        }

        Spacer(
            modifier = Modifier
                .padding(all = 20.dp)
        )

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


        ButtonGreenConnect(
            title = stringResource(id = R.string.button_connect),
            mutableState = openDialog
        )
        if (openDialog.value) {
            alertNFC(openDialog)
        }


        Divider(
            modifier = Modifier
                .padding(20.dp)
        )

        Spacer(
            modifier = Modifier
                .padding(top = 20.dp)
        )

        Text(text = stringResource(id = R.string.text_nocards),
            modifier = Modifier
                .clickable {
                    if (FirestoreGetSingletone.listShops.isEmpty()) {
                        navController.navigate("empty_shop_screen")
                    } else {
                        navController.navigate("shop_screen")
                    }

                })

        Spacer(
            modifier = Modifier
                .padding(top = 20.dp)
        )

        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier
                .padding(20.dp)
                .clickable {
                    navController.navigate("pin_screen")
                }
        ) {
            Text(
                text = stringResource(id = R.string.ihavepets),
            )
        }
    }


}


@Preview(showBackground = true)
@Composable
fun ShowStartScreen() {
    StartScreen(rememberNavController())
}


