package app.katyaos.camera.ui.fragment

import androidx.recyclerview.widget.RecyclerView
import app.katyaos.camera.databinding.GallerySlideBinding

class GallerySlide(val binding: GallerySlideBinding) : RecyclerView.ViewHolder(binding.root) {
    @Volatile var currentPostion = 0
}
