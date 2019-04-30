package com.yuruiyin.richeditor.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yuruiyin.richeditor.RichUtils
import com.yuruiyin.richeditor.enumtype.InlineStyleEnum
import com.yuruiyin.richeditor.model.InlineStyleVm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mRichUtils by lazy {
        RichUtils(this, richEditText)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerEvents()
    }

    private fun registerEvents() {
        mRichUtils.init()
        // 加粗
        mRichUtils.initInlineStyle(
            InlineStyleVm(
                InlineStyleEnum.BOLD,
                ivBold,
                R.mipmap.icon_bold_normal,
                R.mipmap.icon_bold_light
            )
        )

        // 斜体
        mRichUtils.initInlineStyle(
            InlineStyleVm(
                InlineStyleEnum.ITALIC,
                ivItalic,
                R.mipmap.icon_italic_normal,
                R.mipmap.icon_italic_light
            )
        )

        // 删除线
        mRichUtils.initInlineStyle(
            InlineStyleVm(
                InlineStyleEnum.STRIKE_THROUGH,
                ivStrikeThrough,
                R.mipmap.icon_strikethrough_normal,
                R.mipmap.icon_strikethrough_light
            )
        )

        // 下划线
        mRichUtils.initInlineStyle(
            InlineStyleVm(
                InlineStyleEnum.UNDERLINE,
                ivUnderline,
                R.mipmap.icon_underline_normal,
                R.mipmap.icon_underline_light
            )
        )

    }
}
