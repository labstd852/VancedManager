package com.vanced.manager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vanced.manager.R
import com.vanced.manager.core.fragments.ThemeInstall

class VancedThemeSelectionFragment : ThemeInstall() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title = getString(R.string.title_install)
        return inflater.inflate(R.layout.fragment_vanced_theme_selection, container, false)
    }

}
