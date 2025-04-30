package com.agarcia.myfirstandroidapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.agarcia.myfirstandroidapp.data.dummy.dummyRestaurants
import com.agarcia.myfirstandroidapp.helpers.formatLongDate

@Composable
fun MovieDetailScreen(movieId: Int) {
  val scrollState = rememberScrollState()
  val movie = dummyRestaurants.firstOrNull { it.id == movieId }

  if (movie == null) {
    Box(
      modifier = Modifier.fillMaxSize(),
      contentAlignment = Alignment.Center
    ) {
      Text("Película no encontrada", style = MaterialTheme.typography.titleLarge)
    }
    return
  }

  Column(
    modifier = Modifier
      .fillMaxSize()
      .verticalScroll(scrollState)
      .background(Color.White)
  ) {
    AsyncImage(
      model = movie.backdropUrl,
      contentDescription = null,
      modifier = Modifier
        .fillMaxWidth()
        .height(200.dp),
      contentScale = ContentScale.Crop
    )

    // Poster y Título
    Row(
      modifier = Modifier
        .padding(16.dp)
    ) {
      AsyncImage(
        model = movie.imageUrl,
        contentDescription = null,
        modifier = Modifier
          .width(100.dp)
          .height(150.dp)
          .clip(RoundedCornerShape(8.dp)),
        contentScale = ContentScale.Crop
      )

      Spacer(modifier = Modifier.width(16.dp))

      Column {
        Text(
          text = movie.name,
          style = MaterialTheme.typography.titleLarge,
          fontWeight = FontWeight.Bold
        )
        Text(
          text = movie.category,
          style = MaterialTheme.typography.titleMedium,
          fontWeight = FontWeight.SemiBold
        )
      }
    }

    HorizontalDivider()

    // Descripción
    Column(modifier = Modifier.padding(16.dp)) {
      Text(
        text = "Descripción",
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.SemiBold
      )
      Spacer(modifier = Modifier.height(8.dp))
      Text(text = movie.description)
    }

    Spacer(modifier = Modifier.height(16.dp))

    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
      Text(
        text = "${movie.menu.size} Platos",
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.SemiBold
      )

      Spacer(modifier = Modifier.height(8.dp))

      val context = androidx.compose.ui.platform.LocalContext.current

      movie.menu.forEach { dish ->
        Spacer(modifier = Modifier.height(8.dp))
        Column(
          modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFF0F0F0))
            .padding(16.dp)
        ) {
          Text(text = dish.name, style = MaterialTheme.typography.titleLarge)
          Spacer(modifier = Modifier.height(4.dp))
          Text(text = dish.description)
          Spacer(modifier = Modifier.height(8.dp))
          AsyncImage(
            model = dish.imageUrl,
            contentDescription = dish.name,
            modifier = Modifier
              .fillMaxWidth()
              .height(180.dp)
              .clip(RoundedCornerShape(6.dp)),
            contentScale = ContentScale.Crop
          )
          Spacer(modifier = Modifier.height(8.dp))
          androidx.compose.material3.Button(
            onClick = {
              android.widget.Toast.makeText(
                context,
                "${dish.name} agregado al carrito",
                android.widget.Toast.LENGTH_SHORT
              ).show()
            }
          ) {
            Text("Agregar al carrito")
          }
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun MovieDetailScreenPreview(){
  MovieDetailScreen(798418)
}