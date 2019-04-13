package employé;

public class Directeur implements IEntreprise{
	private double SalaireDirecteur;
	private double bonus;
	private int indice;
	private double salaireDebase;
	/**
	 * @param salaireDirecteur
	 * @param bonus
	 * @param indice
	 * @param salaireDebase
	 */
	public Directeur(double bonus, int indice, double salaireDebase) {
		super();
		SalaireDirecteur = 0;
		this.bonus = bonus;
		this.indice = indice;
		this.salaireDebase = salaireDebase;
	}
	@Override
	public void accept(IVisitorEntreprise v) {
		v.VisitorDirecteur(this);
		
	}
	/**
	 * @return the salaireDirecteur
	 */
	public double getSalaireDirecteur() {
		return salaireDebase*indice+bonus;
	}
	
}
