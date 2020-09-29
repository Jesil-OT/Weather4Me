package com.jesil.realproject.weatherforme.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jesil.realproject.weatherforme.R
import kotlinx.android.synthetic.main.weather_item.view.*

/*
class WeatherRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var weatherResultItems: List<WeatherResult> = ArrayList<WeatherResult>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.weather_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RecyclerViewHolder -> {
                holder.bind(weatherResultItems[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return weatherResultItems.size
    }

    class RecyclerViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val countryName: TextView = itemView.textView_location_country
        private val countryTimeZone: TextView = itemView.textView_location_tz
        private val countryTempC: TextView = itemView.textView_current_temp_c
        private val countryCurrentCondition: TextView = itemView.textView_current_condition_text


        fun bind(weatherData: WeatherResult) {

            */
/*countryName.text = weatherData.location.country
            countryTimeZone.text = weatherData.location.timezone_id
            countryTempC.text = weatherData.current.temperature.toString()
            countryCurrentCondition.text = "${weatherData.current.weather_descriptions.toString()}⁰"
*//*

        }
    }

    fun setWeatherData(weather: List<WeatherResult>) {
        weatherResultItems = weather
    }

}*/
