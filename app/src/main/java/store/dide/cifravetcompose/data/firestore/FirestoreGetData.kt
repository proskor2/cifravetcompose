package store.dide.cifravetcompose.data.firestore

import android.util.Log


fun <T> firestoreGetData(collection: String, typeClass: Class<T>, arrayList: ArrayList<T>) {
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection)
        .get()
        .addOnSuccessListener { it ->
            val listDocs = it.documents
            Log.w(TAG, "Success get data")
        }
        .addOnFailureListener { it ->
            Log.w(TAG, "Error get data", it)
        }
}


fun <T> firestoreGetShops() {
    val TAG = "FSDB"
    FirestoreDB().db.collection("shops")
        .get()
        .addOnSuccessListener { it ->
            val listDocs = it.documents

            Log.w(TAG, "Success get data")
        }
        .addOnFailureListener { it ->
            Log.w(TAG, "Error get data", it)
        }
}