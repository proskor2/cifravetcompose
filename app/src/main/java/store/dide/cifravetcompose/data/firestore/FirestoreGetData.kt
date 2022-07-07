package store.dide.cifravetcompose.data.firestore

import android.util.Log
import com.google.firebase.Timestamp
import store.dide.cifravet.models.Shops
import store.dide.cifravetcompose.data.singletons.FirestoreGetSingletone


fun <T> firestoreGetData(collection: String, typeClass: Class<T>, arrayList: ArrayList<T>) {
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection)
        .get()
        .addOnSuccessListener {
            val listDocs = it.documents
            for (doc in listDocs) {
                Log.w(TAG, "${doc.id} --->>> ${doc.data}")
            }
            Log.w(TAG, "Success get data")
        }
        .addOnFailureListener { it ->
            Log.w(TAG, "Error get data", it)
        }
}



fun firestoreGetDataShops(collection: String) {
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection)
        .whereNotEqualTo("logo", null)
        .get()
        .addOnSuccessListener {
            val listDocs = it.documents
            for (doc in listDocs) {
                val data = doc.data
                val created = data?.get("created")
                val deleted = data?.get("deleted")
                val description = data?.get("description")
                val link = data?.get("link")
                val logo = data?.get("logo")
                val logoDark = data?.get("logoDark")
                val name = data?.get("name")
                val priority = data?.get("priority")
                val updated = data?.get("updated")
                val shop: Shops = Shops(
                    created = created as Timestamp?,
                    deleted = deleted as Boolean?,
                    description = description as String?,
                    link = link as String?,
                    logo = logo as String?,
                    logoDark = logoDark as String?,
                    name = name as String?,
                    priority = priority as Long?,
                    updated = updated as Timestamp?
                )
                FirestoreGetSingletone.listShops.add(shop)
            }
            Log.w(TAG, "Success get data")
        }
        .addOnFailureListener { it ->
            Log.w(TAG, "Error get data", it)
        }
}
