/**
 * 
 */
package employé;

/**
 * @author Adama SOW
 *
 */
public class CalculSalaire implements IVisitorEntreprise {
	private double Salaire;
	
	
	/**
	 * @param salaire
	 */
	

	public CalculSalaire() {
		super();
		this.Salaire=0;
		
	}

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return Salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.Salaire = salaire;
	}

	@Override
	public void VisitorDirecteur(Directeur d) {
		this.setSalaire(getSalaire()+d.getSalaireDirecteur());
		
	}

	@Override
	public void VisitorManager(Manager m) {
		// TODO Auto-generated method stub
		this.setSalaire(getSalaire()+m.getSalaireManager());
		
	}

	@Override
	public void VisitorOuvrier(Ouvrier o) {
		// TODO Auto-generated method stub
		this.setSalaire(getSalaire()+o.getSalaireOuvrier());
		
	}

	@Override
	public void VisitorCommerciaux(Commerciaux c) {
		// TODO Auto-generated method stub
		this.setSalaire(getSalaire()+c.getSalaireCommerciaux());
		
	}
}
