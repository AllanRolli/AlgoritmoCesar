import java.util.Scanner;

public class AlgoritmoCesar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		
		int saida=0;
		String palavra;
		do 	{	//enquanto nao selecionar a saida do programa, executara o menu
		
		System.out.println("******Digite o que quer fazer******");
		System.out.println("1- Encriptar mensagem");
		System.out.println("2- Decriptar mensagem");
		System.out.println("3- Sair do Programa");
		saida = leitor.nextInt();
		
			if(saida==1) //se escolher a saida 1, executara o codigo de criptar a mensagem
			{
				System.out.println("Digite sua palavra para ser encriptada");
				palavra = word.nextLine();	//captura da palavra digitada pelo usuario
				
				String Cifrado = Encriptar(palavra); //Variavel passa pela função de Encriptar a mensagem e ja retorna
				
				System.out.println(Cifrado); //printa na tela a palavra encriptada
				
			}
			
			else if(saida==2) //se escolher a saida 2, executara o codigo de decriptar a mensagem
			{
				System.out.println("Digite sua palavra para ser decriptada: ");
				palavra = word.nextLine();	//captura da palavra digitada pelo usuario
				
				String Decifrado = Decriptar(palavra); //Variavel passa pela função de Decriptar a mensagem e ja retorna
				
				System.out.println(Decifrado); //printa na tela a palavra encriptada
				
			}
			else //se usuario digitar um numero maior que 3 executa este codigo e volta para o menu
			{
				System.out.println("Escolha um número do menu");
				System.out.println();
			}
		
			}while(saida != 3);
		
		leitor.close(); //fecha a variavel leitor
		word.close();	//fecha a variavel word

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
		public static String Encriptar( String palavra) //entrada da função de encriptar a mensagem
		{
			StringBuilder textoCifrado = new StringBuilder();//construção da StringBuilder, utilizado para concatenar em loop
			int tamanho = palavra.length();
			for (int i = 0;i < tamanho;i++) //mantera o laço enquanto a palavra nao termina
			{
				int letraASCII = ((int)palavra.charAt(i)) + 3;//declara a variavel para ser a letra na posição i+3
				
				while(letraASCII > 126)  //mantera no laço enquanto estiver no alfabeto e caracteres especiais
					letraASCII -= 94;//esta diminuição serve para manter no alfabeto o caracter a ser adicionado
				
				textoCifrado.append((char)letraASCII);//comando para concatenar a palavra
				
			}
				return textoCifrado.toString();//retorna a palavra concatenada pela função
		
		}
		
		public static String Decriptar( String palavra) 
		{
			StringBuilder textoCifrado = new StringBuilder();//construção da StringBuilder, utilizado para concatenar em loop
			int tamanho = palavra.length();
			for (int i = 0;i < tamanho;i++) //mantera o laço enquanto a palavra nao termina
			{
				int letraASCII = ((int)palavra.charAt(i)) - 3;//declara a variavel para ser a letra na posição i-3
				
				while(letraASCII < 32) //mantera no laço enquanto estiver no alfabeto e caracteres especiais
					letraASCII += 94;//este acréscimo serve para manter no alfabeto o caracter a ser adicionado
				
				textoCifrado.append((char)letraASCII);//comando para concatenar a palavra
				
			}
				return textoCifrado.toString();//retorna a palavra concatenada pela função
		
		}
		
		
	}


