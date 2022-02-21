package com.conamobile.pdpanimationhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

lateinit var text1: TextView
lateinit var text2: TextView
lateinit var text3: TextView
lateinit var bounceAnimation: Animation
lateinit var sequentalAnimation: Animation
lateinit var togatherAnimation: Animation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1 = findViewById(R.id.textView1)
        text2 = findViewById(R.id.textView2)
        text3 = findViewById(R.id.textView3)

        bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce_animation)
        sequentalAnimation = AnimationUtils.loadAnimation(this, R.anim.sequental_animation)
        togatherAnimation = AnimationUtils.loadAnimation(this, R.anim.togather_animation)

        text1.animation = bounceAnimation
        text2.animation = sequentalAnimation
        text3.animation = togatherAnimation



    }
}