public class Truck extends Unit implements EngineService {


    public Truck(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    @Override
    public void service() {
        standardService();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовику");
    }


    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовику");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовику");
    }
}