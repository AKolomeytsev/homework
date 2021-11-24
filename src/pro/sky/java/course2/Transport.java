package pro.sky.java.course2;

public class Transport {
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
}
