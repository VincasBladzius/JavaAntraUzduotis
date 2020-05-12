package players;

public class France<T extends Player>{

    private final String nationality;

    public France() {
        this.nationality = "Power Forward";
    }

    public String getNationality() {
        return nationality;
    }
}
