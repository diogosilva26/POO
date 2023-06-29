/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("3123123121", "Juan", "31232122212", "2234543211", 
                new Endereco("Avenida", "12", "Bloco c", "23456765", "Salvador", UnidadeFederativa.BAHIA), Setor.SAUDE, Genero.MASCULINO, 1200, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 2));
        
        Engenheiro engenheiro = new Engenheiro("3123123121", "Paulo", "31232122212", "2234543211", 
                new Endereco("Avenida", "12", "Bloco c", "23456765", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.MASCULINO, 1200, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 2));
        
        Gerente gerente = new Gerente(Bonificacao.GERENTE,"Jackson", "31232122212", "2234543211", 
                new Endereco("Avenida", "12", "Bloco c", "23456765", "Salvador", UnidadeFederativa.BAHIA), Setor.SAUDE, Genero.MASCULINO, 2000, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 2));
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR,"Alice", "31232122212", "2234543211", 
                new Endereco("Avenida", "12", "Bloco c", "23456765", "Salvador", UnidadeFederativa.BAHIA), Setor.SAUDE, Genero.FEMININO, 3000, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 2));
        
        
        System.out.println("Listando os usuários");
        System.out.println("");
       
        System.out.println(diretor.toString());
        System.out.println("");
        System.out.println(gerente.toString());
        System.out.println("");
        diretor.admitir(engenheiro);
        System.out.println("");
        diretor.demitir(motoboy);
    }
}
