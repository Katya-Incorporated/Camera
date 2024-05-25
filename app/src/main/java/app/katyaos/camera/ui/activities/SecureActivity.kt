package app.katyaos.camera.ui.activities

import android.content.SharedPreferences

interface SecureActivity {
    fun getSharedPreferences(name: String, mode: Int): SharedPreferences? = null
}
