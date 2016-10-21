/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg05;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DETERMINAR SI UN NUMERO ES PRIMO O NO
        int numero;
        numero = solicitarNumero();
        calcularResultado(numero);
    }
    
    //ESCANEO DEL NUMERO INGRESADO POR EL USUARIO
    public static int solicitarNumero(){
        int numero;
        System.out.println("Ingresa un numero:");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        return numero;
    }
    
    /*CALCULO E IMPRESION PARA SABER SI EL NUMERO IMGRESADO
    ES PRIMO O NO
    */
    public static void calcularResultado(int numero){
        if (numero==2 || numero==3){
            System.out.println("ES un numero primo");
        }else{
            if (numero%2==0){
                System.out.println("NO ES un numero primo");
            }else{
                if(numero%3==0){
                    System.out.println("NO ES un numero primo");
                }else{
                    System.out.println("ES un numero primo");
                }
            }
        }
    }
    }
