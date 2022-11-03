package j26_Inheritance.Inheritance01;

public class Kedi extends Mammal{

    public Kedi() {//en uste default super() var bu nedenle Mammal const. call olur.

        System.out.println("Kedinin parametresiz const.");
    }

    public void cirlama(){
        System.out.println("Kedi fena cirmalar miyavlar.");
    }
}
