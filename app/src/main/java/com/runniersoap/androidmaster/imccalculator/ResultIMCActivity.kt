package com.runniersoap.androidmaster.imccalculator

import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.runniersoap.androidmaster.R
import com.runniersoap.androidmaster.imccalculator.ImcCalculatorActivity.Companion.IMC_KEY

class ResultIMCActivity : AppCompatActivity() {
    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val result = intent.extras?.getDouble(IMC_KEY)?:-1.0
        initComponents()
        initUI(result)
        initListener()
    }

    private fun initListener(){
        btnRecalculate.setOnClickListener{onBackPressed()}
    }

    private fun initUI(result: Double){
        tvIMC.text = result.toString()
        when(result){
            in 0.00 .. 18.50 -> { // BAJO PESO
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvResult.text = getString(R.string.title_bajo_peso)
                tvDescription.text = getString(R.string.description_bajo_peso)
            }
            in 18.51 .. 24.99 -> { // PESO NORMAL
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvResult.text = getString(R.string.title_normal_peso)
                tvDescription.text = getString(R.string.description_normal_peso)
            }
            in 25.00 .. 29.99 -> { // SOBREPESO
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_alto))
                tvResult.text = getString(R.string.title_sobrepeso)
                tvDescription.text = getString(R.string.description_sobrepeso)
            }
            in 30.00 .. 99.00 -> { // OBESIDAD
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvResult.text = getString(R.string.title_obesidad)
                tvDescription.text = getString(R.string.description_obesidad)
            }
            else -> {
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents(){
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvImc)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnRecalculate)
    }
}