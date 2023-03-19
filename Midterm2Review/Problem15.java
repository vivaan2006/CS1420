package Midterm2Review;

public class Problem15 {
    int distanceTraveled;

    public Problem15() {
        this.distanceTraveled = 0;
    }
    public int getDistanceTraveled(){
        return distanceTraveled;
    }
    public int increaseDistance(int amount){
        distanceTraveled = distanceTraveled + amount;
        if(distanceTraveled >= 100_000){
            distanceTraveled = distanceTraveled % 100_000;
        }
        return distanceTraveled;
    }

}
