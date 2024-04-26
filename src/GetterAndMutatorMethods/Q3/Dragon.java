package GetterAndMutatorMethods.Q3;

public class Dragon {
    private String attack;
    private int level;

    //write constructor here
        public Dragon(String attack, int level){
        this.attack=attack;
        this.level=level;
        }
    //methods needed
    public String getAttack(){
            return attack;
    }

    public int getLevel(){
            return level;
    }

    //String representation of the object @override toString method
    public String toString(){
            return "Dragon is at level " + level + " and attacks with " +attack;
    }
}
