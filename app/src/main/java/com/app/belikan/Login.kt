package com.app.belikan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.belikan.databinding.ActivityDetailFishBinding
import com.app.belikan.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            // Get the username and password from the EditText fields
            val username = binding.emailLogin.text.toString()
            val password = binding.passwordLogin.text.toString()

            // If login is successful, navigate to the next activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.registerFromLogin.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}