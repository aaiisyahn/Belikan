package com.app.belikan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.belikan.databinding.ActivitySecondOnboardingBinding
import com.app.belikan.databinding.ActivityThirdOnboardingBinding

class ThirdOnboarding : AppCompatActivity() {

    private lateinit var binding: ActivityThirdOnboardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}