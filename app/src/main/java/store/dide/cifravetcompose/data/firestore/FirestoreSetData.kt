package store.dide.cifravetcompose.data.firestore

import android.util.Log

fun <T> firestoreSetData(collection: String, document: String, data: Class<T>) {
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection).document(document)
        .set(data)
        .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully written!") }
        .addOnFailureListener { e -> Log.w(TAG, "Error writing document", e) }
}