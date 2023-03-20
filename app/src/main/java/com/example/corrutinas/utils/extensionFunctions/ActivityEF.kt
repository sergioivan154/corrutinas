/*
 * Copyright (c) 2021 KAVAK. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * KAVAK ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with KAVAK.
 */
package com.example.corrutinas.utils.extensionFunctions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T : Any, L : LiveData<T>> LifecycleOwner.observe(liveData: L, body: (T) -> Unit) {
    liveData.observe(this, Observer(body))
}