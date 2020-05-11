package players;

import java.util.Random;

public class Player <T>{
    private String firstName;
    private String lastName;
    protected String position;
    private int totalPoints;
    Random rand;
    DataFaker faker = new DataFaker();

    public Player() {

        this.firstName = faker.GenerateName()[0];
        this.lastName = faker.GenerateName()[1];
    }//ctor

    public String getPosition() {
        return position;
    }

    public void setTotalPoints() {
        this.totalPoints += faker.GeneratePoints();
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
}
