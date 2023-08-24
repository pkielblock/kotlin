package com.example.firstapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_screen);

        var labelChoosen = findViewById<TextView>(R.id.labelChoosen);
        var txtPriceEtanol = findViewById<TextView>(R.id.txtPriceEtanol);
        var txtPriceGasolina = findViewById<TextView>(R.id.txtPriceGasolina);

        fun calculatePrice(): Any? {
            var priceEtanol = txtPriceEtanol.text.toString().toDouble();
            var priceGasolina = txtPriceGasolina.text.toString().toDouble();
            var result = priceEtanol / priceGasolina;

            if (result > 0.7) {
                labelChoosen.text = "Gasolina vale mais a pena";
            } else {
                labelChoosen.text = "Etanol vale mais a pena";
            }

            return null;
        }

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            calculatePrice();
        }

        findViewById<Button>(R.id.btnLImpar).setOnClickListener {
            txtPriceEtanol.text = "";
            txtPriceGasolina.text = "";
            labelChoosen.text = "";
        }
    }
}