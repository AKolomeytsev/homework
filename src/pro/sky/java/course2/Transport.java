package pro.sky.java.course2;

public abstract  class Transport implements MethodsTransport {
    private String modelName;
    private int wheelsCount;

    public Transport(String name, int cnt) {
        this.modelName = name;
        this.wheelsCount = cnt;
    }

    public void setModelName(String name){
        this.modelName = name;

    }
    public void setWheelsCount(int cnt){
        this.wheelsCount = cnt;
    }
    public String getModelName(){
        return this.modelName;
    }
    public int  getWheelsCount(){
        return this.wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println();
    }
}
