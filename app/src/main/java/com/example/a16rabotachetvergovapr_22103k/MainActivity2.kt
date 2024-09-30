package com.example.a16rabotachetvergovapr_22103k

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a16rabotachetvergovapr_22103k.ui.theme._16rabotaChetvergovaPR22103kTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _16rabotaChetvergovaPR22103kTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding), context = this)
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, context: Context) {
    // Set the background color
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF253334)),
        contentAlignment = Alignment.TopEnd // Align the button to the top right
    ) {
        // Rounded button with image as background
        Button(
            onClick = {
                // Navigate to ProfileActivity
                context.startActivity(Intent(context, ProfileActivity::class.java))
            },
            modifier = Modifier
                .padding(16.dp)
                .size(100.dp), // Size of the button
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent) // Make the button transparent
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse_2), // Replace with your image resource
                contentDescription = "Profile Button",
                modifier = Modifier.fillMaxSize()
            )
        }

        // Vertical Column for the rest of the content
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            // Welcome Text
            Text(
                text = "С возвращением, Эмиль!\nКаким ты себя ощущаешь сегодня?",
                color = Color.White,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Images
            Image(
                painter = painterResource(id = R.drawable.feelings), // Replace with your image resource
                contentDescription = "Image sol",
                modifier = Modifier.padding(bottom = 16.dp) // Space between images
            )
            Image(
                painter = painterResource(id = R.drawable.meditation_101), // Replace with your image resource
                contentDescription = "Image xz",
                modifier = Modifier.padding(bottom = 16.dp) // Space between images
            )
            Image(
                painter = painterResource(id = R.drawable.meditation_101), // Replace with your image resource
                contentDescription = "Image uis",
                modifier = Modifier.padding(bottom = 16.dp) // Space between images
            )
            Image(
                painter = painterResource(id = R.drawable.nizfor16), // Replace with your image resource
                contentDescription = "Image sazx",
                modifier = Modifier.padding(bottom = 16.dp) // Space between images
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    _16rabotaChetvergovaPR22103kTheme {
        MainScreen(context = LocalContext.current) // Use a dummy context for preview
    }
}
