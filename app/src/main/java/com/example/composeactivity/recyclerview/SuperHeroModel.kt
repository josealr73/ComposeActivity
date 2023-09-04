package com.example.composeactivity.recyclerview

import androidx.annotation.DrawableRes

data class SuperHeroModel(
    var name: String,
    var realName: String,
    var publisher: String,
    @DrawableRes var photo: Int
)
