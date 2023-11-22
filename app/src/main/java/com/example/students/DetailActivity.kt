package com.example.students

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.students.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.extras

        with(binding) {
            namaMhs.text = "${data?.getString("nama")}"
            nimMhs.text = "${data?.getString("nim")}"
            jurusanMhs.text = "${data?.getString("jurusan")}"
            alamatMhs.text = "${data?.getString("alamat")}"

            btnKembali.setOnClickListener {
                finish()
            }
        }
    }
}