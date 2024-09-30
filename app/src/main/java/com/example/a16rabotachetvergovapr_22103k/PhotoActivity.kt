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
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a16rabotachetvergovapr_22103k.ui.theme._16rabotaChetvergovaPR22103kTheme

class PhotoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _16rabotaChetvergovaPR22103kTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PhotoScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PhotoScreen(modifier: Modifier = Modifier) {
    // State to control image visibility
    var imageVisible by remember { mutableStateOf(true) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF253334)), // Background color
        contentAlignment = Alignment.Center
    ) {
        // Conditionally show the image
        if (imageVisible) {
            Image(
                painter = painterResource(id = R.drawable.ellipse_2), // Your image resource
                contentDescription = "Photo",
                modifier = Modifier.size(200.dp) // Adjust size as necessary
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.padding(16.dp).fillMaxWidth()
        ) {
            // Close Button
            Button(
                onClick = {
                    // Close the activity and return to ProfileActivity
                    (this as? ComponentActivity)?.finish()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(56.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Закрыть", color = Color.White)
            }

            // Delete Button
            Button(
                onClick = {
                    // Delete the image
                    imageVisible = false
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(56.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(text = "Удалить", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhotoScreenPreview() {
    _16rabotaChetvergovaPR22103kTheme {
        PhotoScreen()
    }
}
