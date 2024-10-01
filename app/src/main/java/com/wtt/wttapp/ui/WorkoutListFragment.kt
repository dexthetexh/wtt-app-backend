package com.wtt.wttapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wtt.wttapp.R

class WorkoutListFragment : Fragment() {

    private lateinit var workoutAdapter: MyItemRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_workout_list, container, false)

        // Set up the RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Sample workout data
        val workoutList = listOf(
            Workout(1, "Leg Day", false),
            Workout(2, "Cardio", true),
            Workout(3, "Upper Body", false)
        )

        // Initialize the adapter
        workoutAdapter = MyItemRecyclerViewAdapter(workoutList)

        recyclerView.adapter = workoutAdapter

        return view
    }
}
