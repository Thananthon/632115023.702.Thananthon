package Week7;

public class MainApplication {
    public static void main(String[] args) {
        Dog dog = new Dog("Big D", "Doberman Pinscher" , "brown" , 6);
        System.out.println("My dog");;
        dog.introduce();
        dog.run = "run";
        dog.run();
        dog.size = "big";
        dog.size();
        dog.bark = "Booooo Hong Hong!";
        dog.bark();
        dog.hair = true;
        dog.hair();
        System.out.println("--------------------------------------------------------->");

        Fish fish = new Fish("Pong", "Cat fish", "Black", 1);
        System.out.println("My Fish");
        fish.introduce();
        fish.size = "medium";
        fish.size();
        fish.speed = "fast";
        fish.speed();
        fish.water = true;
        fish.isSwim();
        System.out.println("--------------------------------------------------------->>");
        
        Bird bird = new Bird("Hua Grean", "Mynas", "Black and Brown", 1);
        System.out.println("My bird");
        bird.introduce();
        bird.country = "Thailand";
        bird.country();;
        bird.speak = "Yooo whatsup";
        bird.speak();
        bird.fly = true;
        bird.fly();
        System.out.println("--------------------------------------------------------->>>");
    }
    //Thananthon Koonyo 632115023
    
}
