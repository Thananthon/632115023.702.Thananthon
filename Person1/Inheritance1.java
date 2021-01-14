package Person1;

public class Inheritance1 {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20 , "male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        MainJob job1 = new MainJob("Tam", 19, "Male");
        job1.genre1 = "software Engineer";
        job1.introduce();
    
        MainJob job2 = new MainJob("Tawan", 19, "Male");
        job2.genre2 = "architecture";
        job2.introduce();

        MainJob job3 = new MainJob("Ploy", 20, "Female");
        job3.genre3 = "beautician";
        job3.introduce();

        MainJob job4 = new MainJob("Pim", 19, "Female");
        job4.genre4 = "tour guide";
        job4.introduce();

        MainJob job5 = new MainJob("Ter", 19, "Male");
        job5.genre5 = "bodybuilder";
        job5.introduce();
        
    }
    //Thananthon Koonyo 632115023
    
}
