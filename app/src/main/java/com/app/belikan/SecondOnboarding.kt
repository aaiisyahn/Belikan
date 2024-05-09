package com.app.belikan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.belikan.databinding.ActivityFirstOnboardingBinding
import com.app.belikan.databinding.ActivitySecondOnboardingBinding

class SecondOnboarding : AppCompatActivity() {
    private lateinit var binding: ActivitySecondOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {
            startActivity(Intent(this, ThirdOnboarding::class.java))
        }

        binding.buttonSkip.setOnClickListener{
            startActivity(Intent(this, FirstOnboarding::class.java))
        }
    }
}