import java.math.BigInteger;

public class EncontraPrimo extends Thread {
//Propriedades da classe
	private BigInteger candidatoPrimo = null;

public EncontraPrimo(BigInteger candidatoPrimo) {
	super();
	this.candidatoPrimo = candidatoPrimo;
}
	public void run() {
		boolean achei = true;
		for (BigInteger divisor = BigInteger.TWO;
				divisor.compareTo(candidatoPrimo.divide(BigInteger.TWO))<0;
				divisor = divisor.add(BigInteger.ONE)) {
			if(candidatoPrimo.remainder(divisor)== BigInteger.ZERO) {
				achei = false;
				break;
			}
		}
		if(achei) {
			System.out.println("======================");
			System.out.println("Achei!!! Fiquei milionário!!");
			System.out.println(candidatoPrimo);
		}
	}
}
