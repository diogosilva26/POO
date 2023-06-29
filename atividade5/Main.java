package atividade5;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Diretor diretor = new Diretor("Diogo da Silva Valença", "71 976548843", "diogo@gmail.com", new Endereco("Avenida", "11", "Bloco c", "30230498", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.DIVORCIADO, LocalDate.of(2003, Month.JULY, 28), "02032322213", "2212321233", "32132131", Setor.ENGENHARIA, 2000.0);
		PrestacaoServico prestacaoServico = new PrestacaoServico("Adalberto Oliveira Cruz", "71 982321211", "adalberto@gmail.com", new Endereco("Avenida", "32", "Bloco c", "23234567", "Salvador", UnidadeFederativa.BAHIA), "132313123", "213123131", LocalDate.of(2000, Month.AUGUST, 22),LocalDate.of(2012, Month.AUGUST, 22 ));
		Fornecedor fornecedor = new Fornecedor("Ricardo Souza Cruz", "71 998765433", "ricardo@gmail.com", new Endereco("Rua", "32", "", "31324323", "Lauro de Freitas", UnidadeFederativa.BAHIA), "313231231", "321312313", SetorJuridico.ALIMENTACAO, new Produto("Macarrão", "Alimentos de massa", 12.0));
		Cliente cliente = new Cliente("Aldair Santos Ribeiro", "71 982343233", "aldair@gmail.com", new Endereco("Avenida", "23", "Bloco c", "12345654", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2000, Month.AUGUST, 2), "321321312");
		Medico medico = new Medico("Roberto Santana dos Santos", "71 987343321", "roberto@gmail.com", new Endereco("Avenida", "12", "", "21654321", "Salvador", UnidadeFederativa.BAHIA),Genero.MASCULINO, EstadoCivil.CASADO,LocalDate.of(1998, Month.APRIL, 3),"32123244456", "3267543212", "3213213", Setor.SAUDE, 8000.0, "3213123421");
		Engenheiro engenheiro = new Engenheiro("Kailan Oliveira Cruz", "71 982321123", "kailan@gmail.com", new Endereco("Ladeira", "34", "Rua 6", "32145675", "Salvador", UnidadeFederativa.BAHIA),Genero.MASCULINO, EstadoCivil.CASADO,LocalDate.of(1998, Month.APRIL, 3),"32123244456", "3267543212", "3213213", Setor.ENGENHARIA, 7000.0, "3213123421");
		Motoboy motoboy = new Motoboy("Icaro Batista Santos", "71 965434566", "icaro@gmail.com", new Endereco("Avenida", "56", "Bloco d", "21456786", "Salvador", UnidadeFederativa.BAHIA),Genero.MASCULINO, EstadoCivil.CASADO,LocalDate.of(1999, Month.AUGUST, 4),"32123244456", "3267543212", "3213213", Setor.ENGENHARIA, 1300.0, "3213123421");
		
		
		
		System.out.println("Dados das Pessoas juridicas: ");
		System.out.println("");
		System.out.println(prestacaoServico);
		System.out.println("");
		System.out.println(fornecedor);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Dados das pessoas fisicas: ");
		System.out.println("");
		System.out.println(cliente);;
		System.out.println("");
		System.out.println(diretor);
		System.out.println("");
		diretor.admitir(medico);
		System.out.println("");
		diretor.demitir(engenheiro);
		System.out.println("");
		diretor.admitir(motoboy);

	}

}
