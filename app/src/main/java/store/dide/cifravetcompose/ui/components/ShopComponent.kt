package store.dide.cifravetcompose.ui.components

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.data.convertToBitmap

@Composable
fun ShopComponent(name: String, description: String, logo: String) {
    Card(
        modifier = Modifier
            .size(350.dp, 80.dp)
            .clickable {

            },
        elevation = 4.dp,
        shape = RoundedCornerShape(10.dp)
    ) {
        Image(bitmap = convertToBitmap(logo).asImageBitmap(), contentDescription = "logo")
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            horizontalAlignment = Alignment.Start
        )
        {
            androidx.compose.material.Text(text = name)
            androidx.compose.material.Text(text = description)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun showShopComp() {
    ShopComponent(name = "123", description = "123", logo = "")
}
