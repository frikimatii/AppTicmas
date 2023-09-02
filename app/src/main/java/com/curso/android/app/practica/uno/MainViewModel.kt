package com.curso.android.app.practica.myapplication

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun compareTexts(text1: String, text2: String): String {
        return if (text1.isBlank() && text2.isBlank()) {
            "Aún no hay texto escrito"
        } else if (text1 == text2) {
            "Los textos son iguales"
        } else {
            "Los textos son diferentes"
        }
    }
}

