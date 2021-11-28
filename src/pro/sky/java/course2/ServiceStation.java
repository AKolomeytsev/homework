package pro.sky.java.course2;

public class ServiceStation {
    public void check(Transport trasport) {
        if (trasport != null) {
            trasport.service();
        }
    }
}
