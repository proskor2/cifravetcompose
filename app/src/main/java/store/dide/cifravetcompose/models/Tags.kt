package store.dide.cifravet.models

import android.icu.text.DateFormat

data class Tags(
    val certificate: Certificate,
    val created: DateFormat,
    val deleted: Boolean,
    val email: String,
    val passcode: String,
    val serial: String,
    val updated: DateFormat
)
