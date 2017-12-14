package teste;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		int N,FAT=1;
		 System.out.print("Digite um inteiro positivo inferior a 32:");
		 Scanner lerS = new Scanner (System.in);
		 N= lerS.nextInt ();
		 for(int M=N; M>=1;M--)
		FAT*=M;
		System.out.printf("%d!=%d#",N,FAT);
	}

}
