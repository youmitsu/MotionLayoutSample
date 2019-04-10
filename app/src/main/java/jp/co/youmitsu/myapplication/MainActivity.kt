package jp.co.youmitsu.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var text: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
//        nickname_value.setOnTouchListener { v, event ->
//            motion_layout.transitionToEnd()
//            edit_text.requestFocus()
//            edit_text.setSelection(edit_text.length())
//            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.showSoftInput(edit_text, InputMethodManager.SHOW_IMPLICIT)
//            true
//        }
//        edit_text.setOnFocusChangeListener { v, hasFocus ->
//            text = (edit_text.text as SpannableStringBuilder).toString()
//            edit_text.setText(text)
//            nickname_value.text = if (text.isEmpty()) "--" else text
//            if (!hasFocus) {
//                motion_layout.transitionToStart()
//                val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//                inputMethodManager.hideSoftInputFromWindow(motion_layout.windowToken, 0)
//            }
//        }
//        motion_layout.setOnTouchListener { v, event ->
//            edit_text.clearFocus()
//            true
//        }
//        nickname_value.text = if (text.isEmpty()) "--" else text
//        edit_text.setText(text)
    }
}
