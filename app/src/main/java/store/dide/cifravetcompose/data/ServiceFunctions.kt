package store.dide.cifravetcompose.data

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import com.bumptech.glide.Glide
import store.dide.cifravetcompose.ui.components.alertNFC


fun convertToBitmap(string: String): Bitmap{
    val imageBytes = android.util.Base64.decode(string, 0)
    val image = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
    return image
}
