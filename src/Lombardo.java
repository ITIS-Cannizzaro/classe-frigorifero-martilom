import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Lombardo
{
	public static void main(String[] args) {
		Frigo a=new Frigo("A",500);
		Frigo b=new Frigo("A+",400);
		Frigo c=new Frigo("A++",600);
		a.Print();
		b.Print();
		c.Print();
		a.Prezzo();
		b.Prezzo();
		c.Prezzo();
	}

}
