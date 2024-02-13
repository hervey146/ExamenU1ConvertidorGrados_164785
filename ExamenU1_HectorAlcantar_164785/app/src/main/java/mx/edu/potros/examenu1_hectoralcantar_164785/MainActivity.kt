package mx.edu.potros.examenu1_hectoralcantar_164785

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gradosC: TextView = findViewById(R.id.etC)
        val gradosF: TextView = findViewById(R.id.etF)
        val btnGadrosC: Button = findViewById(R.id.btnGC)
        val btnGradosF: Button = findViewById(R.id.btnGF)

        btnGadrosC.setOnClickListener {
            var farenheit: Double = 0.0
            farenheit = gradosF.text.toString().toDouble()

            var resultado = calcularCentigrados(farenheit)
            val formattedNumber = "%.2f".format(resultado)

            gradosC.setText(formattedNumber)
        }

        btnGradosF.setOnClickListener {
            var centigrados: Double = 0.0
            centigrados = gradosC.text.toString().toDouble()

            var resultado = calcularFarenheit(centigrados)
            val formattedNumber = "%.2f".format(resultado)

            gradosF.setText(formattedNumber)
        }

    }

    fun calcularCentigrados(f: Double): Double {
        return (f - 32)/1.8
    }

    fun calcularFarenheit(c: Double): Double {
        return c*1.8+32
    }

}