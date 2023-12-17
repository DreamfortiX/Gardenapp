package com.example.gardenmaking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gardenmaking.databinding.ActivityMainBinding
import com.example.java.Adapterguide

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.rvid)


        val chatlist: List<guide_data> = listOf(
            guide_data("Naseeb Sultan","Random Message","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
            guide_data("Naseeb","Last Message ","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),

        guide_data("Naseeb Sultan","Random Message","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
        guide_data("Naseeb","Last Message ","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),

            guide_data("Naseeb Sultan","Random Message","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
            guide_data("Naseeb","Last Message ","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),

            guide_data("Naseeb Sultan","Random Message","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),

            guide_data("Naseeb Sultan","Random Message","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
            guide_data("Naseeb","Last Message ","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
            guide_data("Naseeb Sultan","Random Message","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
            guide_data("Naseeb","Last Message ","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
            guide_data("Naseeb","Last Message ","https://groundedcuriosity.com/wp-content/uploads/2015/01/Photo-1.jpg"),
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapterguide(this,chatlist)


    }
}