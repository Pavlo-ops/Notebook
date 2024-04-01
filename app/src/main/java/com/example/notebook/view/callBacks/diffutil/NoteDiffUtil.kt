package com.example.notebook.view.callBacks.diffutil

import androidx.recyclerview.widget.DiffUtil
import com.example.notebook.domain.models.Note

class NoteDiffUtil: DiffUtil.ItemCallback<Note>() {

    override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean = oldItem == newItem
}