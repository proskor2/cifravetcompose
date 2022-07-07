package store.dide.cifravet.models


import com.google.firebase.Timestamp

data class Shops(
    val created: Timestamp?,
    val deleted: Boolean?,
    val description: String?,
    val link: String?,
    val logo: String?, //Base64
    val logoDark: String?, //Base64
    val name: String?,
    val priority: Long?,
    val updated: Timestamp?
){

}
