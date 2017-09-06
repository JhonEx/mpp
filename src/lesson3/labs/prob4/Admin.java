package lesson3.labs.prob4;

public class Admin {
	public static double computeTotalRent(Object[] properties) {
		double totalRent = 0.0;

		for(Object p:properties){
			if(p instanceof Property) {
				totalRent += ((Property)p).computeRent();
			}
		}
//		double totalRent = 0;
//		for (Object o : properties) {
//			if (o instanceof House) {
//				House h = (House) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Condo) {
//				Condo h = (Condo) o;
//				totalRent += h.computeRent();
//			}
//			else if (o instanceof Trailer) {
//				Trailer h = (Trailer) o;
//				totalRent += h.computeRent();
//			}
//		}
		return totalRent;
	}
}
