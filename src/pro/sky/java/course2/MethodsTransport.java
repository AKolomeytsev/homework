package pro.sky.java.course2;

public interface MethodsTransport {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    default void checkTrailer() {
        System.out.println();
    }
}
