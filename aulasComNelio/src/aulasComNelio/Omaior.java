package aulasComNelio;
import java.util.*;
/*programa que verifica qual o maior numero por meio de funcoes*/
public class Omaior {
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Por favor insira 3 numeros");
			
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			
			int maiorValor = tresValores(a,b,c);
			textoMaiorValor(maiorValor);
			sc.close();
		}

		public static int tresValores(int x,int y,int z) {
			int maior;
			if(x>y && x>z) {
				maior = x;
			}else if (y>z) {
				maior = y;
			}else {
				maior = z;
			}
			return maior;
				
		}
		public static void textoMaiorValor(int valor) {
			System.out.println("O maior valor dos 3 inseridos é : " + valor);
		}
			
		}
