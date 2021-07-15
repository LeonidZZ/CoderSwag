package leozz.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import leozz.example.coderswag.R
import leozz.example.coderswag.adapters.CategoryAdapter
import leozz.example.coderswag.databinding.ActivityMainBinding
import leozz.example.coderswag.model.Category
import leozz.example.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        adapter = CategoryAdapter(this, DataService.categories)
        binding.categoryListView.adapter = adapter

        binding.categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
    }
}