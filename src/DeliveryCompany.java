public abstract class DeliveryCompany {
    public void orderDelivery(){
        Transport transport = chooseTranspotr();
        transport.deliver();
    }
    abstract Transport chooseTranspotr();

}
