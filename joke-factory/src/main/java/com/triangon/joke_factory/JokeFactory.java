package com.triangon.joke_factory;

import java.util.Random;

public class JokeFactory {
    String[] mJokes = {
            "How many programmers does it take to change a light bulb?\nNone – It’s a hardware problem",
            "A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.",
            "Have you heard about the new Cray super computer?  It’s so fast, it executes an infinite loop in 6 seconds.",
            "The generation of random numbers is too important to be left to chance."
    };


    public String getAJoke() {
        Random r=new Random();
        int randomNumber=r.nextInt(mJokes.length);
        return mJokes[randomNumber];
    }
}
