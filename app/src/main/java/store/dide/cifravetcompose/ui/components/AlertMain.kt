package store.dide.cifravetcompose.ui.components

import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage
import store.dide.cifravetcompose.R

@Composable
fun alertMain(mutableState: MutableState<Boolean>, title: String, text: String) {
    AlertDialog(
        onDismissRequest = {
            mutableState.value = false
        },
        title = {
            Text(text = title)
        },

        text = {
            Text(text = text)
        },
        buttons = {
            Box(
                modifier = androidx.compose.ui.Modifier
                    .padding(10.dp)
            ) {
                ButtonWhite(title = stringResource(id = R.string.button_close), mutableState)
            }
        }
    )
}
