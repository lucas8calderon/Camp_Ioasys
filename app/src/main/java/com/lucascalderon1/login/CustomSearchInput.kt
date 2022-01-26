package com.lucascalderon1.login

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout


class CustomSearchInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {


    private val view =
        LayoutInflater.from(context).inflate(R.layout.custom_search_input, this, true)


}





