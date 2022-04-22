
public class Etudiant implements Comparable<Etudiant> 
{
	int id;
	String nom;
	double note;
	public Etudiant(int a,String b) 
	{
		this.id=a;
		this.nom=b;
		note=10;
	}
	@Override
	public String toString()
	{
		return this.nom+" : "+note;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if( ! (obj instanceof Etudiant) )  return false;
		Etudiant etudiant=(Etudiant)obj;
		return etudiant.id==this.id;

	}
	@Override
	public int compareTo(Etudiant etudiant)
	{
        return Double.compare()			
	}
}
