package ClassCreation_09;


//Class creation
public class Dog {

    String name;
    int age;

    //Method to set the name
    public void setName(String newName){
        name=newName;
    }

    //method to display name
    public void display(){
        System.out.println("My name is: " + name);
    }


    //Main class to run the code
    public static void main(String[] args) {

        //Creating an object of the Dog class without constructors
        Dog d1= new Dog();
        d1.setName("Sharik");

        //Displaying the name using method
        d1.display();

    }

}


