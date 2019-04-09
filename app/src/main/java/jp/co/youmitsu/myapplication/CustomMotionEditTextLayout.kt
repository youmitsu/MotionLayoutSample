package jp.co.youmitsu.myapplication

import android.content.Context
import android.support.constraint.motion.MotionLayout
import android.util.AttributeSet
import android.view.LayoutInflater

class CustomMotionEditTextLayout : MotionLayout {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        LayoutInflater.from(context).inflate(R.layout.activity_test, this, true)
    }

}