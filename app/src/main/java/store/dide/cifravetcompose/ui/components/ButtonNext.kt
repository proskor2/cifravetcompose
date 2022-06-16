package store.dide.cifravetcompose.ui.components

import android.text.style.ForegroundColorSpan
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import store.dide.cifravetcompose.R
import store.dide.cifravetcompose.ui.theme.PrimaryColor
import store.dide.cifravetcompose.ui.theme.Typography


@Composable
fun ButtonNext(title: String) {
    Button(modifier = Modifier
        .size(150.dp, 50.dp)
        .padding(1.dp)
        ,
        onClick = { },
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.textButtonColors(PrimaryColor),

    ) {
        Text(text = title,
        color = Color.White,
        fontSize = 17.sp,
        fontFamily = Typography.body1.fontFamily)
    }
}


@Preview(showBackground = true)
@Composable
fun showButton() {
    ButtonNext(title = "Подключить")
}

