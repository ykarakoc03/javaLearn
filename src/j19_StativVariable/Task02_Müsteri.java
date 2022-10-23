package j19_StativVariable;

public class Task02_Müsteri {
    String name;
    int müsteriId = 1000;

    public Task02_Müsteri(String name) {
        this.name = name;
        müsteriId++;
        System.out.println("Müşteri isim :" + name + "\nmüsteri Id :" + müsteriId);
        Task02_ElektirikHesap fatura1 = new Task02_ElektirikHesap();


    }
}
