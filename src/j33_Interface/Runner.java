package j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn= new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.kaporta();
        dgshn.motor();
        System.out.println("dgshn.sisLamp() = " + dgshn.sisLamp());// default conc. meth-> obj ile call edildi
        dgshn.sunroof();
        dgshn.yakit();
        System.out.println("disDonanim.RENK = " + disDonanim.RENK);
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        //System.out.println("Lastik.RENK = " + RENK);//Ayni isimli variableler interface ile call edilir
        //IcDonanim.KUMAS="deri";//CTE Final varianle atama yapilmaz
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);
        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC);
        disDonanim.anten();//static conc. meth. Interface name ile call oldu

    }
}
