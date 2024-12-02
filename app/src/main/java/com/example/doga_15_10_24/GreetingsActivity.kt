package com.example.doga_15_10_24

import android.content.Context
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.internal.ViewUtils.hideKeyboard

class GreetingsActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var greetButton: Button
    private lateinit var resultTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_greetings)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        nameEditText = findViewById(R.id.nameEditText)
        greetButton = findViewById(R.id.greetButton)
        resultTextView = findViewById(R.id.resultTextView)

        greetButton.setOnClickListener{
            val name = nameEditText.text

            if (name.isNotEmpty()){
                val greetingText = when{
                    name.length <= 3 -> "Szia $name! De rövid neved van"
                    name.length >= 10 -> "Szia $name! De hosszú neved van"
                    else -> "Szia $name!"
                }

                resultTextView.text = greetingText



                hideKeyboard()

                nameEditText.text.clear()
            }else{
                Toast.makeText(
                    this,
                    "Kérlek adj meg egy nevet!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }


    }//ONCREATE

    private fun hideKeyboard(){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(nameEditText.windowToken, 0)
    }
}