package com.example.a16rabotachetvergovapr_22103k

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a16rabotachetvergovapr_22103k.ui.theme._16rabotaChetvergovaPR22103kTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(this) // Pass the context directly to MainScreen
        }
    }
}

@Composable
fun MainScreen(context: ComponentActivity) {
    // Display splash screen
    SplashScreen()

    // Launch effect to navigate to OnboardingActivity after 2 seconds
    LaunchedEffect(Unit) {
        delay(2000) // 2 seconds delay
        // Start the OnboardingActivity
        context.startActivity(Intent(context, OnboardingActivity::class.java))
        context.finish() // Finish MainActivity if you don't want to return to it
    }
}

@Composable
fun SplashScreen() {
    _16rabotaChetvergovaPR22103kTheme {
        // Replace with your image resource
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.splash_screen),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}

