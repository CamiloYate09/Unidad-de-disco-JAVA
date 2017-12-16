/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidaddiscosistema;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class UnidadDiscoSistema {

    /**
     * @param args the command line arguments este programa nos permite saber
     * todas las carpetas de la raiz de un disc
     */
    public static void main(String[] args) {

        File directorio;
        directorio = new File("C:/");// la ruta de la carpeta

        String[] lista = directorio.list();//metodo list()
        //nos devuelve un array de todos  los archivos y directorios

        Arrays.sort(lista);// ordenamos el contenido de la lista 

        //pasa los datos del arreglo a lista
        List<String> lista2 = new ArrayList();

        lista2.addAll(Arrays.asList(lista));

        System.out.println("Con lista : \n");
        //JOptionPane.showMessageDialog(null, "Con lista : \n");
        for (String cli : lista2) {
            System.out.println(cli.toString());
            //JOptionPane.showMessageDialog(null, cli.toString());

        }
        System.out.println("_______________________");
        //JOptionPane.showConfirmDialog(null, "_______________________");

        System.out.println("Con Arrelgo: \n");
        //JOptionPane.showMessageDialog(null, "Con Arrelgo: \n");
        for (int c = 0; c < lista.length; c++) {
            System.out.println(lista[c]);
            //JOptionPane.showMessageDialog(null, lista[c]);

        }

    }

}
