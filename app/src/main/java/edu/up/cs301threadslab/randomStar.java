package edu.up.cs301threadslab;


import java.util.Random;

public class randomStar extends Thread {

    AnimationView newAV;
    StarAnimation starAnimation;

    public randomStar(AnimationView newAV, StarAnimation starAnimation) {
        this.newAV = newAV;
        this.starAnimation = starAnimation;
    }


    @Override
    public void run() {
        Random random = new Random();
        boolean value = random.nextBoolean();
        while(true) {

            try {

                if(value) {
                    starAnimation.addStar();
                    newAV.postInvalidate();
                }
                else {
                    starAnimation.removeStar();
                    newAV.postInvalidate();
                }

                Thread.sleep(40);


           }
            catch(InterruptedException e) {}
        }
    }

}
