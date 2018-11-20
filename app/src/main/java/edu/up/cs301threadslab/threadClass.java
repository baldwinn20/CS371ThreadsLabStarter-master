package edu.up.cs301threadslab;


public class threadClass extends Thread {


    AnimationView newAV;

    public threadClass(AnimationView newAV) {
        this.newAV = newAV;
    }


    @Override
   public void run() {

       while(true) {
           try {
               newAV.postInvalidate();
               Thread.sleep(50);
          }
          catch(InterruptedException e) {}
       }
  }

}
