package com.example.noteappandroid.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.noteappandroid.models.Note
import io.reactivex.Single

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note): Single<Long>

    @Query("SELECT * FROM notes")
    fun getNotes(): LiveData<List<Note>>

    @Update
    @Throws(Exception::class)
    fun updateNote(note: Note): Single<Int>

    @Delete
    @Throws(Exception::class)
    fun deleteNote(note: Note): Single<Int>
}
