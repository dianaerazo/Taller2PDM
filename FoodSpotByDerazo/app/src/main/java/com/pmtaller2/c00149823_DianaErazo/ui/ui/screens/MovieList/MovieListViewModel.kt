package com.agarcia.myfirstandroidapp.ui.screens.MovieList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agarcia.myfirstandroidapp.data.model.Restaurant
import com.agarcia.myfirstandroidapp.data.repository.Movie.RestaurantRepository
import com.agarcia.myfirstandroidapp.data.repository.Movie.MovieRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieListViewModel: ViewModel() {
  val movieRepository:RestaurantRepository = MovieRepositoryImpl()

  private val _movies = MutableStateFlow<List<Restaurant>>(emptyList())
  val movies: StateFlow<List<Restaurant>> = _movies

  private val _loading = MutableStateFlow<Boolean>(false)
  val loading : StateFlow<Boolean> = _loading

  fun loadMovies () {
    viewModelScope.launch {
      _loading.value = true
      _movies.value = movieRepository.getMovies()
      _loading.value = false
    }
  }

}