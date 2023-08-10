import model.ContratosFactory.ContratoFactory;
import model.car.Car;
import model.custumer.Custumer;
import model.factory.Factory;
import model.semContractFactory.SemContratosFactory;

public class Main {
    public static void main(String[] args) {
        Custumer client = new Custumer("A", false);
        Factory factory = getFactory(client);
         Car car = factory.create(client.getGradeRequest());
         car.startEngine();
    }

    private static Factory getFactory(Custumer cliente) {
        if (cliente.HasCompanyContract()) {
            return new ContratoFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}