package app.katyasystem.camera.ui.activities

import android.content.SharedPreferences
import app.katyasystem.camera.CapturedItem
import app.katyasystem.camera.util.EphemeralSharedPrefsNamespace
import app.katyasystem.camera.util.getPrefs

class SecureMainActivity : MainActivity(), SecureActivity {
    val capturedItems = ArrayList<CapturedItem>()
    val ephemeralPrefsNamespace = EphemeralSharedPrefsNamespace()

    override fun getSharedPreferences(name: String, mode: Int): SharedPreferences {
        return ephemeralPrefsNamespace.getPrefs(this, name, mode, cloneOriginal = true)
    }
}
