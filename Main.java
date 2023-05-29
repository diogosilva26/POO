package atividade1;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Pessoa_Fisica pessoaFisica = new Pessoa_Fisica("05050533412", "2243123454", LocalDate.of(2003, Month.JULY, 28), "Diogo da Silva Valença", "71982343547");
		Pessoa_Juridica pessoaJuridica = new Pessoa_Juridica("24356478940034", "1293847611", "Josivaldo Oliveira Cruz", "71987343321");
		
		System.out.println(pessoaFisica.toString());
		System.out.println();
		System.out.println(pessoaJuridica.toString());
	}

}
