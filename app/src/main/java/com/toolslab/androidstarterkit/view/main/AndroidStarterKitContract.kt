package com.toolslab.androidstarterkit.view.main

import com.toolslab.androidstarterkit.base_mvp.BaseView
import com.toolslab.androidstarterkit.base_mvp.MvpPresenter

interface AndroidStarterKitContract {

    interface Presenter : MvpPresenter<View>

    interface View : BaseView

}
