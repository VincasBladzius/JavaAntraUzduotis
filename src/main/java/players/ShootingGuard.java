package players;

public class ShootingGuard<T extends Player>{

    private final String position;

    public ShootingGuard() {
        this.position = "Shooting Guard";
    }

    public String getPosition() {
        return position;
    }
}

