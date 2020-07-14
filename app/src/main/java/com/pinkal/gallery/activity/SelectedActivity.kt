package com.pinkal.gallery.activity

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.bumptech.glide.Glide
import com.pinkal.gallery.R
import com.pinkal.gallery.model.Images
import com.pinkal.gallery.utils.IMAGES_LIST
import kotlinx.android.synthetic.main.activity_selected.*

class SelectedActivity : AppCompatActivity() {
    var some :String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected)
     some = intent.getStringExtra("selected")
        Glide.with(this).load(Uri.parse(some)).into(selected_image)
    }
}