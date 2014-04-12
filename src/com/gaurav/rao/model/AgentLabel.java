/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaurav.rao.model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;

/**
 *
 * @author Gaurav
 */
public class AgentLabel extends JLabel {

    public AgentLabel() {
        super();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gx = (Graphics2D) g;
        gx.rotate(0.2, getX() + getWidth() / 2, getY() + getHeight() / 2); //Rotate 0.2 radians around the center of the label
        super.paintComponent(g);
    }
}
