package com.java;

/* 
Escribe la declaración para cada una de las variables y asígnales un valor inicial en la propia declaración de variable.
a) Variables enteras: p, q                             b) Variables float: x, y, z  	
c) Variables carácter: a, b, c                         d) Variables double: raiz1, raiz2                         
e) Variable entera larga: contador                     f) Variable entera corta: indicador 
g) Variable entera: indice                             h) Variables double: precio, precioFinal                   
i) Variables carácter: car1, car2                      j) Variable tipo byte: valor
k) Variables lógicas: primero, ultimo                  l) Variable de tipo cadena de caracteres: nombre */

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------");

        /* Enteros */
        int p = 10 , q = 20;
        System.out.println("Enteros:\n" + //
                "");
        System.out.println(p);
        System.out.println(q);
        System.out.println("---------------------------");

        /* Float */
        float x = 10.0f, y = 20.0f, z = 30.0f;
        System.out.println("Float:\n");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("---------------------------");

        /* Caracter (char) */
        char a = 'a', b = 'b', c = 'c';
        System.out.println("Caracter:\n");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("---------------------------");

        /* Double */
        double raiz1= 10.0, raiz2= 20.0;
        System.out.println("Double:\n");
        System.out.println(raiz1);
        System.out.println(raiz2);
        System.out.println("---------------------------");

        /* Entera larga */
        long contador = 1000000000L;
        System.out.println("Entero largo:\n");
        System.out.println(contador);
        System.out.println("---------------------------");

        /* Entera corta */
        short indicador = 10;
        System.out.println("Entero corto:\n");
        System.out.println(indicador);
        System.out.println("---------------------------");

        /* Entera */
        int indice = 10;
        System.out.println("Entera:\n");
        System.out.println(indice);
        System.out.println("---------------------------");

        /* Double */
        double precio = 10.0;
        double precioFinal = 20.0;
        System.out.println("Double:\n");
        System.out.println(precio);
        System.out.println(precioFinal);
        System.out.println("---------------------------");

        /* Caracter (char) */
        char car1 = 'a', car2 = 'b';
        System.out.println("Caracter:\n");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("---------------------------");

        /*Byte */
        byte valor = 10;
        System.out.println("Byte:\n");
        System.out.println(valor);
        System.out.println("---------------------------");

        /* Lógica */
        boolean primero = true , ultimo = false;
        System.out.println("Lógica:\n");
        System.out.println(primero);
        System.out.println(ultimo);
        System.out.println("---------------------------");

        /* Cadenas de caracteres */
        String nombre = "Juan 'el cojo' Perez";
        System.out.println("Cadenas de caracteres:\n");
        System.out.println(nombre);
        System.out.println("---------------------------");

    }
}


