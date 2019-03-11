package ru.Krasnoshtandenis;

/**
* Class Calculate, a string console output.
* @author Denis Krasnoshtan (krasnoshtan.job4j@yandex.ru)
* @version 1.0
* @since 11.03.2019
*/

public class Calculate {
	    /** 
		* Method main, output the string to the console.
		* @param args - args.
		*/
       public String echo(String value) {
             return String.format("%s %s %s", value, value, value);
         }
         public static void main(String[] args) {
         Calculate calc = new Calculate();
         System.out.println(calc.echo("aah"));
         }
 }