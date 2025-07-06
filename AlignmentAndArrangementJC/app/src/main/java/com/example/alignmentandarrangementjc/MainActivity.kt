package com.example.alignmentandarrangementjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.alignmentandarrangementjc.ui.theme.AlignmentAndArrangementJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AlignmentAndArrangementJCTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    LearnAlignmentArrangement()
                }
            }
        }
    }
}

//Alignment = Cross Axis (Row = Vertical, Column = Horizontal)
//Arrangement = Cross Axis (Row = Horizontal, Column = Vertical)

@Composable
fun LearnAlignmentArrangement() {

    //RowAlignment: Top, CenterVertically, Bottom
    //RowArrangement: Start, Center, End, SpaceBottom, SpaceEvenly,
    // Absolute.Left, Absolute.Right, Absolute.Center
    // Absolute.SpaceBottom, Absolute.SpaceAround, Absolute.SpaceEvenly



    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Text(text = "Row Alignment Arrangement")
    }


    //ColumnAlignment: Start, CenterHorizontally, End
    //ColumnArrangement: Top, Center, Bottom, SpaceEvenly, SpaceBetween, SpaceAround


    Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
        Text(text = "Column Alignment Arrangement")
    }

    //BoxAlignment: TopStart, TopCenter, TopEnd, BottomStart, BottomEnd, Center, CenterStart, CenterEnd

    Box(contentAlignment = Alignment.BottomCenter) {
        Text(text = "Box Alignment",modifier = Modifier.align(Alignment.Center))
    }

    // Other Box Alignment Parameters
    Box {
        Text(text = "TopStart", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "TopCenter", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "TopEnd", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "BottomStart", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "BottomCenter", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "BottomEnd", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "Center", modifier = Modifier.align(Alignment.Center))
        Text(text = "CenterStart", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "CenterEnd", modifier = Modifier.align(Alignment.CenterEnd))
    }

}