package com.example.businesscardkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardkotlin.ui.theme.BusinessCardKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            BusinessCardKotlinTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.weight(1f))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Агитаев Исамурад",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            val image = painterResource(id = R.drawable.soyjaks)
            Image(
                painter = image,
                contentDescription = "Logo",
                modifier = Modifier.size(300.dp)
            )

            Text(
                text = "Магистрант 2 курса",
                fontSize = 18.sp,
                color = Color(0xFF3ddc84)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        ContactInfo()
    }
}

@Composable
fun ContactInfo() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ContactRow(
            icon = Icons.Rounded.Phone,
            text = "+7 (777) 404-20-02"
        )
        ContactRow(
            icon = Icons.Rounded.Share,
            text = "@colesattac"
        )
        ContactRow(
            icon = Icons.Rounded.Email,
            text = "colesattac@gmail.com"
        )
    }
}

@Composable
fun ContactRow(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84)
        )
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardKotlinTheme {
        BusinessCardApp()
    }
}

