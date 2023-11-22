package com.mehedi.customprogreesbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import androidx.core.content.ContextCompat
import com.mehedi.customprogreesbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.textProg.setMax(100)

        binding.textProg.setMinProg()

        binding.seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                setPro(progress)
                binding.textProg.setTextProgressSize(30)
                binding.textProg.setTextProgressMargin(-5)
                binding.textProg.setTextProgressColor(
                    ContextCompat.getColor(
                        this@MainActivity,
                        R.color.white
                    )
                )

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })


    }

    private fun setPro(prog: Int) {
        binding.textProg.setProgress(prog)
        binding.textProg.setProgressText("$prog%")



    }
}