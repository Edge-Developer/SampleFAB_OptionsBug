package com.edgedevstudio.samplefab

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.joaquimley.faboptions.FabOptions

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        when(p0?.id){
            //
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fabOptions = findViewById<FabOptions>(R.id.fab_options)
        fabOptions.setButtonsMenu(R.menu.fab_menu)
        fabOptions.setOnClickListener(this)
    }
}
