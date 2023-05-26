/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistemafuncionário;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(57, "Maria Luiza", 1455.80, 19, Genero.FEMININO, Setor.VENDAS);
        
        
        System.out.println("As informações dos funcionários são:");
        System.out.println("////////////////");
        
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Número de identificação: "+funcionario.getId());
        System.out.println("Salário: R$"+funcionario.getSalario());
        System.out.println("Idade: "+funcionario.getIdade());
        System.out.println("Gênero: "+funcionario.getGenero());
        System.out.println("Setor: "+funcionario.getSetor());
        
    }
}
