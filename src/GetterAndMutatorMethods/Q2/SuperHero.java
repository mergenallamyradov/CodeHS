package GetterAndMutatorMethods.Q2;

public class SuperHero {
    private String name;
    private Power superPower;
    private SecretIdentity identity;

    //constructor for object attributes
    public SuperHero(String name, Power power, SecretIdentity theIdentity) {
        this.name = name;
        superPower = new Power(power.getName(), power.getStrength());
        identity = new SecretIdentity(theIdentity.getRealName(), theIdentity.getOccupation(), theIdentity.getHomePlant());
    }

    public int getStrength() {
        return superPower.getStrength();
    }

    public SecretIdentity getIdentity() {
        return identity;
    }

    //This will include the toString() from the identity class.
    public String toString(){
        return name + "\'s secret identity: " + identity;
    }
}
