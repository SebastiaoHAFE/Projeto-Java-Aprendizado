package TreinamentoFocoDeterminacao;

public class exercicios {

	public static void main(String[] args) {
		System.out.println("Ola Mundo");
		System.out.println("Pra Quem Tem F�, A Vida N�o Tem Fim !");
        
		System.out.println("----------------------------------------");
		System.out.println(" Curriculum Vitae ");
		System.out.println("----------------------------------------");
		
		String nome = "Sebasti�o Henrique Albuquerque Fernandes Esperidi�o";
		String idade = "35 Anos";
		String estadoCivil = "Casado";
		String filho = " Tenho um Filho De 2 Anos";
		String telefone = "(12) 9-8802-9594 - Whatsapp";
		String objetivoProficional = "Ser Programador Java - Full Stack";
		String cidade = "Jacar�i - S�o Paulo";
		
		System.out.println("Meu nome �: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Estado Civil: " + estadoCivil + filho);
		System.out.println("Telefone: " + telefone);
		System.out.println("Objetivo Proficional: " + objetivoProficional );
		System.out.println("Cidade e Estado: " + cidade);
		
		System.out.println("-----------------------------------------------------");
				
		String escola = "Forma��o Acad�mica";
		String escolaridade = "Ensino Media Completo";
		String escolaridade2 = "Unip - Univerdade Paulista";
		String escolaridade3 = "Gest�o da Tecnologia da Informa��o - Cursando - 2 Semestre";
		String ano = "Termino 15/12/2022";
	
		System.out.println(escola);
		System.out.println(escolaridade);
		System.out.println(escolaridade2);
		System.out.println(escolaridade3);
		System.out.println(ano);
		
		System.out.println("-----------------------------------------------------");
		
		String curso = "Cursos Complementares";
		String cs = "Microsoft Office\r\n" + 
				"Logica de Computa��o" + "Algoritmo e Logica de Programa��o" + "Soft Skill" + 
				"Curso B�sico de Inform�tica" + "TDD - Test-Drivem Dvelopment\r\n" + 
						"Linguagem de Programa��o - Java e Python\r\n" + 
						"GitHub versionamento de c�digo\r\n" + 
						"Conhecimento em inform�tica\r\n" + 
						"Back-end\r\n";

		System.out.println(curso);
		System.out.println(cs);
		
		System.out.println("-----------------------------------------------------");
		
		String linkedin = "https://www.linkedin.com/in/sebasti%C3%A3o-henrique-albuquerque-fernandes-esperidi%C3%A3o-b7666b209/";
		System.out.println("Linkedin Oficial - " + linkedin);		
		
		System.out.println("-----------------------------------------------------");
		
		/*ESTOU NO COME�O DE APRENDIZAGEM, MAIS GOSTARIA DE UMA VAGA PARA APRENDER MAIS.*/
		/*PARTICIPE TAMBEM COLOQUE A NOTA REFERENTE SE EU TENHO UMA CHANCE OU N�O*/
		
		int nota = 10;
		
		String estagio = "PARABENS VO�� CONSEGUIU A VAGA! ";
		String estagio2 = "DESCULPA N�O FOI DESSA VEZ! ";
		
		if(nota >= 10) {
			System.out.println(estagio);
			}else {
			}if(nota < 10) {
				System.out.println(estagio2);
			}
				
		System.out.println("------------------------------------------------");
		
		
				System.out.println("------------------------------------------------");
	
		System.out.println("Exercios de Aprendizagem");
				
				System.out.println("------------------------------------------------");

		System.out.println("Prazer meu nome �: " + nome);
		System.out.println("Tenho: " + idade);
		System.out.println("Meu Objetivo: " + objetivoProficional);

		System.out.println("------------------------------------------------");

		String Nome = "Sebasti�o";

		double nt = 70;
		double nt2 = 80;
		double nota3 = 60;
		double nota4 = 70;

		double media = (nt + nt2 + nota3 + nota4) / 4;

		System.out.println("A Nota do Aluno " + Nome);
		System.out.println("A Media do Aluno � " + media);

	}
}