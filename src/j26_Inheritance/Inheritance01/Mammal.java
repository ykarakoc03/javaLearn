package j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancik{
    public Mammal() {// en uste default super() var bu nedenle hayvanin const. call olur.
        System.out.println("Mammal parametresiz const.");
    }

public void sutBeslenme(){
    System.out.println("bebekleri sut ile beslenir");
}

    public void dogum(){
        System.out.println("nur topu gibi yavrusu olur");
    }




}
