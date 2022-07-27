package B7_String_Demo;

public class B7_A4th_String_Buffer_Builder_Performance {
	
	public static void compare() {
		
		StringBuilder sb=new StringBuilder("TestDemo");
		long starttime = System.currentTimeMillis();
		for(int i=0; i<=10000000; i++) {
			sb.append("java");
		}
		long endtime = System.currentTimeMillis();
		System.out.println("Time takes by buider "+(endtime-starttime)+" ms");
		
		StringBuffer sf=new StringBuffer("TestDemo");
		 starttime = System.currentTimeMillis();
		for(int j=0; j<=10000000; j++) {
			sf.append("java");
		}
		 endtime = System.currentTimeMillis();
		System.out.println("Time takes by buffer "+(endtime-starttime)+" ms");
	}
	public static void main(String[] args) {
		compare();
	}

}
