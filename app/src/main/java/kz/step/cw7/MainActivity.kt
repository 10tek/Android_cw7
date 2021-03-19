package kz.step.cw7

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    var resultTextView: TextView? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.text_view_main_activity_result)
        resultTextView?.text = buildString {
            append("CodeName: ")
            append(android.os.Build.VERSION.CODENAME)
            append("\nSdk version: ")
            append(android.os.Build.VERSION.SDK_INT)
            append("\nНаименование версии ОС: ")
            append(Build.ID)
        }
    }
}