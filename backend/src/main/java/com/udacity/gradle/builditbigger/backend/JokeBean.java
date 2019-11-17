package com.udacity.gradle.builditbigger.backend;

import com.triangon.joke_factory.JokeFactory;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private String mJoke;

    public String getJoke() {
        return mJoke;
    }

    public void setJoke(String joke) {
        this.mJoke = joke;
    }

}