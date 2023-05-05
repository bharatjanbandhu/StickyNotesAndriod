package com.example.sticky_notes.listeners;


import com.example.sticky_notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);

}
