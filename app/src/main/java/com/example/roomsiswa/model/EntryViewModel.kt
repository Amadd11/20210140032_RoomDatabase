package com.example.roomsiswa.model

import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repository.RepositorySiswa

class EntryViewModel(private val repositorySiswa: RepositorySiswa): ViewModel() {
    /*
       *Berisi status Siswa saat ini
        */
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    }
}