package jp.co.youmitsu.myapplication

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.constraint.motion.MotionLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import jp.co.youmitsu.myapplication.databinding.LayoutCustomMotionEdittextBinding

class CustomMotionEditTextLayout : MotionLayout {

    private val binding: LayoutCustomMotionEdittextBinding
    val title: String = ""
    val value: String = ""

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        val inflater = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(inflater, R.layout.layout_custom_motion_edittext, this, true)
        binding.title = title
        binding.value = value
    }

}