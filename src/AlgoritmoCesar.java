import java.util.Scanner;

public class AlgoritmoCesar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		
		int saida=0;
		String palavra;
		do 	{
		
		System.out.println("******Digite o que quer fazer******");
		System.out.println("1- Encriptar mensagem");
		System.out.println("2- Decriptar mensagem");
		System.out.println("3- Sair do Programa");
		saida = leitor.nextInt();
		
			if(saida==1) 
			{
				System.out.println("Digite sua palavra para ser encriptada");
				palavra = word.nextLine();
				
				String Cifrado = Encriptar(palavra);
				
				System.out.println(Cifrado);
				
			}
			
			else if(saida==2) 
			{
				System.out.println("Digite sua palavra para ser decriptada: ");
				palavra = word.nextLine();
				
				String Decifrado = Decriptar(palavra);
				
				System.out.println(Decifrado);
				
			}
			else
			{
				System.out.println("Escolha um número do menu");
				System.out.println();
			}
		
			}while(saida != 3);
		
		leitor.close();
		word.close();

	}
	/*public static void Encriptar(String palavra) {
		for(int i = 97;i < 123;i ++ )
			{
			for(int j = 0;j < palavra.length(); j++)
				{
				char x = palavra.charAt(j);
					if (x == i) 
						x+=3;
					else if(x > 122 ) 
					{
						while(x>122)
						x-=26;
					}
													
				}
			}
		}*/
		public static String Encriptar( String palavra) 
		{
			StringBuilder textoCifrado = new StringBuilder();
			int tamanho = palavra.length();
			for (int i = 0;i < tamanho;i++) 
			{
				int letraASCII = ((int)palavra.charAt(i)) + 3;
				
				while(letraASCII > 126)
					letraASCII -= 94;
				
				textoCifrado.append((char)letraASCII);
				
			}
				return textoCifrado.toString();
		
		}
		
		public static String Decriptar( String palavra) 
		{
			StringBuilder textoCifrado = new StringBuilder();
			int tamanho = palavra.length();
			for (int i = 0;i < tamanho;i++) 
			{
				int letraASCII = ((int)palavra.charAt(i)) - 3;
				
				while(letraASCII < 32)
					letraASCII += 94;
				
				textoCifrado.append((char)letraASCII);
				
			}
				return textoCifrado.toString();
		
		}
		
		
	}


