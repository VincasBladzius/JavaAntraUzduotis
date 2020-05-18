package players;

import java.util.ArrayList;
import java.util.Random;

public class Player<T> implements Comparable<Player>{
    private String firstName;
    private String lastName;
    protected String nationality;
    private int totalPoints;
    private int matchPoints;
    private double avgPoints;
    Random rand;
    DataFaker faker = new DataFaker();

    public Player() {
      setFirstName();
       setLastName();
    }//ctor


    public double getAvgPoints() {
        return avgPoints;
    }

    public void setAvgPoints(int gp) {
        this.avgPoints = getTotalPoints()/gp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = faker.GenerateName()[0];;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = faker.GenerateName()[1];;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int matchPoints) {
        this.totalPoints += matchPoints;
    }

    public int getMatchPoints() {
        return matchPoints;
    }

    public void setMatchPoints() {
        this.matchPoints = faker.GeneratePoints();;
    }
    public String getNationality() {
        return nationality;
    }

    @Override
    public int compareTo(Player o) {
        if(this.getAvgPoints() > o.getAvgPoints()){
            return 1;
        }else{
            return -1;
        }
    }
}
