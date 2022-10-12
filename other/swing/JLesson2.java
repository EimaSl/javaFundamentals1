package com.company.javaFundamentals.other.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class JLesson2 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());


//        check available fonts
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s : fonts) {
//            System.out.println(s);
//        }

    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 20);
            Graphics2D graphics2D = (Graphics2D) g;
            graphics2D.setFont(font);
            graphics2D.drawString("Hello world", 50, 50);
            Point2D point2D1 = new Point2D.Double(70, 70);
            Point2D point2D2 = new Point2D.Double(70, 270);
            Line2D line2D = new Line2D.Double(point2D1, point2D2);
//            graphics2D.draw(line2D);


            Ellipse2D el = new Ellipse2D.Double(70, 70, 170, 170);
//            graphics2D.draw(el);
//            graphics2D.setPaint(new Color(12,15,63));
            graphics2D.setPaint(Color.red);
            graphics2D.draw(el);

            Rectangle2D r2 = new Rectangle2D.Double(70,70,170,170);
            graphics2D.draw(r2);

            try {
                URL url = new URL("https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/800px-Java_programming_language_logo.svg.png");
                Image image = new ImageIcon(url).getImage();
                graphics2D.drawImage(image, 220,50,null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }
    }


    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setTitle("This is Vit application");
        return jFrame;
    }

}
