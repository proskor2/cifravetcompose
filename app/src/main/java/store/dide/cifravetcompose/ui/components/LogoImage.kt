package store.dide.cifravetcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R

@Composable
fun logoImage(){
    Image(
        painter = painterResource(id = R.drawable.logovet),
        contentDescription = "logovet",
        alignment = Alignment.Center,
        modifier = Modifier
            .size(151.dp, 176.dp)
    )
}

@Composable
@Preview
fun showlogoImage() {
    logoImage()
}