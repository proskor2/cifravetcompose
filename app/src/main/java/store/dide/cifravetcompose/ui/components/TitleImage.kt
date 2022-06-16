package store.dide.cifravetcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.R

@Composable
fun titleImage() {
    Image(
        painter = painterResource(id = R.drawable.titlevet),
        contentDescription = "logovet",
        alignment = Alignment.Center,
        modifier = androidx.compose.ui.Modifier
            .size(200.dp, 50.dp)
    )
}


@Composable
@Preview
fun showTitleImage() {
    titleImage()
}