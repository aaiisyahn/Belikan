package com.app.belikan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.belikan.databinding.ActivityFirstOnboardingBinding
import com.app.belikan.databinding.ActivityRegisterBinding

class FirstOnboarding : AppCompatActivity() {

    private lateinit var binding: ActivityFirstOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonNext.setOnClickListener {
            startActivity(Intent(this, SecondOnboarding::class.java))
        }

        binding.buttonSkip.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }
    }
}