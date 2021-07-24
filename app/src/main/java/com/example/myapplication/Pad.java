package com.example.myapplication;

import android.graphics.RectF;

public class Pad {


    private RectF rect = new RectF();
    float height, width, padVelocity;


    public void setPadposition(float height, float width) {
        rect.bottom = this.height;
        rect.top = this.height - height;
        rect.right = (this.width + width) / 2;
        rect.left = (this.width - width) / 2;
    }

    public void padMover(float a)
    {
        rect.left += a;
        rect.right += a;
    }

    public float getPadVelocity()
    {
        return padVelocity;
    }

    public RectF getRect()
    {
        return rect;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public void setPadVelocity(float padVelocity)
    {
        this.padVelocity = padVelocity;
    }
}