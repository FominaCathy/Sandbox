package FominaKat.Village;

public class Genie implements Resident {
    String name;

    public Genie(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "Genie";
    }
}
