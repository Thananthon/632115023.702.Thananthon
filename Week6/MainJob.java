package Week6;

public class MainJob extends Person {
    String genre1;
    String genre2;
    String genre3;
    String genre4;
    String genre5;
    

    public MainJob(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void job1() {
        System.out.println(name +"'s job is " + genre1);
        
    }
    public void job2() {
        System.out.println(name +"'s job is " + genre2);
        
    }
    public void job3() {
        System.out.println(name +"'s job is " + genre3);
        
    }
    public void job4() {
        System.out.println(name +"'s job is " + genre4);
        
    }
    public void job5() {
        System.out.println(name +"'s job is " + genre5);
        
    }

}
