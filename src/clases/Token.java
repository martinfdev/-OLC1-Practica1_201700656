/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jblack
 */
public class Token {

    public enum Tipo {
        LLAVE_IZQUIERDO,
        LLAVE_DERECHO,
        DOS_PUNTOS,
        PUNTO_COMA,
        ID,
        CADENA,
        OR,
        CONCATENACION,
        DISYUNCION,
        CERO_UNA_VEZ,
        CERO_MAS_VECES,
        UNA_MAS_VECES,
        OPERADOR,
        COMENTARIO_SIMPLE,
        COMENTARIO_MULTILINEA,
        ASIGNACION, //->
        CONJUNTO,
        CONJ,
        EXPRESION_REGULAR,
        SEPARADOR,
        ERRORLEXICO
    }

    private final Tipo tipoToken;
    private final String lexema;
    private final int fila, columna;
   // private String valor;

    public Token(Tipo tipo, String lexema, int fila, int columna) {

        this.tipoToken = tipo;
        this.lexema = lexema;
        this.fila = fila;
        this.columna = columna;

    }

    public Tipo getTipoToken() {
        return tipoToken;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String getLexema() {
        return lexema;
    }
    
    public String getEndString() {
        switch (tipoToken) {
            case ERRORLEXICO:
                return "Elemento lexico desconocido";
        }
        return "Elemento lexico desconocido";
    }
}
