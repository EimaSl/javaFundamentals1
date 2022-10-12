package com.company.javaFundamentals.other.swing;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JLesson6 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                int i = 0;
            }
        });
        }



    private static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(750,250,500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
