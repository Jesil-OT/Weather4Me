package com.jesil.realproject.weatherforme.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.jesil.realproject.weatherforme.R
import com.jesil.realproject.weatherforme.fragmentViewModel.CurrentWeatherViewModel
import com.jesil.realproject.weatherforme.retrofit.WeatherStackApiService
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CurrentWeatherFragment : Fragment() {

    private lateinit var viewModelCurrent: CurrentWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val weatherView = inflater.inflate(R.layout.current_weather_fragment, container, false)

        viewModelCurrent = ViewModelProviders.of(this).get(CurrentWeatherViewModel::class.java)

        return weatherView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val apiService = WeatherStackApiService()
        GlobalScope.launch(Dispatchers.Main) {
            val currentWeatherResponse = apiService.getCurrentWeatherAsync("Nigeria").await()
            Toast.makeText(activity, currentWeatherResponse.toString(), Toast.LENGTH_LONG).show()
            currentTextView.text = currentWeatherResponse.toString()
        }

    }
}