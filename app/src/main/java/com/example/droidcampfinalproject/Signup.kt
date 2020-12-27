package com.example.droidcampfinalproject

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        findViewById<Button>(R.id.btn_sign_up).setOnClickListener{
            if (R.id.editTextEmailAddress.toString().isEmpty()){

            }

        }
    }
}