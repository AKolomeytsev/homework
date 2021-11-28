package pro.sky.java.course2;

public class Car extends Transport{
    public Car(String name,int cnt){
        super(name,cnt);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        this.updateTyre();
        this.checkEngine();
    }
}
