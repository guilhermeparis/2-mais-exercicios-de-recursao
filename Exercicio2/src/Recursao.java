
public class Recursao {

	//1) Modele e implemente um método recursivo que calcule o fatorial de um número
	//passado como parâmetro.

	public int fatorial(int n) {
		if (n < 0)
			return -1;
		if (n == 0 || n == 1)
			return 1;
		return n * fatorial(n-1);

	}

	// 2)	Modele e implemente um método recursivo que calcule o somatório de um 
	//	número n (passado como parâmetro) até 0.

	public int somatorio(int n) {
		if(n==0)
			return 0;
		if(n>0)
			return n + somatorio(n-1);
		return n + somatorio(n+1);
	}

	// 3)	Modele e implemente um método recursivo que calcule o n-ésimo número da
	//	sequência de fibonacci.

	public int fibonacci(int n) {
		if(n<=0)
			return -1;
		if (n == 1 || n == 2)
			return 1;
		return n = fibonacci (n-1) + fibonacci (n-2);
	}

	// 4)	Modele e implemente um método recursivo que calcule o somatório dos números
	//  inteiros entre os números k e j, passados como parâmetro.

	public int somatorio(int k, int j) {
		if(k==j)
			return k;
		if(k<j)
			return k + somatorio (k+1,j);
		return j + somatorio (j+1,k);
	}

//	5) Modele e implemente um método recursivo que recebe um String em retorna true se
//este String for um palíndrome, false caso contrário.

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
