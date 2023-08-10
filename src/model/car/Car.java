package model.car;

public  abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println("the"+ fuelSource + "engine has started, and is ready to utilize" + horsePower);
    }
    public  void clean(){
        System.out.println("Car has ben cleand, and the "+ color.toLowerCase() + "color shines");
    }

    public void mechanicCheck(){
        System.out.println("Car has ben checked by the mechanic. Everything looks good!");
    }

    public void fuelCar(){
        System.out.println("Car is beign filled with " + fuelSource.toLowerCase());
    }
}
