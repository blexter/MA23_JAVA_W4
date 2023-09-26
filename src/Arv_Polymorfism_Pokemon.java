public class Arv_Polymorfism_Pokemon {
    protected String name;
    private String type;

    public Arv_Polymorfism_Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(this.name + " Attacks!");
    }
}
