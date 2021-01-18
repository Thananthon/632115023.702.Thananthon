package Week7;

public class Dog extends Pets{
    String size;
    String bark;
    String run;
    boolean hair;
    
    

    public Dog (String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }

    public void size() {
        System.out.println("The size is " + size);
        
    }
    public void run() {
        System.out.println("My dog is " + run + " to the jungle");
        
    }
    public void bark() {
        System.out.println(bark);
        
    }
    public void hair() {
        System.out.println("Short hair: " + hair);
    }
    //Thananthon Koonyo 632115023
    
}
