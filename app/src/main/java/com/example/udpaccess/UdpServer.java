package com.example.udpaccess;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {

    public static void start() {
        new Thread(() -> {
            try {
                DatagramSocket socket = new DatagramSocket(5000);
                byte[] buffer = new byte[1024];

                while (true) {
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    socket.receive(packet);

                    String msg = new String(packet.getData(), 0, packet.getLength());
                    handle(msg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void handle(String msg) {
        if (msg.startsWith("MOVE")) {
            String[] p = msg.split(" ");
            CursorController.move(
                Float.parseFloat(p[1]),
                Float.parseFloat(p[2])
            );
        }

        if (msg.equals("CLICK")) {
            if (MyAccessibilityService.instance != null) {
                MyAccessibilityService.instance.click(
                    CursorController.x,
                    CursorController.y
                );
            }
        }
    }
}
