package com.example.sticky_notes.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sticky_notes.dao.NoteDao;
import com.example.sticky_notes.entities.Note;

@Database(entities = Note.class, version = 1,exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase notesDatabase;


    public static synchronized  NoteDatabase getDatabase(Context context){
        if (notesDatabase == null){
            notesDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase.class,
                     "notes_db"

            ).build();
        }
        return notesDatabase;
    }
    public abstract NoteDao noteDao();
}
