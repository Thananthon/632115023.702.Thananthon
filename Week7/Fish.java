package Week7;

public class Fish extends Pets{
    String size;
    String speed;
    boolean water;
    
    public Fish (String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }

    public void size() {
        System.out.println("The size is " + size);
        
    }
    public void speed() {
        System.out.println("Swim " + speed);
        
    }
    public void isSwim() {
        System.out.println("fresh water: " + water);
    }
    //Thananthon Koonyo 632115023
    
}
