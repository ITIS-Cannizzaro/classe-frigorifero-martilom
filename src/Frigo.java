

public class Frigo {
	double Prezzo;
	String Cla;
	int Litri;
	double val=0;
	
	public Frigo(String Cla,int Litri) {
		this.Cla=Cla;
		this.Litri=Litri;
	}
	
	public String getClas() {
		return Cla;
	}
	
	public int getLitri() {
		return Litri;
	}
	public void Print() {
		System.out.println("Frigo di classe "+ Cla +", di "+Litri+" Litri");
	}
	public void Prezzo() {
		if (Cla=="A") {
			val=5;
		}
		else if (Cla=="A+") {
			val=1.5;
		}
		else if (Cla=="A++") {
			val=2;
		}
		Prezzo=5*Litri*val;
		System.out.println("Il prezzo del frigo di classe "+Cla+" di "+Litri+" Litri è "+ Prezzo+ " Euro");
	}

}
