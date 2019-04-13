/**
 * 
 */
package employé;

/**
 * @author Adama SOW
 *
 */
public class Manager implements IEntreprise{
	private double salaireManager;
	private int indice;
	private int prime;
	private double salaireDebase;
	/**
	 * @param salaireManager
	 * @param indice
	 * @param prime
	 * @param salaireDebase
	 */
	public Manager(int prime, int indice, double salaireDebase) {
		super();
		
		this.salaireManager =0;
		this.indice = indice;
		this.prime = prime;
		this.salaireDebase = salaireDebase;
	}
	/**
	 * @return the salaireManager
	 */
	public double getSalaireManager() {
		return prime*indice+salaireDebase;
	}
	@Override
	public void accept(IVisitorEntreprise v) {
		// TODO Auto-generated method stub
		v.VisitorManager(this);
	}

}
