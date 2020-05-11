package players;

public class PointGuard<T> extends Player {

    private final String position;

    public PointGuard() {
        this.position = "Point Guard";
    }

    public String getPosition() {
        return position;
    }
}
