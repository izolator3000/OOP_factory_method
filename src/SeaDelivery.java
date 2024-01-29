public class SeaDelivery extends DeliveryCompany{
    @Override
    Transport chooseTranspotr() {
        return new Ship();
    }
}
