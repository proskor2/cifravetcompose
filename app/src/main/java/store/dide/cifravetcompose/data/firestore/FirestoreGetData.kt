package store.dide.cifravetcompose.data.firestore

import android.util.Log

fun <T> firestoreGetData(collection: String, typeClass: Class<T>) {
    val TAG = "FSDB"
    val dataArray = arrayListOf<T>()
    FirestoreDB().db.collection(collection)
        .get()
        .addOnSuccessListener { result ->
            for (document in result){
                val data = document.data as T
                dataArray.add(data)
            }
            return@addOnSuccessListener
        }
        .addOnFailureListener { it ->
            Log.w(TAG, "Error get data", it)
        }

}
