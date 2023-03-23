
public class MeuPrograma {

	public static void main(String[] args) {

		// // declaracao variveis
		// // fortemente tipado
		//
		// // int a=10;//inteiro
		// // float b=10; //ponto flutuante
		// // double c; //ponto flutuante
		// // String seLiga = "Vai dar certo!";
		// // boolean d = true;
		// // char letra='a';
		// // String msg= "Olá mundo" +" "+ seLiga + " "+ d +" "+ letra + (a+b);
		//
		// // operadores
		// // + adição
		// // + concatenacao
		// //
		// // > < != ==
		//
		// // Logicos
		// // and &&
		// // or ||
		// // !
		// // %
		//
		// // porta logica
		// // 1 && 1 = 1// 0 && 1 = 0 // 0 && 0 =0
		// // 1 || 1 = 1 // 1 || 0 = 1 // 0 || 0 = 0
		//
		// // estruturas de decisao
		// int primeiroValor = 10;
		// int segundoValor = 20;
		// boolean controleChave = false;
		//
		// // !controleChave igual controleChave= false
		// // controleChave igaul controleChave
		//
		// // if - else
		// if (!((primeiroValor != segundoValor) && controleChave)) {
		// System.out.println("Verdadeiro");
		// } else {
		// System.out.println("Falso");
		// }
		//
		// // if - else if - else
		// if (primeiroValor > segundoValor) {
		// System.out.println("primeiroValor maior segundo valor");
		// } else if (primeiroValor == segundoValor) {
		// System.out.println("valores iguais");
		// } else {
		// System.out.println("primeiroValor menor segundo valor");
		// }
		// int chave = 20;

		// chave e valor
		// switch (chave) {
		//
		// case 10:
		// System.out.println("Chave igual a 10");
		// break;
		// case 20:
		// System.out.println("Chave igual a 11");
		// break;
		//
		// default:
		// System.out.println("padrao");
		// break;
		// }
		// String nomeAluno="Juliana";
		// String nomeAluno2="Juliana";
		//
		// if(nomeAluno.equals(nomeAluno)) {
		// System.out.println("dentro if");
		// }else
		// System.out.println("dentro else");
		//
		// estrutura de repeticao
		// for
		// while
		// do while
		// foreach
		// recursao

		// a = a+1 igual a++

		int soma = 0;
		for (int a = 0; a < 10; a++) {
			soma += a;
			System.out.println("numero: " + a + "soma: "+ soma);
		}
		System.out.println("Final");

	}

}
