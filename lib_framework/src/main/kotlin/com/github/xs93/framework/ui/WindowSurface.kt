package com.github.xs93.framework.ui

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.github.xs93.framework.BR

/**
 * 可以获取界面的padding值
 *
 * @author XuShuai
 * @version v1.0
 * @date 2022/8/19 15:57
 * @email 466911254@qq.com
 */
class WindowSurface : BaseObservable() {

    var contentPadding: ContentPadding = ContentPadding.EMPTY
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.contentPadding)
        }
}