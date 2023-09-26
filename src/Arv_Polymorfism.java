import java.util.ArrayList;

public class Arv_Polymorfism {
    public static void main(String[] args) {

        Arv_Polymorfism_Pikachu p1 = new Arv_Polymorfism_Pikachu("David");
        Arv_Polymorfism_Pikachu p2 = new Arv_Polymorfism_Pikachu("Per");

        Arv_Polymorfism_Balbasaur b1 = new Arv_Polymorfism_Balbasaur("Susan");
        Arv_Polymorfism_Balbasaur b2 = new Arv_Polymorfism_Balbasaur("Lois");

        ArrayList<Arv_Polymorfism_Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(p2);
        pokedex.add(b1);
        pokedex.add(b2);


        for(Arv_Polymorfism_Pokemon p : pokedex) {
            //System.out.println("name: " + p.getName());
            p.attack();
        }

        b1.talk();

        Arv_Polymorfism_Pokemon currentPokemon = pokedex.get(2);

        //((Arv_Polymorfism_Balbasaur) currentPokemon).talk();

    }
}