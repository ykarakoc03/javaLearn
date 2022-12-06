package j23_Varargs_StringBuilder.StringBuilder.Team03Sunum;

public class HizTesti {

    public static void main(String[] args) {
        long stringBaslangıcSüre=System.currentTimeMillis();
        StringİleEklme();
        System.out.println("String "+(System.currentTimeMillis()-stringBaslangıcSüre)+" ms");
        System.out.println("String = > daha yavas ,Immutable==> degisemez,\n" +
                "String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.");
        System.out.println("********");

        long StringBufferBaslagıcSüre=System.currentTimeMillis();
        StringBufferİleEkleme();
        System.out.println("StringBuffer "+(System.currentTimeMillis()-StringBufferBaslagıcSüre)+" ms");
        System.out.println("StringBuffer =mutable==>degisebilir,\n" +
                " StringBuffer synchronized,thread safe.\n efficient/ hızlı ,");
        System.out.println("********");


        long StringBuilderBaslagıcSüre=System.currentTimeMillis();
        StringBuilderİleEkleme();
        System.out.println("StringBuilder "+(System.currentTimeMillis()-StringBuilderBaslagıcSüre)+" ms");
        System.out.println("StringBuilders = mutable==>degisebilir ,\n" +
                "not senkronized/not thread safe,\nfakat more efficient(daha etkili,ve hizli )");


    }
    private static String StringBuilderİleEkleme() {
        StringBuilder builder =new StringBuilder("java");
        for (int i = 0; i < 100000; i++) {
            builder.append("Programlama");
        }
        return builder.toString();
    }
    private static String StringBufferİleEkleme() {
        StringBuffer sb=new StringBuffer("java");
        for (int i = 0; i < 100000; i++) {
            sb.append("Programlama");
        }
        return sb.toString();
    }

    private static String StringİleEklme() {
        String t="Java";
        for (int i = 0; i < 100000; i++) {
           t=t+"Programlama";
        }
    return t;
    }


}
