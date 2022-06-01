package next_int;

public abstract class Animal {

	protected String nom;
	
	protected abstract void crier() ;
	
	protected abstract String getNom() ;

	public Animal(String nom) {
		this.nom = nom;
	}
	
}
