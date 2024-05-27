package com.route.tictoegame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.route.tictoegame.databinding.ActivityOptionPageBinding
import com.route.tictoegame.databinding.SplashScreenBinding

class PageOptionActivity : AppCompatActivity() {
    lateinit var binding: ActivityOptionPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        playIsClick()
    }
    private fun playIsClick(){
        binding.btnPlay.setOnClickListener {
            val intent = Intent(this@PageOptionActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun settingClick(){
        binding.btnSettings.setOnClickListener {

        }
    }
}