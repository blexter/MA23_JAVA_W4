public class Exercise_Hej_Bilist_MilitaryTank extends Exercise_Hej_Bilist_Vehicle{

    public Exercise_Hej_Bilist_MilitaryTank() {
        super("Tank", 2000);

        System.out.println(super.getType() + " created. " + super.getMiles() + " miles to go!");
    }

}
