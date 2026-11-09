package vn.udn.ute.week08.s2415053122226

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textfield.TextInputEditText
import androidx.appcompat.app.AppCompatActivity
import vn.udn.ute.week08.s2415053122226.helper.HocPhanHelper
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tilTenHp = findViewById<TextInputLayout>(R.id.tilTenHp)
        val tilDiemQt = findViewById<TextInputLayout>(R.id.tilDiemQt)
        val tilDiemCk = findViewById<TextInputLayout>(R.id.tilDiemCk)
        val edtTenHp = findViewById<TextInputLayout>(R.id.edtTenHp)
        val edtDiemQt = findViewById<TextInputLayout>(R.id.edtDiemQt)
        val edtDiemCk = findViewById<TextView>(R.id.edtDiemCk)
}