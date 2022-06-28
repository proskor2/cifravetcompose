package store.dide.cifravetcompose.data.firestore

import android.util.Log
import com.google.firebase.firestore.FieldValue

fun firestoreDeleteDataDocument(collection: String, document: String) {
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection).document(document)
        .delete()
        .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully deleted!") }
        .addOnFailureListener { e -> Log.w(TAG, "Error deleting document", e) }
}


fun firestoreDeleteDataField(collection: String, document: String, field: String) {
    val TAG = "FSDB"
    val doc = FirestoreDB().db.collection(collection).document(document)
    val updates = hashMapOf<String, Any>(field to FieldValue.delete())
    doc.update(updates)
        .addOnCompleteListener { Log.d(TAG, "Document Field ${field} successfully deleted!") }
}