package com.optiapp.foodlist.data

import com.optiapp.foodlist.R
import com.optiapp.foodlist.model.Declaration

class DataSource {
    fun loadDelarations():List<Declaration>{
        return listOf<Declaration>(
            Declaration(R.drawable.ikeys),
            Declaration(R.drawable.eba),
            Declaration(R.drawable.amala),
            Declaration(R.drawable.ofada),
            Declaration(R.drawable.optimust),
            Declaration(R.drawable.semo_egusi)

        )
    }
}