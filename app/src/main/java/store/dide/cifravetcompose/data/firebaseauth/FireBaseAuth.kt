package store.dide.cifravetcompose.data.firebaseauth

import android.app.Activity
import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class FireBaseAuth() {

    val TAG = "FBAuth"

    fun signInAnonimously(auth: FirebaseAuth, context: Context) {
        auth.signInAnonymously()
            .addOnCompleteListener() { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "signInAnonymously:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    Log.w(TAG, "signInAnonymously:failure", task.exception)
//                    Toast.makeText(baseContext, "Authentication failed.",
//                        Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
    }


     fun updateUI(user: FirebaseUser?) {

    }
}