public class MountainBike extends bicycle{
    public MountainBike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("Mountain Bike!");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);
        }
    }
    public void speedup(int gear){
        setCurrentSpeed(getCurrentSpeed()+(gear*5));
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-(gear*5));
        }
    }
    public void Break(){
        setCurrentSpeed(getCurrentSpeed() - 5);
    }
    
}
