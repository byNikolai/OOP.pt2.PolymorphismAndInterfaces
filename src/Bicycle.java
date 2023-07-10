public class Bicycle extends Unit {

    public Bicycle(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    @Override
    public void service() {
        standardService();

    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеду");
    }
}