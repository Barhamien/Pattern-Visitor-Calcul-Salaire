/**
 * 
 */
package employé;

/**
 * @author Adama SOW
 *
 */
public class Ouvrier implements IEntreprise {
	private double salaireOuvrier;
	private double nombreHeure;
	private double salaireHoraire;

	/**
	 * @param nombreHeure
	 */
	public Ouvrier(double nombreHeure, double salaireHoraire) {
		super();
		this.salaireOuvrier=0;
		this.nombreHeure = nombreHeure;
		this.salaireHoraire=salaireHoraire;
	}

	@Override
	public void accept(IVisitorEntreprise v) {
		// TODO Auto-generated method stub
		v.VisitorOuvrier(this);
	}

	/**
	 * @return the salaireOuvrier
	 */
	public double getSalaireOuvrier() {
		return nombreHeure*salaireHoraire+5000;
	}

}
