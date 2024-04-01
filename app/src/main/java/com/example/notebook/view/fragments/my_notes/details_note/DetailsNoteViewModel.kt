package com.example.notebook.view.fragments.my_notes.details_note

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notebook.data.Repositories
import com.example.notebook.data.note.entities.NoteEntity
import com.example.notebook.domain.models.Note
import com.example.notebook.domain.use_cases.AddNoteUseCase
import com.example.notebook.domain.use_cases.UpdateNoteUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailsNoteViewModel (
    private val updateNoteUseCase: UpdateNoteUseCase,
    private val deleteNoteUseCase: AddNoteUseCase
): ViewModel() {

    fun updateNote(note: Note) {
        viewModelScope.launch(Dispatchers.IO) {
            updateNoteUseCase.execute(note)
        }
    }

    fun deleteNote(note: Note) {
        viewModelScope.launch(Dispatchers.IO) {
            deleteNoteUseCase.execute(note)
        }
    }
}