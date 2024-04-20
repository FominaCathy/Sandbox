package FominaKat.Village;

public class Monster implements Resident {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getType() {
        return "Monster";
    }
}
