package day1.examples;

import java.util.Scanner;

import javax.swing.JFrame;

public class FirstClass {

	public static void main(String[] args) {
SecClass chuj = new SecClass(); 	
	double dupa; 
	double dupa2; 

Scanner Bibi = new Scanner(System.in); 

System.out.println("podaj 1 liczbe");
dupa  = Bibi.nextDouble(); 
 

for (double i = 1 ; i <= dupa ; ++i) {
	if (dupa  > 0)	 
	System.out.println("liczba " + i);
	
	if (dupa  < 0) 
		System.out.println("nic"  );
	
}

System.out.println("podaj 2 liczbe");
dupa2  = Bibi.nextDouble();
System.out.println("wynik a do potêgi b to " + chuj.PizdazDupom(dupa,dupa2)) ;
System.out.println("wynik grindcore " + chuj.Grindcore(dupa2)) ;
System.out.println(chuj.Nicnierobi(dupa));

Okienko okieneczko = new Okienko() ; 
okieneczko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
okieneczko.setVisible(true);


	}


	
}
