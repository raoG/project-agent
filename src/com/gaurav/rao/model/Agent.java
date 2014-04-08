/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gaurav.rao.model;

import com.gaurav.rao.stats.Coordinate;
import com.gaurav.rao.stats.Weather;

/**
 *
 * @author Gaurav
 */
public class Agent {
    
    
    private final String name;
    private final String model;
    private final int maxDistance;
    private final int maxSpeed;
    private final int maxStorage;
    
    private Coordinate currentLocation; 
    private Weather weather;
    private float speed;
    private String direction; 

    public Agent(String name, String model, int maxDistance, int maxSpeed, int maxStorage){
        this.name        = name;
        this.model       = model;
        this.maxDistance = maxDistance;
        this.maxSpeed    = maxSpeed;
        this.maxStorage  = maxStorage;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxStorage() {
        return maxStorage;
    }
    
    public Coordinate getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Coordinate currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    
}
