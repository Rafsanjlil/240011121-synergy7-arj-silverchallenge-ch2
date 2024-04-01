package com.asim.synergy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asim.synergy.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val totalLayanan = 1000
    val totalTip = 200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Akses TextView di dalam layout card
        binding.cardTotalCost.textSubtotal.text =
            getString(R.string.currency) + totalLayanan.toString() +" + "+ getString(R.string.currency) + totalTip.toString()
        binding.cardTotalCost.textMargintotal.text=(totalLayanan+totalTip).toString()

    }
}