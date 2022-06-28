package store.dide.cifravetcompose

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase
import store.dide.cifravetcompose.data.firebaseauth.FireBaseAuth
import store.dide.cifravetcompose.data.firestore.firestoreGetData
import store.dide.cifravetcompose.ui.navigation.MainNavigation
import store.dide.cifravetcompose.ui.theme.CifravetcomposeTheme

class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CifravetcomposeTheme {
               MainNavigation()
            }
        }
// authorization initialization
        auth = FirebaseAuth.getInstance()
        FireBaseAuth().signInAnonimously(auth, this)
    }

    override fun onStart() {
        super.onStart()
// authorization check user
        val currentUser = auth.currentUser
        FireBaseAuth().updateUI(currentUser)
        if (currentUser != null)
        {
            Log.d("FBAuth", "UID -> ${currentUser.uid}")
// get data Shops
            firestoreGetData("shops")
        } else {
            Toast.makeText(this, getString(R.string.autherror), Toast.LENGTH_LONG).show()
        }

    }

}
