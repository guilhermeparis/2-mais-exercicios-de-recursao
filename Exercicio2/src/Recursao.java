
public class Recursao {

	//1) Modele e implemente um m�todo recursivo que calcule o fatorial de um n�mero
	//passado como par�metro.

	public int fatorial(int n) {
		if (n < 0)
			return -1;
		if (n == 0 || n == 1)
			return 1;
		return n * fatorial(n-1);

	}

	// 2)	Modele e implemente um m�todo recursivo que calcule o somat�rio de um 
	//	n�mero n (passado como par�metro) at� 0.

	public int somatorio(int n) {
		if(n==0)
			return 0;
		if(n>0)
			return n + somatorio(n-1);
		return n + somatorio(n+1);
	}

	// 3)	Modele e implemente um m�todo recursivo que calcule o n-�simo n�mero da
	//	sequ�ncia de fibonacci.

	public int fibonacci(int n) {
		if(n<=0)
			return -1;
		if (n == 1 || n == 2)
			return 1;
		return n = fibonacci (n-1) + fibonacci (n-2);
	}

	// 4)	Modele e implemente um m�todo recursivo que calcule o somat�rio dos n�meros
	//  inteiros entre os n�meros k e j, passados como par�metro.

	public int somatorio(int k, int j) {
		if(k==j)
			return k;
		if(k<j)
			return k + somatorio (k+1,j);
		return j + somatorio (j+1,k);
	}

//	5) Modele e implemente um m�todo recursivo que recebe um String em retorna true se
//este String for um pal�ndrome, false caso contr�rio.

	public boolean isPal(String s) {
		if (s.equals(null))
			return false;
		if(s.length() == 1)
			return true;
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			s.trim();
			return isPal(s);
		}
		return true;
	}


}
