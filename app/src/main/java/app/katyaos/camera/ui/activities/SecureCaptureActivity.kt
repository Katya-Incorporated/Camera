package app.katyaos.camera.ui.activities

import android.content.SharedPreferences
import app.katyaos.camera.util.EphemeralSharedPrefsNamespace
import app.katyaos.camera.util.getPrefs

class SecureCaptureActivity : CaptureActivity(), SecureActivity {
    val ephemeralPrefsNamespace = EphemeralSharedPrefsNamespace()

    override fun getSharedPreferences(name: String, mode: Int): SharedPreferences {
        return ephemeralPrefsNamespace.getPrefs(this, name, mode, cloneOriginal = true)
    }
}
