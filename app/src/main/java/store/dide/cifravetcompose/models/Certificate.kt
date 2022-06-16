package store.dide.cifravet.models

import android.icu.text.DateFormat

data class Certificate(
    val birthday: DateFormat,
    val breed: String,
    val color: String,
    val comment: String,
    val kind: String,
    val name:String,
    val ownerphone: String,
    val photo: String, // Base64
    val sex: String
)
