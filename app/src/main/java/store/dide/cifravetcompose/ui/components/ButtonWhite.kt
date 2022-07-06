package store.dide.cifravetcompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import store.dide.cifravetcompose.ui.theme.PrimaryColor
import store.dide.cifravetcompose.ui.theme.Typography

@Composable
fun ButtonWhite(title: String, mutableList: MutableState<Boolean>){
    Button(
        modifier = Modifier
            .size(96.dp, 40.dp)
            .padding(1.dp)
            .clickable {  },
        onClick = { mutableList.value = false },
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.textButtonColors(Color.White),
        border = BorderStroke(1.dp, PrimaryColor),

        ) {
        Text(
            text = title,
            color = PrimaryColor,
            fontSize = 15.sp,
            fontFamily = Typography.body1.fontFamily
        )
    }
}

@Preview (showBackground = true)
@Composable
fun showButton(){
//    ButtonWhite(title = "Test")
}