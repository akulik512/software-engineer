package udemy;

public class Temp {

    public String toString() {
        return "temp";
    }

    protected void finalize() {
        System.out.println("Finalize method");
    }

}
