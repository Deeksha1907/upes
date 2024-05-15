package com.example.upes.presentation.screens.user
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.upes.R
import com.example.upes.databinding.ActivityUserBinding
import dagger.hilt.android.AndroidEntryPoint

class User : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding:ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.user_fragment_holder) as NavHostFragment
        navController=navHostFragment.navController
        val bottomNavigationView=binding.bottomNavView
        setupWithNavController(bottomNavigationView,navController)
    }
}