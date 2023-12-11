
public class EntierNaturel {
	private int entier;

	public EntierNaturel(int entier) throws @MauvaiseConstanteException(){
		super();
		
		if (entier<0)
			throw new MauvaiseConstanteException();
		this.entier = entier;
		
	}
	
	
	
}
