package lesson03;

public class Cat_Class {
    private String mew;

    private void setMew(String message){
        this.mew = message;
    }

    public void sayMew(String message) {
        this.setMew(message);
        System.out.println(mew);
    }
}
