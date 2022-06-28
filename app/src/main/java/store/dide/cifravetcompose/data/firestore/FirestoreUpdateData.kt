package store.dide.cifravetcompose.data.firestore

import android.util.Log

fun <T> firestoreUpdateData(
    collection: String,
    document: String,
    data: Class<T>,
    field: String,
    value: Any
) {
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection).document(document)
        .update(field, value)
        .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully updated!") }
        .addOnFailureListener { e -> Log.w(TAG, "Error updating document", e) }
}