package com.example.a16rabotachetvergovapr_22103k

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a16rabotachetvergovapr_22103k.ui.theme._16rabotaChetvergovaPR22103kTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _16rabotaChetvergovaPR22103kTheme {
                LoginScreen(this)  // Pass the context to the composable
            }
        }
    }
}

@Composable
fun LoginScreen(context: Context) {
    // Background color
    val backgroundColor = Color(0xFF253334)

    // State variables for input fields
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,  // Center elements vertically
        horizontalAlignment = Alignment.CenterHorizontally  // Center elements horizontally
    ) {
        // Image at the top
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.logo1for16), // Replace with your image resource
            contentDescription = null,
            modifier = Modifier.size(100.dp) // Adjust size as needed
        )

        // Input fields for username and password
        Spacer(modifier = Modifier.height(16.dp)) // Space before input fields
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Логин") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp)) // Space between input fields
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            modifier = Modifier.fillMaxWidth()
        )

        // Вход Button
        Spacer(modifier = Modifier.height(16.dp)) // Space before button
        Button(
            onClick = {
                if (username.text.isNotEmpty() && password.text.isNotEmpty()) {
                    // Navigate to MainActivity2 if fields are not empty
                    context.startActivity(Intent(context, MainActivity2::class.java))
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8BAAA2)), // Button color
            modifier = Modifier.fillMaxWidth().height(60.dp)
        ) {
            Text(text = "Вход")
        }

        // Profile Button
        Spacer(modifier = Modifier.height(8.dp)) // Space before profile button
        Button(
            onClick = {
                // Navigate to MainActivity2
                context.startActivity(Intent(context, MainActivity2::class.java))
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8BAAA2)), // Button color
            modifier = Modifier.fillMaxWidth().height(60.dp)
        ) {
            Text(text = "Профиль")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    _16rabotaChetvergovaPR22103kTheme {
        // Create a mock LoginScreen without needing context
        MockLoginScreen()
    }
}

@Composable
fun MockLoginScreen() {
    // Mocking the UI for preview purposes
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFF253334)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(id = R.drawable.logo1for16), // Replace with your image resource
            contentDescription = null,
            modifier = Modifier.size(100.dp) // Adjust size as needed
        )
        Spacer(modifier = Modifier.height(16.dp)) // Space before input fields
        // Mock TextField for preview
        TextField(
            value = "Логин",
            onValueChange = {},
            label = { Text("Логин") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp)) // Space between input fields
        TextField(
            value = "Пароль",
            onValueChange = {},
            label = { Text("Пароль") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp)) // Space before button
        Button(
            onClick = {}, // No action for preview
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8BAAA2)), // Button color
            modifier = Modifier.fillMaxWidth().height(60.dp)
        ) {
            Text(text = "Вход")
        }
        Spacer(modifier = Modifier.height(8.dp)) // Space before profile button
        Button(
            onClick = {}, // No action for preview
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8BAAA2)), // Button color
            modifier = Modifier.fillMaxWidth().height(60.dp)
        ) {
            Text(text = "Профиль")
        }
    }
}
