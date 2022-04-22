import java.util.Collections;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant(1, "hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(1,"youssef");
		List<Etudiant> l=new ListEtudiant();
		l.add(e1); l.add(e2); l.add(e1); l.add(e3);
		System.out.println(l);
	}
	public static void mesEtudiants() 
	{
		Etudiant e1=new Etudiant(1, "hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(1,"youssef");
		ListEtudiant myList=new ListEtudiant();
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
	}

	}

}
