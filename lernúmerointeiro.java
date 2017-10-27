package operaçoes;
import java.io.*;
public class lernúmerointeiro {

	public static void main(String[] args) throws IOException
		
		{String C="";
	System.out.print("Digite um dígoto:");
    InputStreamReader LerS = new InputStreamReader (System.in);
    BufferedReader GuardaS = new BufferedReader (LerS);
    C = GuardaS.readLine();
    System.out.printf("Digitou :%d" ,  Integer.valueOf(C) );
		}
		
		
		}
		
