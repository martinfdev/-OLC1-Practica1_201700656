
package clases;

import interfaz.VentanaPrincipal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Init {

    public Init() {
        VentanaPrincipal vp =new  VentanaPrincipal();
        vp.setVisible(true);
       
    }

    public String readFile(){
    File f = new File("/home/pedro/Downloads/Archivo entrada compi/entrada/entrada.er");
     FileInputStream entrada;
        InputStreamReader ent;
        String documento = "";
        try {
            entrada = new FileInputStream(f);
         ent = new InputStreamReader(entrada, "UTF-8");
                 
            int ascci;

            while ((ascci = ent.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    return documento;
    }
}
