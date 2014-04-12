/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaurav.rao.model;

import com.gaurav.rao.map.Location;
import com.gaurav.rao.stats.Wind;
import com.gaurav.rao.util.Direction;
import com.gaurav.rao.util.DirectionUtil;
import com.gaurav.rao.util.DistanceUtil;
import com.gaurav.rao.util.IconUtil;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Gaurav
 */
public class Agent {

    private final String name;
    private boolean available;

    private float speed;
    private Point currentLocation;
    private int directionIndex;
    private Direction direction;

    private ImageIcon imageIcon;
    private final JLabel imageLabel;

    private Location destination;
    private Location source;

    public Agent(String name, float speed, JLabel imageLabel) {
        this.name = name;
        this.speed = speed;
        this.imageLabel = imageLabel;
        this.imageLabel.setVisible(false);
        currentLocation = new Point();

    }

    public ImageIcon imageIcon() {
        return imageIcon;
    }

    public JLabel imageLabel() {
        return imageLabel;
    }

    public String name() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean availability) {
        available = availability;
    }

    public Point currentLocation() {
        currentLocation.x = imageLabel.getLocation().x;
        currentLocation.y = imageLabel.getLocation().y;

        return currentLocation;
    }

    public Direction direction() {
        return direction;
    }

    public void setSourceAndDestination(Location source, Location destination) {
        this.source = source;
        this.destination = destination;
    }

    public void run() {

        if (source == null || destination == null) {
            return;
        }
        final Point srcCo = source.getCoordinate();
        final Point dstCo = destination.getCoordinate();
        
        setAvailability(false);
        imageLabel.setLocation(srcCo);
        imageLabel.setVisible(true);
        
        currentLocation.x = srcCo.x;
        currentLocation.y = srcCo.y;


        final IconUtil icons = new IconUtil();

        Timer timer = new Timer(30, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentLocation.x == dstCo.x && currentLocation.y == dstCo.y) {
                    setAvailability(true);
                    imageLabel.setVisible(false);
                    ((Timer) (e.getSource())).stop();
                }

                Point old = currentLocation;

                //System.out.println(theta + "->" + speed*Math.sin(theta) +" "+ speed*Math.cos(theta));
                double theta = DirectionUtil.getTheta(currentLocation, destination.getCoordinate());

                
                if ((dstCo.x - currentLocation.x) > 0) {
                    currentLocation.x = (int) Math.round(currentLocation.x + Math.abs(speed * Math.cos(theta)));
                } else {
                    currentLocation.x = (int) Math.round(currentLocation.x - Math.abs(speed * Math.cos(theta)));
                }

                if ((dstCo.y - currentLocation.y) > 0) {
                    currentLocation.y = (int) Math.round(currentLocation.y + Math.abs(speed * Math.sin(theta)));
                } else {
                    currentLocation.y = (int) Math.round(currentLocation.y - Math.abs(speed * Math.sin(theta)));
                }

                int color = 0;
                color = Wind.windEffect(currentLocation, directionIndex);

                directionIndex = DirectionUtil.getDirectionIndex(currentLocation, destination.getCoordinate());
                direction = Direction.values()[directionIndex];

                ImageIcon img = icons.planeIcon(direction, color);
                imageLabel.setIcon(img);

                imageLabel.setLocation(currentLocation.x, currentLocation.y);

            }
        });
        timer.start();
    }
}
