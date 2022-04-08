/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dos objetos de tipo casa
        Casa casa1=new Casa();
        casa1.color="Negro";
        casa1.numeroDeVentanas=10;
        casa1.pisos=3;
        casa1.precio=100000.0;
        
        System.out.println("----Casa numero1----"+"\n"+
                           "Color: "+casa1.color+"\n"+
                           "Numero de ventanas: "+casa1.numeroDeVentanas+"\n"+
                           "Numero de pisos: "+casa1.pisos+"\n"+
                           "Precio: "+casa1.precio+" $"
                          );
        
        Casa casa2=new Casa();
        casa2.color="Verde";
        casa2.numeroDeVentanas=5;
        casa2.pisos=2;
        casa2.precio=50000.0;
        
        System.out.println("----Casa numero 2----"+"\n"+
                           "Color: "+casa2.color+"\n"+
                           "Numero de ventanas: "+casa2.numeroDeVentanas+"\n"+
                           "Numero de pisos: "+casa2.pisos+"\n"+
                           "Precio: "+casa2.precio+" $"+"\n"
                          );
        
//Dos objetos de tipo moto        
        Moto moto1=new Moto();
        moto1.color="Rojo";
        moto1.marca="Suzuki";
        moto1.modelo="GN 125";
        moto1.precio=2000.0;
        
        System.out.println("----Moto numero 1----"+"\n"+
                           "Marca: "+moto1.marca+"\n"+
                           "Color: "+moto1.color+"\n"+
                           "Modelo: "+moto1.modelo+"\n"+
                           "Precio: "+moto1.precio+" $"
                          );
        
        Moto moto2=new Moto();
        moto2.color="Amarillo";
        moto2.marca="Honda";
        moto2.modelo="CB500F";
        moto2.precio=4000.0;
        
        System.out.println("----Moto numero 2----"+"\n"+
                           "Marca: "+moto2.marca+"\n"+
                           "Color: "+moto2.color+"\n"+
                           "Modelo: "+moto2.modelo+"\n"+
                           "Precio: "+moto2.precio+" $"+"\n"
                          );
      
//Dos objetos de tipo gato
        Gato gato1=new Gato();
        gato1.color="Cafe";
        gato1.edad=5;
        gato1.nombre="Bola de nieve";
        gato1.raza="Siberiano";
        
        System.out.println("----Gato numero 1----"+"\n"+
                           "Nombre: "+gato1.nombre+"\n"+
                           "Edad: "+gato1.edad+"\n"+
                           "Color: "+gato1.color+"\n"+
                           "Raza: "+gato1.raza
                          );
        
        Gato gato2=new Gato();
        gato2.color="Negro";
        gato2.edad=4;
        gato2.nombre="Señor Gato";
        gato2.raza="Persa";
        
        System.out.println("----Gato numero 2----"+"\n"+
                           "Nombre: "+gato2.nombre+"\n"+
                           "Edad: "+gato2.edad+"\n"+
                           "Color: "+gato2.color+"\n"+
                           "Raza: "+gato2.raza+"\n"
                          );
        
//Dos objetos de tipo Computadora
        Computadora computadora1=new Computadora();
        computadora1.color="Blanco";
        computadora1.marca="Hp";
        computadora1.procesador="i7";
        computadora1.ram=8;
        
        System.out.println("----Computadora numero 1----"+"\n"+
                           "Marca: "+computadora1.marca+"\n"+
                           "Color: "+computadora1.color+"\n"+
                           "Procesador: "+computadora1.procesador+"\n"+
                           "Ram: "+computadora1.ram
                          );
        
        Computadora computadora2=new Computadora();
        computadora2.color="Gris";
        computadora2.marca="Lenovo";
        computadora2.procesador="Rizen 5";
        computadora2.ram=16;
        
        System.out.println("----Computadora numero 2----"+"\n"+
                           "Marca: "+computadora2.marca+"\n"+
                           "Color: "+computadora2.color+"\n"+
                           "Procesador: "+computadora2.procesador+"\n"+
                           "Ram: "+computadora2.ram+"\n"
                          );
        
//Dos objetos de tipo libro
        Libro libro1=new Libro();
        libro1.año=2010;
        libro1.editorial="Alba";
        libro1.precio=7.0;
        libro1.titulo="El marinerito";
        
        System.out.println("----Libro numero 1----"+"\n"+
                           "Titulo: "+libro1.titulo+"\n"+
                           "Editorial: "+libro1.editorial+"\n"+
                           "Precio: "+libro1.precio+" $"+"\n"+
                           "Año: "+libro1.año
                          );
        
        Libro libro2=new Libro();
        libro2.año=2000;
        libro2.editorial="Akal";
        libro2.precio=5.0;
        libro2.titulo="El principito";
        
        System.out.println("----Libro numero 2----"+"\n"+
                           "Titulo: "+libro2.titulo+"\n"+
                           "Editorial: "+libro2.editorial+"\n"+
                           "Precio: "+libro2.precio+" $"+"\n"+
                           "Año: "+libro2.año
                          );
    }
}
