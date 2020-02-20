/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Token.Tipo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Lexico {

    private ArrayList<Token> salida;
    private int estado;
    private String lexema;
    private int fila, columna;

    public Lexico(ArrayList<Token> salida) {
        this.salida = salida;
    }

    public void scanner(String cadenaEntrada) {
        cadenaEntrada = cadenaEntrada + "#"; //caracter de aceptacion de lectura de toda la cadena
        estado = 0;
        lexema = "";
        fila = 1;
        columna = 1;
        char ca;

        for (int i = 0; i < cadenaEntrada.length(); i++) {
            ca = cadenaEntrada.charAt(i);
            columna++;

            switch (estado) {

                case 0:
                    if (ca == '{') {
                        lexema += ca;
                        addToken(Tipo.LLAVE_DERECHO);
                    } else if (ca == '}') {
                        lexema += ca;
                        addToken(Tipo.LLAVE_IZQUIERDO);
                    } else if (ca == ':') {
                        lexema += ca;
                        addToken(Tipo.DOS_PUNTOS);

                    } else if (ca == ';') {
                        lexema += ca;
                        addToken(Tipo.PUNTO_COMA);
                    } else if (ca == '/') {
                        lexema += ca;
                        estado = 2;
                    } else if (ca == '\"') {
                        estado = 3;
                    } else if (ca == '<') {
                        estado = 5;
                        lexema += ca;
                    } else if (ca == '-') {
                        lexema += ca;
                        estado = 4;
                    } else if (Character.isDigit(ca)) {
                        lexema += ca;
                        estado = 7;
                    } else if (Character.isLetter(ca)) {
                        lexema += ca;
                        estado = 8;
                    } else if (ca == '.') {
                        lexema += ca;
                        estado = 21;
                    } else if (ca == '%') {
                        estado = 12;
                        lexema += ca;
                    } else if (32 <= (int) ca) {
                        try {
                            char temp = cadenaEntrada.charAt(i + 1);
                            if (temp == '~') {
                                estado = 12;
                                lexema += ca;
                            }
                        } catch (Exception e) {
                        }

                    } else if (ca == 32) {
                        //   System.out.println("espacio en blanco");
                    } else if (ca == 9) {
                        //  System.out.println("tab horizontal");
                    } else if (ca == 10) {
                        // System.out.println("salto de linea");
                        fila++;
                        columna = 0;
                    } else if (ca == 11 || ca == 12 || ca == 13 | ca == 14 || ca == 15) {
                        //  System.out.println("tab vertical");
                    } else if (ca == '#') {

                        JOptionPane.showMessageDialog(null, "Analisis completo");

                    } else {
                        //System.out.println((int) ca);
                        lexema += ca;
                        addToken(Tipo.ERRORLEXICO);
                    }

                case 1:

                    break;
                case 2:
                    if (ca == '/') {
                        lexema += ca;
                        estado = 20;
                    }
                    break;

                case 3:
                    if (ca == 34) {
                        addToken(Tipo.CADENA);
                    } else {
                        lexema += ca;
                    }
                    break;
                case 4:
                    //estado de aceptacion
                    if (ca == '>') {
                        lexema += ca;
                        addToken(Tipo.OPERADOR);
                    }
                    break;
                case 5:
                    if (ca == '!') {
                        estado = 6;
                        lexema += ca;
                    } else if (ca == '>') {
                        lexema += ca;
                        addToken(Tipo.COMENTARIO_MULTILINEA);
                    }
                    
                    break;

                case 6:
                    if (ca == '!') {
                        estado = 5;
                        lexema += ca;

                    } else {
                        lexema += ca;
                    }
                    break;

                case 7:
                    if (',' == ca) {
                        lexema += ca;
                        estado = 15;
                    } else if (ca == ';') {
                        addToken(Tipo.CONJUNTO);
                        --i;
                    } else if (ca == '~') {
                        estado = 11;
                        lexema += ca;
                    }
                    break;
                case 8:
                    if (Character.isLetter(ca)) {
                        lexema += ca;
                    } else if (Character.isDigit(ca)) {
                        lexema += ca;
                        estado = 9;
                    } else if (ca == '~') {
                        lexema += ca;
                        estado = 10;
                    } else if (ca == ',') {
                        lexema += ca;
                        estado = 18;
                    } else if (lexema.equals("CONJ")) {
                        addToken(Tipo.CONJ);
                        --i;
                    } else if (ca == '-') {
                        addToken(Tipo.ID);
                        --i;
                    }
                    break;
                case 9:
                    if (Character.isDigit(ca)) {
                        lexema += ca;
                    } else if (Character.isLetter(ca)) {
                        lexema += ca;
                        estado = 8;
                    } else {
                        addToken(Tipo.ID);
                        --i;
                    }
                    break;

                case 10:
                    if (Character.isLetter(ca)) {
                        lexema += ca;
                        addToken(Tipo.CONJUNTO);
                    }
                    break;
                case 11:
                    if (Character.isDigit(ca)) {
                        lexema += ca;
                        addToken(Tipo.CONJUNTO);
                    }
                    break;
                case 12:
                    if (ca == '%') {
                        lexema += ca;
                        estado = 17;
                    } else if (ca == '~') {
                        lexema += ca;
                        estado = 13;
                    }

                    break;
                case 13:
                    if (ca == ';') {
                        addToken(Tipo.CONJUNTO);
                        --i;
                    }

                    break;
                case 14:

                    break;

                case 15:
                    if (Character.isDigit(ca)) {
                        lexema += ca;
                        estado = 7;
                    }
                    break;
                case 16:
                    if (ca == '%') {
                        lexema += ca;
                        addToken(Tipo.SEPARADOR);
                    }
                    break;
                case 17:
                    if (ca == '%') {
                        lexema += ca;
                        estado = 16;
                    } else if (ca == '\n') {
                        lexema += ca;
                        estado = 17;
                    }
                    break;
                case 18:
                    if (Character.isLetter(ca)) {
                        lexema += ca;
                        estado = 19;
                    }
                    break;
                case 19:
                    if (ca == ',') {
                        lexema += ca;
                        estado = 18;
                    } else if (ca == ';') {
                        --i;
                        addToken(Tipo.CONJUNTO);
                    }
                    break;
                case 20:
                    if (ca == '\n') {
                        lexema += ca;
                        addToken(Tipo.COMENTARIO_SIMPLE);
                    } else {
                        lexema += ca;
                    }
                    break;
                case 21:
                    if (ca == ';') {
                        addToken(Tipo.EXPRESION_REGULAR);
                        --i;
                    } else if (ca == '\n') {
                        lexema += ca;
                        addToken(Tipo.EXPRESION_REGULAR);
                    } else {
                        lexema += ca;
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

    public void addToken(Tipo tipo) {
        salida.add(new Token(tipo, lexema, fila, columna));
        estado = 0;
        lexema = "";
    }

    public void printToken() {

        salida.forEach((token) -> {
            System.out.println(token.getLexema() + "\t" + token.getTipoToken());
        });
    }
}
