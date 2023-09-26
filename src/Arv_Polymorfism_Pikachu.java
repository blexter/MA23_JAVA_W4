import java.sql.SQLOutput;

public class Arv_Polymorfism_Pikachu extends Arv_Polymorfism_Pokemon {

    public Arv_Polymorfism_Pikachu(String name){
        super(name, "electric");
    }

    @Override
    public void attack(){
        System.out.println("Piika!! " + this.name + " Attack!!!");
    }
}
