/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cc_busquedabinaria;

/**
 *
 * @author alumno
 */
public class CC_BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    final int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
    
    public int busquedaBinaria(int numero){
       
        int umbralInferior = 0;
        int umbralSuperior = array.length - 1;
        int respuesta = -1;
        int index;
        
        while (umbralInferior <= umbralSuperior){
            index = (umbralInferior + umbralSuperior) /2;
            
            if(array[index] == numero){
                respuesta = index;
                umbralInferior = umbralSuperior+1;
            }
            else if(array[index] < numero) {
                umbralInferior = index +1;
            }
            else {
                umbralSuperior = index -1;
            }
        }
        return respuesta;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
