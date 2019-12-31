package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;  // implícita
		System.out.println(a);
		
//		float b = 1.0F;
		float b = (float) 1.12345; // explícita (CAST)
		System.out.println(b);
		
		int c = 126;
		byte d = (byte)c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // implícita
		System.out.println(f);
	}
}
