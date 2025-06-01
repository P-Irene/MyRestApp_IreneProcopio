package com.example.myrestapp_ireneprocopio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
        val loginName : EditText  = findViewById(R.id.editText_name)
        val loginPassword : EditText = findViewById(R.id.editText_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            if(valida(loginPassword.text.toString(), loginPassword.text.toString())){
                verifica(loginName, loginPassword)
            }
        }



    }

    private fun valida(name : String, password : String): Boolean{
        var answer = false
        if(name == "" || password == ""){
            Toast.makeText(this, "È necessario compilare i campi.", Toast.LENGTH_LONG).show()
        }else if(password.length < 8){
            Toast.makeText(this, "La password deve essere lunga almeno 8 caratteri.", Toast.LENGTH_LONG).show()
        } else{
            answer = true
        }
        return answer
    }

    private fun verifica(loginName : EditText, loginPassword : EditText){
        if(loginName.text.toString() == "Nome"){
            if(loginPassword.text.toString() == "Password"){
                Toast.makeText(this, "Utente verificato con successo", Toast.LENGTH_SHORT).show()
                cifra(loginPassword.toString())
            }else{
                Toast.makeText(this, "Nome utente o password errati", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "Nome utente o password errati", Toast.LENGTH_SHORT).show()
        }
    }

    private fun cifra(password : String, alfabeto: String = "abcdefghijklmnopqrstuvwxyz"){
        var messaggioCifrato = ""
        val key = "chiave"
        var keyIndex = 0

        for (char in password.lowercase()) {
            if (!char.isLetter()) {
                messaggioCifrato += char
            } else {
                val keyChar = key[keyIndex % key.length]
                keyIndex++

                val offset = alfabeto.indexOf(keyChar)
                val index = alfabeto.indexOf(char)
                val newIndex = (index + offset) % alfabeto.length

                messaggioCifrato += alfabeto[newIndex]
            }
        }
        val  intent = Intent(this, MenuActivity::class.java).apply{}
        startActivity(intent)
    }
}