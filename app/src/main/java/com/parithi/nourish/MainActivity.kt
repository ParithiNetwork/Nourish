package com.parithi.nourish

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.parithi.nourish.analytics.AnalyticsManager
import com.parithi.nourish.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import java.lang.RuntimeException
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var analyticsManager: AnalyticsManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (isLoggedIn()) {

        } else {

        }
    }

    private fun isLoggedIn(): Boolean {
        return false
    }
}