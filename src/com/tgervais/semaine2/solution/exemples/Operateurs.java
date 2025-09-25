package com.tgervais.semaine2.solution.exemples;

public class Operateurs {

	public static void main(String[] args) {
		
		int a, b, c = 6;
		
		//Associativit�:
		a = b = c = 0;
		
		//Incr�mentation :
		a = 7;	
		a++;
		//a vaut 8

		a = 7;	
		++a;
		//a vaut 8 
	
		a = 7;	
		b = a++;
		//a vaut 8, b vaut 7

		a = 7;	
		b = ++a;
		//a vaut 8, b vaut 8

		a = 7;	
		c = 3 * a++ + 2;
		//a vaut 8, c vaut 23

		a = 7;	
		c = 3 * ++a + 2;
		//a vaut 8, c vaut 26
		
		//Cast (transtypage ou conversion de types) :
		a = 15;
		b = 6;
		
		c = a/b;
		//c vaut 2 (division enti�re)
		
		double d;
		d = a/b;
		//d vaut 2.0 (division enti�re)

		d = (double)a/b;
		//d vaut 2.5 (division r�elle)

		//Affectations :
		a = 8;
		
		a += 3 ;  // a = a + 3;
		
		a = 8;
		a -= 1;   // a = a - 1; OU: a--;
		
		a = 8;
		a *= 2;  // a = a * 2;
	}
}
