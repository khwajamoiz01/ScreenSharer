package com.screen.cast;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@Data
public class ImagePanel extends JPanel {
    private BufferedImage img;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, this);
        }
    }
}
