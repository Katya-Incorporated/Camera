package app.katyassytem.camera.ui.activities

import android.content.SharedPreferences
import app.katyassytem.camera.util.EphemeralSharedPrefsNamespace
import app.katyassytem.camera.util.getPrefs

class SecureCaptureActivity : CaptureActivity(), SecureActivity {
    val ephemeralPrefsNamespace = EphemeralSharedPrefsNamespace()

    override fun getSharedPreferences(name: String, mode: Int): SharedPreferences {
        return ephemeralPrefsNamespace.getPrefs(this, name, mode, cloneOriginal = true)
    }
}
