package GetterAndMutatorMethods.Q2;

public class SuperHeroRunner {
    public static void main(String[] args) {

        Power superStrength = new Power("Super strength", 100);
        SecretIdentity clarkKent = new SecretIdentity("ClarkKent", "Journalist", "Krypton");
        SuperHero superMan = new SuperHero("Super Man", superStrength, clarkKent);

        //This will return the toString() of the SecretIdentity class
        System.out.println(superMan.getIdentity());

        //This will return the toString() of the SuperHero class
        System.out.println(superMan);
    }
}
