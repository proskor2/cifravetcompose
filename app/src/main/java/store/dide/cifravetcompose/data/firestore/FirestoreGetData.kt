package store.dide.cifravetcompose.data.firestore

import android.util.Log

fun firestoreGetData(collection: String){
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection)
        .get()
        .addOnSuccessListener { result ->
            for (document in result){
                Log.d(TAG, "${document.id} -> ${document.data}")
            }
        }
        .addOnFailureListener { it ->
            Log.w(TAG, "Error get data", it)
        }
}