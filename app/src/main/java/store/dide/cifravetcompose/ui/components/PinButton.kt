package store.dide.cifravetcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import store.dide.cifravetcompose.ui.screens.PinScreen
import store.dide.cifravetcompose.ui.theme.Typography

@Composable
fun PinButton(digit: Int) {
    Surface(
        modifier = Modifier
            .size(50.dp, 50.dp)
            .padding(10.dp)
            .clickable { },
        shape = CircleShape,
    ) {
        Text(
            text = digit.toString(),
            style = Typography.h5,
            modifier = Modifier
                .size(40.dp, 40.dp),
            textAlign = TextAlign.Center
        )
    }
}


@Preview(showBackground = true)
@Composable
fun showPinButton() {
    PinButton(8)
}