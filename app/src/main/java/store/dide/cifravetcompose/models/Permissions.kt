package store.dide.cifravet.models

import android.icu.text.DateFormat

data class Permissions(
    val created: DateFormat,
    val deleted: Boolean,
    val deviceUUID: String,
    val tagID: String,  // .../tags/asd213sdfg
    val updated: DateFormat,
    val user: String
)
