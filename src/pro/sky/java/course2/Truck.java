package pro.sky.java.course2;

public class Truck extends Transport {
    public Truck(String name,int cnt){
        super(name,cnt);
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();
    }
}
