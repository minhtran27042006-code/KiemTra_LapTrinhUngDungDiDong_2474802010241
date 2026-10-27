package com.example.kiemtra_laptrinhungdungdidong_2474802010241

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ánh xạ View
        val tvUserEmail = findViewById<TextView>(R.id.tvUserEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val lvSubjects = findViewById<ListView>(R.id.lvSubjects)

        // Nhận và hiển thị Email
        val email = intent.getStringExtra("USER_EMAIL")
        tvUserEmail.text = email

        // Xử lý nút đăng xuất
        btnLogout.setOnClickListener {
            finish()
        }

        // Khởi tạo mảng dữ liệu 05 môn học
        val subjects = arrayOf("Kotlin Programming", "XML Layout Design", "Git/GitHub Management", "Intent Processing", "Android Architecture")

        // Gắn ArrayAdapter vào ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, subjects)
        lvSubjects.adapter = adapter

        // Bắt sự kiện click vào phần tử trong ListView
        lvSubjects.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = subjects[position]
            Toast.makeText(this, "Bạn đã chọn: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}