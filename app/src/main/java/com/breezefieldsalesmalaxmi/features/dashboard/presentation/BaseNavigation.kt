package com.breezefieldsalesmalaxmi.features.dashboard.presentation

import com.breezefieldsalesmalaxmi.app.types.FragType

/**
 * Created by rp : 27-10-2017:18:06
 */
interface BaseNavigation {

    /*fragment transaction and navigation */
    abstract fun loadFragment(mFragType: FragType, addToStack: Boolean, initializeObject: Any)
}