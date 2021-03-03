package week10;
class person{
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
}
public class Human {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Human human = new Human();
        System.out.println("the first calling hit(Animal)");
        human.hit(dog);

        Cat cat = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(cat);

        person person = new person();
        Fish fish = new Fish();

        System.out.println("When the person hit fish.");
        person.hit(fish);
    }

	
    
}
