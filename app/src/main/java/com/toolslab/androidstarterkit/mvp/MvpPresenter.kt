package com.toolslab.androidstarterkit.mvp

interface MvpPresenter<in V : MvpView> {

    fun bind(view: V)

    fun onBound(view: V)

    fun unbind(view: V)

    fun onUnbound(view: V)

}