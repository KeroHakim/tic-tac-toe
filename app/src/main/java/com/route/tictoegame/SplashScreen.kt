package com.route.tictoegame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.route.tictoegame.databinding.SplashScreenBinding

class SplashScreen : AppCompatActivity() {
    lateinit var binding: SplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        finishSplash()
    }
    private fun finishSplash(){
        Handler(mainLooper).postDelayed({
            val intent = Intent(this@SplashScreen,PageOptionActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}