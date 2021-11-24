package pro.sky.java.course2;

public class Truck extends Transport implements MethodsTransport{
    public Truck(String name,int cnt){
        super(name,cnt);
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
