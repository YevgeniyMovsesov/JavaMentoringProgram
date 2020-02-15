package lesson03;

public class Encapsulation_ClassA {
    private int a = 3;

    public void getA(){
        setA();
        System.out.println(a);
    }

    private void setA (){
        this.a = a+1;
    }

}
