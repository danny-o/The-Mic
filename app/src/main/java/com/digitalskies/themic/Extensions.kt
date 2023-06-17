package com.digitalskies.themic

import android.widget.Toast
import androidx.fragment.app.Fragment


fun Fragment.toast(message:String){

    Toast.makeText(activity,message,Toast.LENGTH_SHORT).show()
}