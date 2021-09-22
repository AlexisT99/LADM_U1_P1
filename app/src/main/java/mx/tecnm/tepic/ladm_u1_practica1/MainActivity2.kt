package mx.tecnm.tepic.ladm_u1_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.tepic.ladm_u1_practica1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}