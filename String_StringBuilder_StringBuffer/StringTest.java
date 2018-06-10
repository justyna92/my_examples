public class StringTest {
	public static void main(String[] args) {
		String a = "Jestem ";
		a = a + "Tomek";
		System.out.println(a);
		//równe z:
		String b = new StringBuilder("Lubie ").append("grac w pilke.").toString();
		System.out.println(b);
		
		long startTime = System.nanoTime();
		String z = "z";
		for(int i=0;i<10000;i++){
			z = z + "z";
		}
		System.out.println("Time_1: "+(System.nanoTime() - startTime));
		
		long startTime2 = System.nanoTime();
		String x = "x";
		StringBuilder xB = new StringBuilder(x);
		for(int i=0;i<10000;i++) {
			xB.append("x");
		}
		x = xB.toString();
		System.out.println("Time_2: "+(System.nanoTime() - startTime2));
		
		long startTime3 = System.nanoTime();
		String y = "y";
		StringBuffer yBuff = new StringBuffer(y);
		for(int i=0;i<10000;i++) {
			yBuff.append("y");
		}
		y = yBuff.toString();
		System.out.println("Time_3: "+(System.nanoTime() - startTime3));
	}
}