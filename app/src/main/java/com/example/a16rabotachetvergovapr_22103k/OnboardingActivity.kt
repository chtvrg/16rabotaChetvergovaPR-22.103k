package com.example.a16rabotachetvergovapr_22103k

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a16rabotachetvergovapr_22103k.ui.theme._16rabotaChetvergovaPR22103kTheme

class OnboardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _16rabotaChetvergovaPR22103kTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    OnboardingScreen(modifier = Modifier.padding(innerPadding), onLoginClick = {
                        // Start LoginActivity when button is clicked
                        startActivity(Intent(this, LoginActivity::class.java))
                    })
                }
            }
        }
    }
}

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier, onLoginClick: () -> Unit) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Display the background image
        Image(
            painter = painterResource(id = R.drawable.backgroundfor16),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize()
        )

        // Logo
        Image(
            painter = painterResource(id = R.drawable.logofor16),
            contentDescription = "Logo",
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 300.dp)
        )

        // Welcome Message
        Text(
            text = "Привет \nНаслаждайся отборочными.\nБудь внимателен. \nДелай хорошо.",
            modifier = Modifier
                .align(Alignment.Center)
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Center,
            color = Color.White // Adjust text color as needed
        )

        Button(
            onClick = { onLoginClick() }, // Call the function to navigate to LoginActivity
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8AA9A1)),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(bottom = 16.dp), // Adjust the bottom padding as necessary
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Войти в аккаунт",
                modifier = Modifier.fillMaxWidth(), // Center text within button
                textAlign = TextAlign.Center // Ensure text is centered
            )
        }

        // Registration Text
        Text(
            text = "Еще нет аккаунта? Зарегистрируйтесь",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 80.dp) // Adjust padding as needed
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White // Adjust text color as needed
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    _16rabotaChetvergovaPR22103kTheme {
        OnboardingScreen(onLoginClick = {})
    }
}