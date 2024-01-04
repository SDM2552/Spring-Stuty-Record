package sec02.exam01;

public class TypeEx {

	public static void main(String[] args) {
		String str2=""+10+2;
		System.out.println(str2);
		String str3="3.14";
		double value=Double.parseDouble(str3);
		System.out.println(str3);
		int ival=(int)Double.parseDouble(str3);
		System.out.println(ival);
		
		byte b=17;
		int i=10;
		short s=20;
		char c='A';
		float f=4.1f;
		double d=5.7;
		String st="A";
		
		char var=(char)st.charAt(0);
		System.out.println(var);
		
		double max=Double.MAX_VALUE;
		double ov=(double)(max+1);
		System.out.println(ov);
	}

}
