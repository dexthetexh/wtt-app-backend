package com.wtt.wttapp.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.wtt.wttapp.R
import com.wtt.wttapp.databinding.FragmentWorkoutList2Binding

// Data class for Workout
data class Workout(
    val id: Int,
    val name: String,
    var completed: Boolean
)

// Adapter for RecyclerView
class MyItemRecyclerViewAdapter(
    private val workoutList: List<Workout>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentWorkoutList2Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val workout = workoutList[position]
        holder.workoutNameView.text = workout.name
        holder.workoutStatusView.text = if (workout.completed) "Completed" else "Pending"
    }

    override fun getItemCount(): Int = workoutList.size

    inner class ViewHolder(binding: FragmentWorkoutList2Binding) :
        RecyclerView.ViewHolder(binding.root) {
        val workoutNameView: TextView = binding.itemNumber // Rename in your binding layout if necessary
        val workoutStatusView: TextView = binding.content  // Rename in your binding layout if necessary

        override fun toString(): String {
            return super.toString() + " '" + workoutNameView.text + "'"
        }
    }
}
