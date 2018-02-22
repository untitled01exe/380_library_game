public class Time {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		while((end-start) < 1000) {
			end = System.currentTimeMillis();
		}
		System.out.println("\nProgram ran for " + (end-start) + " miliseconds.");
	}	
}

