package com.example.measurehearthrate.Base

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

open class BaseActivity : AppCompatActivity() {


    protected val TAG = this.javaClass.simpleName

    protected fun addFragment(fragment: Fragment, tag: String?, frameId: Int) {
        supportFragmentManager.beginTransaction()
                .replace(frameId, fragment, tag)
                .addToBackStack(tag)
                .commitAllowingStateLoss()
    }
}