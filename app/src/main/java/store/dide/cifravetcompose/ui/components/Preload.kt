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
fun showPreload() {
    Image(
        painter = painterResource(id = R.drawable.iconvet), contentDescription = "preload",
        alignment = Alignment.Center, modifier = Modifier
            .size(75.dp, 75.dp)
    )
}

@Preview
@Composable
fun previewPreload(){
    showPreload()
}