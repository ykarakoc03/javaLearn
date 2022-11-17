package j33_Interface;

public interface disDonanim {

    public void kapi();// abs. meth.
    void kaporta();//abs meth.
    String RENK="opak kirmizi";//public static final variable

    public default String sisLamp(){// default conc. meth.
        return "sisli havada dikkat";
    }
    static void anten(){
        System.out.println("aga  yine antin kuntin islerdesin");
    }
     //public static default void sorunMethod(){//CTE-> static default keyword ayni anda kullanilamaz
     //
     //}

    //disDonanim obj = new disDonanim(); //obje olamaz.

    //public static void main (String[] args){// bad practice -> projede tek bir main method kullanilmali
    //    System.out.println("RENK= "+RENK);
    //    aga();
    //}






}
