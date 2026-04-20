package com.example.udpaccess;

public class CursorController {
    public static float x = 500;
    public static float y = 500;
    public static OverlayView overlay;

    public static void move(float dx, float dy) {
        x += dx;
        y += dy;
        if (overlay != null) {
            overlay.updatePosition((int)x, (int)y);
        }
    }
}
