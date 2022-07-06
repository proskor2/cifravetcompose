package store.dide.cifravetcompose

import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.auth.FirebaseAuth
import store.dide.cifravet.models.Shops
import store.dide.cifravet.models.Tags
import store.dide.cifravetcompose.data.firebaseauth.FireBaseAuth
import store.dide.cifravetcompose.data.singletons.FirestoreGetSingletone
import store.dide.cifravetcompose.data.firestore.firestoreGetData
import store.dide.cifravetcompose.data.singletons.UIDs
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
// authorization initialization and set UUID device and uesr
        auth = FirebaseAuth.getInstance()
        FireBaseAuth().signInAnonimously(auth, this)
        UIDs.userID = auth.currentUser?.uid.toString()
        UIDs.deviceUUID = Settings.Secure.getString(this.contentResolver, Settings.Secure.ANDROID_ID)

    }

    override fun onStart() {
        super.onStart()
// authorization check user
        val currentUser = auth.currentUser
        FireBaseAuth().updateUI(currentUser)
        if (currentUser != null) {
            Log.d("FBAuth", "UID -> ${currentUser.uid}")
        } else {
            Toast.makeText(this, getString(R.string.autherror), Toast.LENGTH_LONG).show()
        }
// get Shops data
        firestoreGetData("shops", Shops::class.java, FirestoreGetSingletone.listShops)
    }

    override fun onResume() {
        super.onResume()

    }
}
