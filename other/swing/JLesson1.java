package com.company.javaFundamentals.other.swing;

import javax.swing.*;
import java.awt.*;

public class JLesson1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height/2 - 150, 500, 300);
        jFrame.setTitle("This is Vit application");
    }
}
