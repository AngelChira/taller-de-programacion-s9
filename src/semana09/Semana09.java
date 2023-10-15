package semana09;

import java.util.Scanner;

public class Semana09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombresArticulos = new String [5];
        float[] precioArticulos = new float[5];
        byte[] sucursal1 = new byte[5];
        byte[] sucursal2 = new byte[5];
        byte[] sucursal3 = new byte[5];
        byte[] sucursal4 = new byte[5];
        int sumaTotalEmpresa = 0, sumaSucursal1 = 0,sumaSucursal2 = 0;
        int sumaSucursal3 = 0, sumaSucursal4  = 0, cantSucursal2 = 0;
        int cantArticulo1 = 0, cantArticulo2 = 0, cantArticulo3 = 0;
        int cantArticulo4 = 0, cantArticulo5 = 0;
        for(int i=0; i < nombresArticulos.length; i++){
            System.out.print("Ingrese el nombre del artículo "+(i+1)+": ");
            nombresArticulos[i] = teclado.next();
            do{
                System.out.print("Ingrese el precio del artículo "+(i+1)+": ");
                precioArticulos[i] = teclado.nextFloat();
                if(precioArticulos[i]<=0){
                    System.out.println("Error, el precio debe ser mayor a 0.");
                }
            }while(precioArticulos[i]<=0);
            
            do{               
                System.out.print("Ingrese la cantidad vendida para la sucursal 1: "); 
                sucursal1[i] = teclado.nextByte();
                if(sucursal1[i]<0){
                    System.out.println("Error, debe ingresar cantidades mayores o iguales que 0.");
                }
            }while(sucursal1[i]<0);
            
            do{                
                System.out.print("Ingrese la cantidad vendida para la sucursal 2: "); 
                sucursal2[i] = teclado.nextByte();
                if(sucursal2[i]<0){
                    System.out.println("Error, debe ingresar cantidades mayores o iguales que 0.");
                }
            }while(sucursal2[i]<0);
            
            do{                
                System.out.print("Ingrese la cantidad vendida para la sucursal 3: "); 
                sucursal3[i] = teclado.nextByte();
                if(sucursal3[i]<0){
                    System.out.println("Error, debe ingresar cantidades mayores o iguales que 0.");
                }
            }while(sucursal3[i]<0);
            
            do{
                System.out.print("Ingrese la cantidad vendida para la sucursal 4: "); 
                sucursal4[i] = teclado.nextByte();        
                if(sucursal4[i]<0){
                    System.out.println("Error, debe ingresar cantidades mayores o iguales que 0.");
                }
            }while(sucursal4[i]<0);
        }
        
        cantArticulo1 = sucursal1[0] + sucursal2[0] + sucursal3[0] + sucursal4[0];
        cantArticulo2 = sucursal1[1] + sucursal2[1] + sucursal3[1] + sucursal4[1];
        cantArticulo3 = sucursal1[2] + sucursal2[2] + sucursal3[2] + sucursal4[2];
        cantArticulo4 = sucursal1[3] + sucursal2[3] + sucursal3[3] + sucursal4[3];
        cantArticulo5 = sucursal1[4] + sucursal2[4] + sucursal3[4] + sucursal4[4];
        System.out.println("La cantidades totales de cada artículo \nArticulo 1 es "+
        cantArticulo1+"\nArticulo 2 es "+cantArticulo2+"\nArticulo 3 es "+cantArticulo3
        +"\nArticulo 4 es " +cantArticulo4+"\nArticulo 5 es " +cantArticulo5);
        
        for (byte s2:sucursal2){
            cantSucursal2 = cantSucursal2 + s2;
        }
        System.out.println("La cantidad de artículos en la sucursal 2 es "+cantSucursal2); 
        System.out.println("La cantidad del articulo 3 en la sucursal 1 es "+sucursal1[2]);  
        
        for(int i = 0; i<sucursal1.length; i++){
            sumaSucursal1 = (int) (sumaSucursal1 + (sucursal1[i]*precioArticulos[i]));
        }
        for(int i = 0; i<sucursal2.length; i++){
            sumaSucursal2 = (int) (sumaSucursal2 + (sucursal2[i]*precioArticulos[i]));
        }
        for(int i = 0; i<sucursal3.length; i++){
            sumaSucursal3 = (int) (sumaSucursal3 + (sucursal3[i]*precioArticulos[i]));
        }
        for(int i = 0; i<sucursal4.length; i++){
            sumaSucursal4 = (int) (sumaSucursal4 + (sucursal4[i]*precioArticulos[i]));
        }
        System.out.println("La recaudación total de cada sucursal"
        +"\nSucural 1 es S/"+sumaSucursal1+" soles.\nSucural 2 es S/"+sumaSucursal2
        +" soles.\nSucural 3 es S/"+sumaSucursal3+" soles. \nSucural 4 es S/"+sumaSucursal4
        +" soles.");
        
        sumaTotalEmpresa = sumaSucursal1 + sumaSucursal2 + sumaSucursal3 + sumaSucursal4;
        System.out.println("La recaudación total de la empresa es S/"+sumaTotalEmpresa+" soles.");
        if(sumaSucursal1>sumaSucursal2 && sumaSucursal1>sumaSucursal3 &&sumaSucursal1>sumaSucursal4){
            System.out.println("La sucursal de mayor recaudación es la 1");
        }else if(sumaSucursal2>sumaSucursal1 && sumaSucursal2>sumaSucursal3 &&sumaSucursal2>sumaSucursal4){
            System.out.println("La sucursal de mayor recaudación es la 2");
        }else if(sumaSucursal3>sumaSucursal1 && sumaSucursal3>sumaSucursal2 &&sumaSucursal3>sumaSucursal4){
            System.out.println("La sucursal de mayor recaudación es la 3");
        }else if(sumaSucursal4>sumaSucursal1 && sumaSucursal4>sumaSucursal2 &&sumaSucursal4>sumaSucursal3){
            System.out.println("La sucursal de mayor recaudación es la 4");
        }else{
            System.out.println("Hay un empate la recaudación mayor entre 2 o más sucursales.");
        }
       
    }
    
}