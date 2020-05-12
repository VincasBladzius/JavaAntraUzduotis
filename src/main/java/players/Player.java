package players;

import java.util.Random;

public class Player <T>{
    private String firstName;
    private String lastName;
    public String nationality;
    private int totalPoints;
    private int matchPoints;
    Random rand;
    DataFaker faker = new DataFaker();

    public Player() {

        this.firstName = faker.GenerateName()[0];
        this.lastName = faker.GenerateName()[1];
    }//ctor

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String position) {
        this.nationality = position;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints() {
        this.totalPoints += matchPoints;
    }

    public int getMatchPoints() {
        return matchPoints;
    }
    public void setMatchPoints() {
        this.matchPoints = faker.GeneratePoints();;
    }
}
