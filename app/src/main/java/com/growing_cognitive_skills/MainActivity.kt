package com.growing_cognitive_skills

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.growing_cognitive_skills.ui.theme.Growing_cognitive_skillsTheme
var my_test = "10"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Growing_cognitive_skillsTheme {
                // A surface container using the 'background' color from the theme
                Log.d("my_test", my_test)
                Num_Keyboard()

            }
        }
    }
}

@Composable
fun Num_Keyboard(){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Key_Num("1")
        Key_Num("2")
        Key_Num("3")
    }


}


@Composable
fun Key_Num(num_name: String) {
//    Surface(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Blue)
//    ) {

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(150.dp),
            border = BorderStroke(2.dp, color = Color(0xFFFF6600)) )
        {
            Text(text = num_name, fontSize = 25.sp)

            
        }
//    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Growing_cognitive_skillsTheme {
//        Greeting("Android")
//    }
//}