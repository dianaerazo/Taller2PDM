package com.pmtaller2.c00149823_DianaErazo.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.agarcia.myfirstandroidapp.ui.layout.CustomScaffold
import com.agarcia.myfirstandroidapp.ui.theme.MyFirstAndroidAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyFirstAndroidAppTheme {
        CustomScaffold()
      }
    }
  }
}