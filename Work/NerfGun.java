package Work;

public class NerfGun {
    private int bullets;
    private String GunID;

    public NerfGun(){
        bullets = 0;
        GunID = "1";
    }

    public NerfGun(int bullet) {
        this.bullets = bullet;
        GunID = "2";
    }

    public void fire() {
        if (bullets > 0) {
            System.out.println("BANG !!!");
            bullets--;
        } else
            System.out.println("There is no ammunition");
    }

    public void reload(int bullet) {
        if (bullets + bullet <= 15)
            bullets += bullet;
        else
            System.out.println("Error!! the ammuituion is overload");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + GunID);
    }

    public void displayNumOfAmmunition() {
        System.out.println(bullets + " bullet left");
    }
    ////Thananthon Koonyo 632115023
    

    }

