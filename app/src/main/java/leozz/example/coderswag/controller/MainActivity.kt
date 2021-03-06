package leozz.example.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import leozz.example.coderswag.R
import leozz.example.coderswag.adapters.CategoryAdapter
import leozz.example.coderswag.adapters.CategoryRecycleAdapter
import leozz.example.coderswag.databinding.ActivityMainBinding
import leozz.example.coderswag.model.Category
import leozz.example.coderswag.services.DataService
import leozz.example.coderswag.utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        binding.categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        binding.categoryListView.layoutManager = layoutManager
        binding.categoryListView.setHasFixedSize(true)



    }
}