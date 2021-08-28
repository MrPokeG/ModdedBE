package net.listerily.moddedbe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.version_name_textview).text = BuildConfig.VERSION_NAME
    }

    fun onStartGameClicked(view: View) {
        startActivity(Intent(this, InitializingActivity::class.java))
        finish()
    }

    fun onMenuClicked(view: View) {
        startActivity(Intent(this, OptionsActivity::class.java))
    }
}