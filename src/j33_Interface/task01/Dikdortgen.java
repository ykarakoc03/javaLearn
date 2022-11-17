package j33_Interface.task01;

public class Dikdortgen implements Sekil
{
    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1) {// varargs a girilen paremetre 1 ise
            return (boyut[0]*4);
        }else
            return (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length==1) {// varargs a girilen paremetre 1 ise
            return (boyut[0]*2);
        }else
            return (boyut[0]*boyut[1]);
    }
}
