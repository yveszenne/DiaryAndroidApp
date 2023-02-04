package com.example.diaryandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.diaryandroid.ui.theme.DiaryAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiaryAndroidTheme {
                // A surface container using the 'background' color from the theme
            }
        }
    }
}