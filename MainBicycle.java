public class MainBicycle {
    public static void main(String[] args) {
        NormalBike nb = new NormalBike(10);
        nb.speedup();
        nb.Break();
        nb.speedup();
        nb.displaySpeed();
        MountainBike mb = new MountainBike(10);
        mb.speedup(2);
        mb.Break();
        mb.displaySpeed();
        mb.speedup(3);
        mb.displaySpeed();
        mb.speedup(4);
        mb.displaySpeed();
    }
}
    

