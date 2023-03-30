package com.example.zidingyi_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CircleVIew extends View {
    public CircleVIew(Context context) {
        super(context);
        init();
    }

    public CircleVIew(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CircleVIew(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private int mColor=Color.RED;
    private Paint mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);


    //涂色
    private void init(){
        mPaint.setColor(mColor);
    }


    //重写ondraw方法，实现画圆
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //不考虑padding前
//        int width=getWidth();
//        int height=getHeight();
//        int radius=Math.min(width,height)/2;
//        canvas.drawCircle(width/2,height/2,radius,mPaint);

        //考虑时
        final int paddingLeft=getPaddingLeft();
        final int paddingRight=getPaddingRight();
        final int paddingTop=getPaddingTop();
        final int paddingBottom=getPaddingBottom();

        int width=getWidth()-paddingLeft-paddingRight;
        int height=getHeight()-paddingBottom-paddingTop;
        int radius=Math.min(width,height)/2;
        canvas.drawCircle(paddingLeft+width/2,paddingTop+height/2,radius,mPaint);
    }


}
