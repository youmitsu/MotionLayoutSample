package jp.co.youmitsu.myapplication

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.support.constraint.motion.MotionLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import jp.co.youmitsu.myapplication.databinding.LayoutCustomMotionEdittextBinding

class CustomMotionEditTextLayout : MotionLayout {

    private val binding: LayoutCustomMotionEdittextBinding
    private val _title = ObservableField<String>("")
    private val _value = ObservableField<String>("")
    var title: String?
        get() = _title.get()
        set(value) {
            _title.set(value)
        }
    var value: String?
        get() = _value.get()
        set(value) {
            _value.set(value)
        }

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.CustomMotionEditTextLayout, 0, 0)
        try {
            title = a.getString(R.styleable.CustomMotionEditTextLayout_title)
            value = a.getString(R.styleable.CustomMotionEditTextLayout_value)
        } finally {
            a.recycle()
        }
        val inflater = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(inflater, R.layout.layout_custom_motion_edittext, this, true)
        binding.data = this
    }

}