package app.katyasystem.camera.ui.activities

import android.os.Bundle
import app.katyasystem.camera.CameraMode

class QrTile : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        camConfig.switchMode(CameraMode.QR_SCAN)
    }
}
