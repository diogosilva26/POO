/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Advogado advogado = new Advogado("1231321321", "05046355437", "2234543234", "23413213", Setor.SAUDE, 1344, LocalDate.of(2000, Month.MARCH, 21), Genero.FEMININO, "Marcela", "71982345466", "marcela@gmail.com", 
                new Endereco("Avenida", "82", "Ao lado do bar", "34234456", "Salvador", UnidadeFederativa.BAHIA));
        
        
        Medico medico = new Medico("312312312", "321321312", "2324345677", "13213123123", Setor.SAUDE, 3600, LocalDate.of(1998, Month.MARCH, 13), Genero.MASCULINO, "Darlan", "71923453321", "darlan@gmail.com", 
                new Endereco("Rua", "83", "Ao lado da vidracaria", "32321234", "Goiabada", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Engenheiro engenheiro = new Engenheiro("3123213123", "12123233456", "2212343455", "3213212313", Setor.ENGENHARIA, 0, LocalDate.of(1997, Month.MARCH, 3), Genero.FEMININO, "Debora", "74987643231", "debora@gmail.com", 
                new Endereco("Travessa", "23", "ao lado da ladeira", "32322233", "Lauro de Freitas", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente("321321321312312", LocalDate.of(1987, Month.MARCH, 6), Genero.FEMININO, "Isaura", "719 65434322", "isaura@gmail.coom", 
                new Endereco("Avenida", "32", "bloco b", "12345434", "Salvador", UnidadeFederativa.BAHIA));
        
        Juridica juridica = new Juridica("2132131231", "231232131231", "Aldair", "719 83432234", "aldairempresa@gmail.com", 
                new Endereco("Rua", "54", "bloco c", "23432334", "Alagoinhas", UnidadeFederativa.BAHIA));
        
        
        System.out.println("Dados das pessoas fisicas: ");
        System.out.println(cliente.toString());
        System.out.println("");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println(engenheiro.toString());
        System.out.println("");
        System.out.println(advogado.toString());
        System.out.println("");
        System.out.println("Dados das pessoas juridicas");
        System.out.println(juridica.toString());
    }
}
