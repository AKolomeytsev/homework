package pro.sky.java.course2;

public class Bicycle extends Transport{
    public Bicycle(String name,int cnt){
        super(name,cnt);
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        this.updateTyre();
    }
}
