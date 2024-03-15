import java.math.BigInteger;

public class Principal {
	public static void main(String[] args) {
		BigInteger candidatoPrimo = new BigInteger ("12320000");
		while (true) {
			if(Thread.activeCount()<100) {
				new EncontraPrimo(candidatoPrimo).start();
				candidatoPrimo = candidatoPrimo.add(BigInteger.ONE);
			}else {
				try {
					Thread.sleep(10000);}catch(Exception e) {}
				}
			}
		}		
	}


