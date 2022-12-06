package j23_Varargs_StringBuilder.StringBuilder;

public class C3_SB_Soru02 {

	public static void main(String[] args) {
		  String s1 ="Java";
		System.out.println(s1.hashCode());
		String s2="Java";
		System.out.println(s2.hashCode());
		// StringBuilder s2=new StringBuilder("Java");
	      if (s1==s2) {    // CTE
	            System.out.println("1");
	        } else {
	            System.out.println("2");
	}
	}
}
