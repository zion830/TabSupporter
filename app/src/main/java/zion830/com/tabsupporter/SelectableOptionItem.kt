package zion830.com.tabsupporter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import zion830.com.tabsupporter.databinding.LayoutOptionBinding

class SelectableOptionItem @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private val binding = LayoutOptionBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }
}