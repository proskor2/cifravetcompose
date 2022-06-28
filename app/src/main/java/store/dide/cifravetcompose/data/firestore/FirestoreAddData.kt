package store.dide.cifravetcompose.data.firestore

import android.util.Log


fun <T> firestireAddData(collection: String, data: Class<T>){
    val TAG = "FSDB"
    FirestoreDB().db.collection(collection)
        .add(data)
        .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
        }
        .addOnFailureListener { error ->
            Log.w(TAG, "Error add data", error)
        }
}