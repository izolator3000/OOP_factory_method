public class ManagerDeliver {
    public void order(){
        System.out.println("Hi! I'll deliver the parcel first to Moscow, and then to the Red Sea");
        delive();
    }
    private void delive(){
        Car car = new Car();
        Ship ship = new Ship();

        car.deliver();
        ship.deliver();
    }
}
