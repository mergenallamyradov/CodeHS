package GetterAndMutatorMethods.Q2;

public class Power {
    private String name;
    private int strength;

    //constructor that accepts both attributes
    public Power(String name, int strength){
        this.name=name;
        this.strength=strength;
    }

    // getter method for name
    public String getName(){
        return name;
    }

    //getter method for strength
    public int getStrength(){
        return strength;
    }

    //Mutator for strength attribute
    public void setStrength(int theStrenght){
        strength=theStrenght;
    }


}
