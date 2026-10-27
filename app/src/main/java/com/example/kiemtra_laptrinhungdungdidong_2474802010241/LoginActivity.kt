package com.example.kiemtra_laptrinhungdungdidong_2474802010241
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ view bắt buộc bằng findViewById
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        // Xử lý sự kiện click nút Login
        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                tvStatus.text = "Lỗi: Không được để trống Email hoặc Password!"
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvStatus.text = "Lỗi: Sai định dạng Email!"
            } else if (password.length < 6) {
                tvStatus.text = "Lỗi: Mật khẩu phải có ít nhất 6 ký tự!"
            } else {
                tvStatus.text = "Validation Successful!"
            }
        }
    }
}