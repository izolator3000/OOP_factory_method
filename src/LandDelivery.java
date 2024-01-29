public class LandDelivery extends DeliveryCompany{
    @Override
    Transport chooseTranspotr() {
        return new Car();
    }
}


