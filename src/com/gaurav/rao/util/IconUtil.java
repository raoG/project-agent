/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.util;

import javax.swing.ImageIcon;

/**
 *
 * @author Gaurav
 */
public class IconUtil {
    
    public static enum PLANE_COLOR {
        BLACK   {@Override public String toString(){return "black";} },
        RED     {@Override public String toString(){return "black";} },
        YELLOW  {@Override public String toString(){return "black";} };
    }
    
    public ImageIcon planeIcon(Direction direction, int color){
        return new ImageIcon(getClass().getResource("/images/plane/"+ PLANE_COLOR.values()[color] +"/"+ direction.name()+".png"));
    }
    
    public ImageIcon windIcon(Direction direction){
        return new ImageIcon(getClass().getResource("/images/compass/"+ direction.name()+".gif"));
    }
}
