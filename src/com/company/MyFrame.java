package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    GraphicsDemo graphicDemo = new GraphicsDemo();
    //Variables for Size of Window
    int windowHeight = 750;
    int windowLength = 1400;

    public MyFrame() { //Properties of the Window
        this.setSize(windowLength,windowHeight); // Size of the Window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphicDemo);
        this.setVisible(true);
    }
}
