package GetterAndMutatorMethods.Q2;

public class SecretIdentity {
    private String realName;
    private String occupation;
    private String homePlanet;

    // Constructor that accepts all atrributes
    public SecretIdentity(String realName, String occupation, String homePlanet) {
        this.realName = realName;
        this.occupation = occupation;
        this.homePlanet = homePlanet;
    }

    //getter method to get the realName
    public String getRealName() {
        return realName;
    }

    //getter method to return occupation
    public String getOccupation() {
        return occupation;
    }
    //getter method to return homeplanet
    public String getHomePlant() {
        return homePlanet;
    }

    // toString method for System.out.println()
        public String toString() {
        return "Real Name: " + realName + " is from planet " + homePlanet + " and works as a " + occupation + ".";
    }

}
