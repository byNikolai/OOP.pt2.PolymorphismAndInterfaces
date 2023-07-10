public class Car extends Unit implements EngineService {

    public Car(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    @Override
    public void service() {
        standardService();
        checkEngine();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машине");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машине");
    }
}