package j37_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User kll1 = new User();
        kll1.name = "guzel insan ebu bekir ";
        //kll1.role=0;
        //kll1.status=1;

        kll1.yetki = Role.ADMIN;
        kll1.durum = Status.INACTIVE;

        User kll2 = new User();
        kll2.name = "Fatih bey";
        kll2.yetki = Role.CUSTOMER;
        kll2.durum = Status.LOGING;
        if (kll1.yetki == Role.ADMIN) {
            System.out.println("agam mühür sende admin sin sil se silelim");
        } else System.out.println("admin değil hava 1500 sefil customer");
        if (kll2.yetki == Role.ADMIN) System.out.println("agam mühür sende admin sin sil se silelim");
        else System.out.println("admin değil hava 1500 sefil customer");

    }


}

