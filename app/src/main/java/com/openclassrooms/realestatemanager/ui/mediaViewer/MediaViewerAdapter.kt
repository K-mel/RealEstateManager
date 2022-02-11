package com.openclassrooms.realestatemanager.ui.mediaViewer

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.openclassrooms.realestatemanager.models.MediaItem
import com.openclassrooms.realestatemanager.models.enums.FileType

const val BUNDLE_KEY_MEDIA_URL = "BUNDLE_KEY_MEDIA_URL"
const val BUNDLE_KEY_MEDIA_DESCRIPTION = "BUNDLE_KEY_MEDIA_DESCRIPTION"

class MediaViewerAdapter(activity: FragmentActivity,
                         private val mMediaList: List<MediaItem>,
                         private val mEditMode: Boolean)
    : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return mMediaList.size
    }

    override fun createFragment(position: Int): Fragment {
        return if(mMediaList[position].fileType == FileType.PICTURE) {
            val fragment = PictureViewerFragment()
            fragment.arguments = Bundle().apply {
                putString(BUNDLE_KEY_MEDIA_URL, mMediaList[position].url)
                putString(BUNDLE_KEY_MEDIA_DESCRIPTION, mMediaList[position].description)
                putBoolean(BUNDLE_KEY_EDIT_MODE, mEditMode)
            }
            fragment
        } else{
            val fragment = VideoViewerFragment()
            fragment.arguments = Bundle().apply {
                putString(BUNDLE_KEY_MEDIA_URL, mMediaList[position].url)
                putString(BUNDLE_KEY_MEDIA_DESCRIPTION, mMediaList[position].description)
                putBoolean(BUNDLE_KEY_EDIT_MODE, mEditMode)
            }
            fragment
        }
    }
}