package dev.jahidhasanco.mealsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import dagger.hilt.android.AndroidEntryPoint
import dev.jahidhasanco.mealsapp.presentation.meal_search.MealSearchFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var container: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = findViewById(R.id.container)
        supportFragmentManager.beginTransaction().add(R.id.container, MealSearchFragment()).commit();


    }
}