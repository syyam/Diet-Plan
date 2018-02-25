package com.example.syyam.dietplan;

/**
 * Created by syyam on 31-Aug-16.
 */
public class Profile {
    private String alpha,beta, delta,theta,gamma;
    private String uid;

    public Profile()
    {

    }

    public Profile(String alpha, String beta, String delta, String theta, String gamma) {
        this.alpha=alpha;
        this.beta=beta;
        this.delta=delta;
        this.theta=theta;
        this.gamma=gamma;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public String getBeta() {
        return beta;
    }

    public void setBeta(String beta) {
        this.beta = beta;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getTheta() {
        return theta;
    }

    public void setTheta(String theta) {
        this.theta = theta;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }
}
