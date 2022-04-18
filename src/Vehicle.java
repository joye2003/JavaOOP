public class Vehicle {
    private int wheel;
    Vehicle() {wheel = 4;}
    Vehicle(int n){wheel = 4;setWheel(n);}
    public void setWheel(int n){
        wheel = n;
    }
    public int getWheel(){
        return wheel;
    }
}
