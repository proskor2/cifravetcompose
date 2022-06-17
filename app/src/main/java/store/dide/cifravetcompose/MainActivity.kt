package store.dide.cifravetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import store.dide.cifravetcompose.ui.theme.CifravetcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CifravetcomposeTheme {
                Column() {

                }
                }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CifravetcomposeTheme {

    }
}