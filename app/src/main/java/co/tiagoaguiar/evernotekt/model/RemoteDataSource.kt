package co.tiagoaguiar.evernotekt.model

import co.tiagoaguiar.evernotekt.network.RetrofitClient
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class RemoteDataSource {

    fun listNotes() : Observable<List<Note>> =
        RetrofitClient.evernoteApi
            .listNotes()
            .subscribeOn(Schedulers.io())

    fun getNote(noteId: Int) : Observable<Note> =
    RetrofitClient.evernoteApi
            .getNote(noteId)
            .subscribeOn(Schedulers.io())

    fun createNote(note: Note) : Observable<Note> =
        RetrofitClient.evernoteApi
            .createNote(note)
            .subscribeOn(Schedulers.io())

    fun createNoteFromUser(user: User){
        user.showNotaTitle()
    }
}