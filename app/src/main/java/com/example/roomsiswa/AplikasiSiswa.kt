package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.repository.ContainerApp
import com.example.roomsiswa.repository.ContainerDataApp

class AplikasiSiswa : Application(){
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan depedensi
     */
    lateinit var container : ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}