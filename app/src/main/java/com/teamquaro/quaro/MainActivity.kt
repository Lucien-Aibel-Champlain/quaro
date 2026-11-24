package com.teamquaro.quaro
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Add button Move to Activity
    private lateinit var next_Activity_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // by ID we can use each component which id is assign in xml file
        // use findViewById() to get the Button
        next_Activity_button = findViewById(R.id.open_camera_button)

        // Add_button add clicklistener
        next_Activity_button.setOnClickListener {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            val intent = Intent(this, CameraActivity::class.java)
            // start the activity connect to the specified class
            startActivity(intent)
        }
    }
}