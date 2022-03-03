package com.example.android.minipaint

data class MCircle(
    val posX: Float,
    val posY: Float,
    val radius: Float,
    val widthOfStroke: Float,
    val color: Int,
    val shouldFillCircle: Boolean = false
)

data class MSemieCircle(
    val posX: Float,
    val posY: Float,
    val radius: Float,
    val widthOfStroke: Float,
    val color: Int,
    val shouldFillCircle: Boolean = false
)