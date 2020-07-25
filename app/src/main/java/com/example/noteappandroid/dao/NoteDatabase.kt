package com.example.noteappandroid.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteappandroid.models.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "notes_db"
    }

    abstract fun getNoteDao(): NoteDao
}
