package co.tiagoaguiar.evernotekt

import co.tiagoaguiar.evernotekt.model.Note
import org.junit.Assert
import org.junit.Test

class NoteTest {
    @Test
    fun `test should format date pattern to month and year`(){
        val note = Note(title = "NotaA", body = "NotaA Conteudo", date = "20/02/2020")

        Assert.assertEquals("Fev 2020", note.createDate)

    }

    @Test
    fun `test should format date case empty`(){
        val note = Note(title = "NotaA", body = "NotaA Conteudo", date = "")

        Assert.assertEquals("", note.createDate)

    }

    @Test
    fun `test should format date case null`(){
        val note = Note(title = "NotaA", body = "NotaA Conteudo")

        Assert.assertEquals("", note.createDate)

    }
}