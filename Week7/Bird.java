package Week7;

public class Bird extends Pets{
    String country;
    String speak;
    boolean fly;
    

    public Bird (String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }

    public void country() {
        System.out.println("Country of this bird is " + country);
        
    }
    public void speak() {
        System.out.println(speak);
        
    }
    public void fly() {
        System.out.println("Can fly: " + fly);
        
    }
    //Thananthon Koonyo 632115023
}
