/**
 * 
 */
package employé;

/**
 * @author Adama SOW
 *
 */
public class TesteEntreprise {
	public static void main(String[] args){
		
		//Calcul salaire Directeur
		Directeur dg=new Directeur(150000, 12, 300000);
		CalculSalaire visitor=new CalculSalaire();
		dg.accept(visitor);
		System.out.println("Salaire du directeur "+dg.getSalaireDirecteur());
		
		//Calcul salaire Manager
		Manager manager=new Manager(80000, 5, 150000);
		CalculSalaire visitor1=new CalculSalaire();
		manager.accept(visitor1);
		System.out.println("Salaire du Manager "+manager.getSalaireManager());
		
		//Calcul salaire Commerciale
		Commerciaux com=new Commerciaux(75000);
		CalculSalaire visitor2=new CalculSalaire();
		com.accept(visitor2);
		System.out.println("Salaire du commercial: "+com.getSalaireCommerciaux());
		
		//Calcul salaire Ouvrier
		Ouvrier ouvr=new Ouvrier(7, 1450);
		CalculSalaire visitor3=new CalculSalaire();
		ouvr.accept(visitor3);
		System.out.println("Salaire de l'ouvrier: "+ouvr.getSalaireOuvrier());
	}

}
