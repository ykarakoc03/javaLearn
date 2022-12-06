package j23_Varargs_StringBuilder.StringBuilder.Team03Sunum;

public class kayit_yeri {
    public static void main(String[] args) {
        System.out.println("String Hashcode Test:");
        String str = "java";
        System.out.println(str.hashCode());
        str="Programlama";
        System.out.println(str.hashCode() + "=String java ekleme yeri ");
       // str = str + "programlama";
        ///System.out.println(str.hashCode() + "=String programlama ekleme yeri ");

        System.out.println("\n**************\n");
        System.out.println("StringBuffer Hashcode Test:");
        StringBuffer buffer = new StringBuffer("java");
        System.out.println(buffer.hashCode() + "=Buffer java ekleme yeri");
        buffer.append("programlama");
        System.out.println(buffer.hashCode() + "=Buffer programlama ekleme yeri ");

        System.out.println("\n**************\n");
        System.out.println("StringBuilding Hashcode Test:");
        StringBuilder builder = new StringBuilder("java");
        System.out.println(builder.hashCode() + "=Builder java ekleme yeri");
        builder.append("programlama");
        System.out.println(builder.hashCode() + "=Builder programlama ekleme yeri ");


    }
}
