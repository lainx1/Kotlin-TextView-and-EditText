package com.example.lainx1.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextWatcher, View.OnFocusChangeListener {

    var nameEditText: EditText? = null
    var ageEditText: EditText? = null
    var nameTextView: TextView? = null
    var ageTextView: TextView? = null
    var controlId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        ageEditText = findViewById(R.id.ageEditText)

        nameTextView = findViewById(R.id.nameTextView)
        ageTextView = findViewById(R.id.ageTextView)
    }

    override fun onStart() {
        super.onStart()
        nameEditText?.addTextChangedListener(this)
        ageEditText?.addTextChangedListener(this)

        nameEditText?.setOnFocusChangeListener(this)
        ageEditText?.setOnFocusChangeListener(this)
    }

    override fun afterTextChanged(p0: Editable?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTextChanged(text: CharSequence?, after: Int, before: Int, count: Int) {
        if (controlId == R.id.nameEditText){
            nameTextView?.setText(text)
            return
        }
        ageTextView?.setText(text)
    }
    override fun onFocusChange(view: View?, focus: Boolean) {
        controlId = view!!.id
    }
}
