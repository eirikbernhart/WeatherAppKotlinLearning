package com.wheaterapp.beiningbogen.weatherapp.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wheaterapp.beiningbogen.weatherapp.R
import com.wheaterapp.beiningbogen.weatherapp.domain.model.ForecastList
import java.nio.file.Files.find

class ForecastListAdapter(val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(TextView(parent.context))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {

        /*operator fun ViewGroup.get(position: Int): View = getChildAt(position)

        val container: ViewGroup = find(R.id.container)
        val view = container[2]*/
    }
}