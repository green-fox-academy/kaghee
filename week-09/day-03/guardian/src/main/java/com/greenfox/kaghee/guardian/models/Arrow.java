package com.greenfox.kaghee.guardian.models;

public class Arrow {
    Double distance;
    Double time;
    Double speed;


    public Arrow(double distance, double time) {
        this.distance = distance;
        this.time = time;
        speed = distance / time;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
