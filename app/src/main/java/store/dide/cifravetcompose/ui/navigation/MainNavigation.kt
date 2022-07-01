package store.dide.cifravetcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import store.dide.cifravetcompose.data.singletons.FirestoreGetSingletone
import store.dide.cifravetcompose.ui.screens.*

@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "start_screen") {
        composable("start_screen") {
            StartScreen(navController)
        }

        composable("main_screen") {
            MainScreen()
        }

        composable("shop_screen") {
            ShopScreen(navController, FirestoreGetSingletone.listShops)
        }

        composable("empty_shop_screen") {
            EmptyShopScreen(navController)
        }

        composable("pin_screen") {
            PinScreen()
        }

        composable("edit_screen") {
            EditScreen()
        }

        composable("confirm_email_screen") {
            ConfirmEmailScreen()
        }
    }
}