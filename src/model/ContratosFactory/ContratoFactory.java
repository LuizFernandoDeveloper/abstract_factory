package model.ContratosFactory;

import model.car.Car;
import model.car.camaro.Camaro;
import model.car.ferrari.Ferrari;
import model.factory.Factory;

public class ContratoFactory extends Factory {

    @Override
    protected Car retriveCar(String requestGrade) {
        if("A".equals(requestGrade)) {
        return  new Ferrari(100, "cheio", "azul");
        }else {
        return new Camaro(100, "cheio", "preto");
        }
    }
}
