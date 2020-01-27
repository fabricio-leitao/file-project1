package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Informando o caminho do arquivo previamente criado
		
		File file = new File("C:\\Users\\Beco\\eclipse-workspace\\file-project1\\in.txt");
		Scanner sc = null;
		try {
			//Intanciando o Scanner com o file de parametro
			sc = new Scanner(file);
			//Enquanto tiver uma pr�xima linha fa�a
			while(sc.hasNextLine()) {
				//imprimindo as linhas do arquivo
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e){
			//Exce��o informando o erro
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null)
			{
				//Fechando o scanner
				sc.close();
			}
		}
	}

}
