package pro.sky.java.course2;

public class Bicycle extends Transport implements MethodsTransport{
    public Bicycle(String name,int cnt){
        super(name,cnt);
    }
    @Override
    public void checkEngine() {
        System.out.println();
    }
}
