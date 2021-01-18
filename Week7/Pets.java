package Week7;

public class Pets {
    String name;
    String species;
    String color;
    int age;
	
    public Pets(){

    }
    
    public Pets(String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }
    public void introduce() {
        System.out.println("Name: " + name + " Species: " + species + " Color: " + color + " Age: " + age );
       }
     //Thananthon Koonyo 632115023
    
}
