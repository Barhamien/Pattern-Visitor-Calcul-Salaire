/**
 * 
 */
package employé;

/**
 * @author Adama SOW
 *
 */
public interface IVisitorEntreprise {
	public void VisitorDirecteur(Directeur d);
	public void VisitorManager(Manager m);
	public void VisitorOuvrier(Ouvrier o);
	public void VisitorCommerciaux(Commerciaux c);
}
