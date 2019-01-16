package com.stackroute.domain;

public class Movie {
    public Actor actor;
    public Movie movie;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}

