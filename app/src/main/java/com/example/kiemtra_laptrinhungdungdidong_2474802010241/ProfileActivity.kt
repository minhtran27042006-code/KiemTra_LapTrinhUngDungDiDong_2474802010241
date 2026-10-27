package com.example.kiemtra_laptrinhungdungdidong_2474802010241
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvUserEmail = findViewById<TextView>(R.id.tvUserEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        val email = intent.getStringExtra("USER_EMAIL")
        tvUserEmail.text = email

        btnLogout.setOnClickListener {
            finish()
        }
    }
}