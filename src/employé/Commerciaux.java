/**
 * 
 */
package employé;

/**
 * @author Adama SOW
 *
 */
public class Commerciaux implements IEntreprise{
	private double salaireCommerciaux;
	private int primeVente;
	
	
	/**
	 * @param salaireCommerciaux
	 * @param primeVente
	 */
	public Commerciaux(int primeVente) {
		super();
		this.salaireCommerciaux = 0;
		this.primeVente = primeVente;
	}


	/**
	 * @return the salaireCommerciaux
	 */
	public double getSalaireCommerciaux() {
		return primeVente+10000;
	}


	@Override
	public void accept(IVisitorEntreprise v) {
		// TODO Auto-generated method stub
		v.VisitorCommerciaux(this);
		
	}

}
