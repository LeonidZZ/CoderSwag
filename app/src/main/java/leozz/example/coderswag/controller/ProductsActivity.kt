package leozz.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import leozz.example.coderswag.R
import leozz.example.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}