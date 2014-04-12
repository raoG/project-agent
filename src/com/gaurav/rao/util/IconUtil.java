/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.util;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author Gaurav
 */
public class IconUtil {
    
    public static enum PLANE_COLOR {
        BLACK   {@Override public String toString(){return "black";} },
        RED     {@Override public String toString(){return "red";} },
        YELLOW  {@Override public String toString(){return "yellow";} };
    }
    
    private static Map<String, ImageIcon> planeMap = new HashMap<>();
    
    public ImageIcon planeIcon(Direction direction, int color){
        String str = "/images/plane/"+ PLANE_COLOR.values()[color] +"/"+ direction.name()+".png";
        
        if(planeMap.get(str) == null)
            planeMap.put(str, new ImageIcon(getClass().getResource("/images/plane/"+ PLANE_COLOR.values()[color] +"/"+ direction.name()+".png")));
        
        return planeMap.get(str);
    }
    
    public ImageIcon windIcon(Direction direction){
        return new ImageIcon(getClass().getResource("/images/compass/"+ direction.name()+".gif"));
    }
}
