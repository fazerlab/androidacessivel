package com.example.udpaccess;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class OverlayView extends View {

    private int x = 500;
    private int y = 500;
    private Paint paint;

    public OverlayView(Context ctx) {
        super(ctx);
        paint = new Paint();
        paint.setColor(0xFFFF0000);
    }

    public void updatePosition(int x, int y) {
        this.x = x;
        this.y = y;
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(x, y, 20, paint);
    }
}
