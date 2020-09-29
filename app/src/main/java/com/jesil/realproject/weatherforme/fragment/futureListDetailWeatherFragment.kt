package com.jesil.realproject.weatherforme.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jesil.realproject.weatherforme.R
import com.jesil.realproject.weatherforme.fragmentViewModel.FutureListDetailWeatherViewModel

class futureListDetailWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = futureListDetailWeatherFragment()
    }

    private lateinit var viewModel: FutureListDetailWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_list_detail_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FutureListDetailWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}