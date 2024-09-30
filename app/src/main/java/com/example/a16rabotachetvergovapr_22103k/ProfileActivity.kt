package com.example.a16rabotachetvergovapr_22103k

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.platform.LocalContext
import android.content.Intent
import com.example.a16rabotachetvergovapr_22103k.ui.theme._16rabotaChetvergovaPR22103kTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _16rabotaChetvergovaPR22103kTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current // Get the current context

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF253334)), // Background color
        contentAlignment = Alignment.TopCenter
    ) {
        // Top Image
        Image(
            painter = painterResource(id = R.drawable.nizfor16), // Top image resource
            contentDescription = "Top Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Adjust height as necessary
        )

        // Center Image
        Image(
            painter = painterResource(id = R.drawable.ellipse_2), // Center image resource
            contentDescription = "Middle Image",
            modifier = Modifier
                .align(Alignment.Center) // Centered
                .padding(top = 120.dp) // Adjust padding as needed
                .size(100.dp) // Size of the center image
        )

        // Name Text
        Text(
            text = "Эмиль",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.BottomCenter) // Align at bottom center
                .padding(bottom = 200.dp) // Adjust padding as necessary
        )

        // Button to navigate to PhotoActivity
        Button(
            onClick = {
                // Navigate to PhotoActivity
                val intent = Intent(context, PhotoActivity::class.java) // Use LocalContext for intent
                context.startActivity(intent) // Start PhotoActivity
            },
            modifier = Modifier
                .align(Alignment.BottomCenter) // Align button at the bottom center
                .padding(16.dp)
                .size(150.dp), // Button size
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Картинка1", color = Color.White) // Button text
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    _16rabotaChetvergovaPR22103kTheme {
        ProfileScreen()
    }
}





