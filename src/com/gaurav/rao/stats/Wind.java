/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gaurav.rao.stats;

import com.gaurav.rao.util.Direction;
import com.gaurav.rao.util.IconUtil;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Gaurav
 */
public class Wind {

    private static int windIndex;
    private static Direction direction;
    private static int speed;
    private final static Random random = new Random();
    private final static IconUtil icons;
    
    static {
        windIndex = 0;
        direction = Direction.E;
        icons = new IconUtil();
    }
    
    public static void startBlowing(final JLabel speedLabel, final JLabel directionLabel) {

        final long startTime = System.currentTimeMillis();
        final long PLAY_TIME = (random.nextInt(6)+1) * 1000;
        
        int changeInDirection = random.nextInt(5) - 5;
        windIndex = (windIndex + changeInDirection) % 15;
        
        if(windIndex < 0) windIndex += 15;
        direction = Direction.values()[windIndex];
        speed = random.nextInt(20);
        
        speedLabel.setText(speed+"");
        directionLabel.setIcon(icons.windIcon(direction));
        
        Timer timer = new Timer(30, new ActionListener() {
                         
            public void actionPerformed(ActionEvent e) {
                long duration = System.currentTimeMillis() - startTime;
                
                if (duration >= PLAY_TIME) {
                    ((Timer) (e.getSource())).stop();
                    startBlowing(speedLabel, directionLabel);
                }
            }
        });
        timer.start();
    }

    public static int windEffect(Point agentLocation, int agentDirectionIndex){
        
        int diff = agentDirectionIndex - windIndex;
        
        if (diff < 4){
            agentLocation.x = (int)Math.round(agentLocation.x + Math.cos(.392857*diff));
            agentLocation.y = (int)Math.round(agentLocation.y + Math.cos(.392857*diff));
            return 0;         
        } else if (diff < 8) {
            agentLocation.x = (int)Math.round(agentLocation.x + Math.sin(.392857*diff));
            agentLocation.y = (int)Math.round(agentLocation.y + Math.cos(.392857*diff));
            return 1;
        } else {
            agentLocation.x = (int)Math.round(agentLocation.x + Math.cos(.392857*diff));
            agentLocation.y = (int)Math.round(agentLocation.y + Math.sin(.392857*diff));
            return 2;
        }
    }
}
