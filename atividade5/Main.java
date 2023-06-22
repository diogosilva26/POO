/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("3423432423", "Silvonei", LocalDate.of(1998, Month.MARCH, 4), Genero.MASCULINO, Setor.OPERACOES, 1200);
        Diretor diretor = new Diretor("Diogo", LocalDate.of(2003, Month.MARCH, 12), Genero.MASCULINO, Setor.OPERACOES, 2000);
        
        System.out.println("Dados do diretor: "+diretor.toString());
        System.out.println("");
        diretor.admtir(motoboy);
        System.out.println("");
        diretor.demitir(motoboy);
        
    }
}
