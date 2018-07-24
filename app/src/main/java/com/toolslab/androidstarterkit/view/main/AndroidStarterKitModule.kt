package com.toolslab.androidstarterkit.view.main

import dagger.Module
import dagger.Provides

@Module
class AndroidStarterKitModule {

    @Provides
    fun providePresenter(androidStarterKitPresenter: AndroidStarterKitPresenter): AndroidStarterKitContract.Presenter =
            androidStarterKitPresenter

}
