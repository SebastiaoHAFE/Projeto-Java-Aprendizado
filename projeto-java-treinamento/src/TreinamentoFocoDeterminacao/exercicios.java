package TreinamentoFocoDeterminacao;

public class exercicios {

	public static void main(String[] args) {
		System.out.println("Ola Mundo");
		System.out.println("Pra Quem Tem Fé, A Vida Não Tem Fim !");
        
		System.out.println("----------------------------------------");
		System.out.println(" Curriculum Vitae ");
		System.out.println("----------------------------------------");
		
		String nome = "Sebastião Henrique Albuquerque Fernandes Esperidião";
		String idade = "35 Anos";
		String estadoCivil = "Casado";
		String filho = " Tenho um Filho De 2 Anos";
		String telefone = "(12) 9-8802-9594 - Whatsapp";
		String objetivoProficional = "Ser Programador Java - Full Stack";
		String cidade = "Jacaréi - São Paulo";
		
		System.out.println("Meu nome é: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Estado Civil: " + estadoCivil + filho);
		System.out.println("Telefone: " + telefone);
		System.out.println("Objetivo Proficional: " + objetivoProficional );
		System.out.println("Cidade e Estado: " + cidade);
		
		System.out.println("-----------------------------------------------------");
				
		String escola = "Formação Acadêmica";
		String escolaridade = "Ensino Media Completo";
		String escolaridade2 = "Unip - Univerdade Paulista";
		String escolaridade3 = "Gestão da Tecnologia da Informação - Cursando - 2 Semestre";
		String ano = "Termino 15/12/2022";
	
		System.out.println(escola);
		System.out.println(escolaridade);
		System.out.println(escolaridade2);
		System.out.println(escolaridade3);
		System.out.println(ano);
		
		System.out.println("-----------------------------------------------------");
		
		String curso = "Cursos Complementares";
		String cs = "Microsoft Office\r\n" + 
				"Logica de Computação" + "Algoritmo e Logica de Programação" + "Soft Skill" + 
				"Curso Básico de Informática" + "TDD - Test-Drivem Dvelopment\r\n" + 
						"Linguagem de Programação - Java e Python\r\n" + 
						"GitHub versionamento de código\r\n" + 
						"Conhecimento em informática\r\n" + 
						"Back-end\r\n";

		System.out.println(curso);
		System.out.println(cs);
		
		System.out.println("-----------------------------------------------------");
		
		String linkedin = "https://www.linkedin.com/in/sebasti%C3%A3o-henrique-albuquerque-fernandes-esperidi%C3%A3o-b7666b209/";
		System.out.println("Linkedin Oficial - " + linkedin);		
		
		System.out.println("-----------------------------------------------------");
		
		/*ESTOU NO COMEÇO DE APRENDIZAGEM, MAIS GOSTARIA DE UMA VAGA PARA APRENDER MAIS.*/
		/*PARTICIPE TAMBEM COLOQUE A NOTA REFERENTE SE EU TENHO UMA CHANCE OU NÃO*/
		
		int nota = 10;
		
		String estagio = "PARABENS VOÇÊ CONSEGUIU A VAGA! ";
		String estagio2 = "DESCULPA NÃO FOI DESSA VEZ! ";
		
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

		System.out.println("Prazer meu nome é: " + nome);
		System.out.println("Tenho: " + idade);
		System.out.println("Meu Objetivo: " + objetivoProficional);

		System.out.println("------------------------------------------------");

		String Nome = "Sebastião";

		double nt = 70;
		double nt2 = 80;
		double nota3 = 60;
		double nota4 = 70;

		double media = (nt + nt2 + nota3 + nota4) / 4;

		System.out.println("A Nota do Aluno " + Nome);
		System.out.println("A Media do Aluno é " + media);

	}
}