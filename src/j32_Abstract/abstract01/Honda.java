package j32_Abstract.abstract01;

public abstract class Honda {
// abs class'da variable tanimlanabilir mi
    String name= "honda";//evet

    //variable'lar abstract tanimlanir mi?-> kesinlikle hayir
    //public abstract int yas=48; //olamaz
    public abstract void motor();//abstract method

    void sunrooff() {//somut method
        System.out.println("keyifli bir secim ama extra ucretli");
    }

    abstract void koltuk();

    abstract void kapi();

    //final void finalMethod();//concerete method body'siz olamaz
    //final abstract void finalMethod();//abs method final olamaz. beraber tanimlanamaz
    final void finalMethod(){
        System.out.println("body li final concerete method");
    }


    //private  void privateMethod();//concerete method body'siz olamaz
    //private abstract void privateMethod();//abs method private ile birlikta olamaz. beraber tanimlanamaz

    private  void privateMethod(){
        System.out.println("body li private concerete method");
    }

    //static void gunesMethod();//concerete method body'siz olamaz
    //static abstract void gunesMethod();//abs method static ile birlikta olamaz. beraber tanimlanamaz

    static void gunesMethod(){
        System.out.println("body li static concerete method");
    }



}



