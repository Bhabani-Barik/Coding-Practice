package SettersAndGetters;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        car.setMake("Maserati");
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("Make:: " + car.getMake());
        System.out.println("Model:: " + car.getModel());
        System.out.println("Color:: " + car.getColor());
        System.out.println("Door:: " + car.getDoors());
        System.out.println("IsConvertible:: " + car.isConvertible());
        car.describeCar();

        //second Instance
        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Carrera");
        targa.setColor("Red");
        targa.setDoors(2);
        targa.setConvertible(false);

        targa.describeCar();

    }
}
