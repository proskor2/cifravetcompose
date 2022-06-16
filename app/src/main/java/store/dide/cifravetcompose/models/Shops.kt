package store.dide.cifravet.models

import android.icu.text.DateFormat

data class Shops(
    val created: DateFormat,
    val deleted: Boolean,
    val description: String,
    val link: String,
    val logo: String, //Base64
    val logoDark: String, //Base64
    val name: String,
    val priority: Int,
    val updated: DateFormat
)
