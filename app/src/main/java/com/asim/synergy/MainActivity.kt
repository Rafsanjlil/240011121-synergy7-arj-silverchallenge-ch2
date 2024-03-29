package com.asim.synergy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asim.synergy.databinding.ActivityMainBinding
import com.asim.synergy.databinding.CardTotalCostBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val totalLayanan = 1000
    val totalTip = 200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Akses TextView di dalam layout card
        val cardBinding = CardTotalCostBinding.bind(findViewById(R.id.card_total_cost))
        cardBinding.textSubtotal.text =
            getString(R.string.currency) + totalLayanan.toString() +" + "+ getString(R.string.currency) + totalTip.toString()
        cardBinding.textMargintotal.text=(totalLayanan+totalTip).toString()

    }
}