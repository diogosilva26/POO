/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package prova;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO('M', "Masculino" ),
    FEMININO('F' ,"Feminino" );
    
    protected char caracter;
    protected String texto;

    private Genero(char caracter, String texto) {
        this.caracter = caracter;
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public char getCaracter() {
        return caracter;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
