package com.example.android.minipaint

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF

fun Canvas.drawCircleExt(mCircle: MCircle) {
    val paint = Paint()
    paint.color = mCircle.color
    if (mCircle.shouldFillCircle.not()) {
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = mCircle.widthOfStroke
    }
    this.drawCircle(
        mCircle.posX,
        mCircle.posY,
        mCircle.radius,
        paint
    )
}

fun Canvas.drawSemiCircle(mSemieCircle: MSemieCircle) {
    val radius = mSemieCircle.radius
    val oval = RectF(
        mSemieCircle.posX - radius,
        mSemieCircle.posY - radius,
        mSemieCircle.posX + radius,
        mSemieCircle.posY + radius
    )
    val paint = Paint()
    paint.color = mSemieCircle.color
    if (mSemieCircle.shouldFillCircle.not()) {
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = mSemieCircle.widthOfStroke
    }
    this.drawArc(oval, -0f, -180f, false, paint)
//        paint.setColor(Color.RED)
//        extraCanvas.drawArc(oval, -90f, -89f, false, paint)
}


