package com.chito.music.musicgenerator.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weighting {

    int value;
    int weighting;

    public Weighting(int v, int w) {
        this.value = v;
        this.weighting = w;
    }



public static int weightedRandom(List<Weighting> weightingOptions) {

    //determine sum of all weightings
    int total = 0;
    for (Weighting w : weightingOptions) {
        total += w.weighting;
    }

    //select a random value between 0 and our total
    int random = new Random().nextInt(total);

    //loop thru our weightings until we arrive at the correct one
    int current = 0;
    for (Weighting w : weightingOptions) {
        current += w.weighting;
        if (random < current)
            return w.value;
    }

    //shouldn't happen.
    return -1;
}

public static void main(String[] args) {

    List<Weighting> weightings = new ArrayList<Weighting>();
    weightings.add(new Weighting(0, 1));
    weightings.add(new Weighting(1, 8));
    weightings.add(new Weighting(2, 1));

    for (int i = 0; i < 100; i++) {
        System.out.println(weightedRandom(weightings));
    }
}
}
