package pro.sky.java.course2;

public class ServiceStation {
    public void check(Transport trasport) {
        if (trasport != null) {
            System.out.println("Обслуживаем " + trasport.getModelName());
            for (int i = 0; i < trasport.getWheelsCount(); i++) {
                trasport.updateTyre();
            }
            trasport.checkEngine();
            trasport.checkTrailer();
        }
    }
}
