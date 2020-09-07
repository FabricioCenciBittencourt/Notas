package co.tiagoaguiar.evernotekt.model

import javax.inject.Inject

class User @Inject constructor(private val note: Note) {

    fun showNotaTitle(){
        println("titulo: ${note.title}")
    }
}