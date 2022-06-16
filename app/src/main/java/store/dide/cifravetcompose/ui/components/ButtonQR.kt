package store.dide.cifravetcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.theme.PrimaryColor

@Composable
fun buttonQR() {
    Image(
        painter = painterResource(id = R.drawable.center_focus),
        contentDescription = "qrbutton",
        modifier = Modifier
            .size(20.dp, 20.dp),
        colorFilter = ColorFilter.tint(PrimaryColor)

    )
}