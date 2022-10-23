package j19_StativVariable;

public class Task01_Runner {
    public static void main(String[] args) {
        Task01_Rectangle nesne1= new Task01_Rectangle();

        System.out.println("nesne1.cevre() = " + nesne1.cevre());
        System.out.println("nesne1.alan() = " + nesne1.alan());

        Task01_Rectangle nesne2= new Task01_Rectangle(10,12);

        System.out.println("nesne2.cevre() = " + nesne2.cevre());
        System.out.println("nesne2.alan() = " + nesne2.alan());
    }
}
