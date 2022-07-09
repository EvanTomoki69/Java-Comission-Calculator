
package calculatorsample;

import java.util.Scanner;

/**
 *
 * @author adan2
 */
public class CalculatorSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double commission, earnings, gross_sales_in_the_week, sold_1_items, sold_2_items;
    double sold_3_items, sold_4_items, weekly_salary;
    System.out.print("Ingresa el valor de 1 item vendido: ");
        sold_1_items = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de 2 items vendidos: ");
        sold_2_items = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de 3 items vendidos: ");
        sold_3_items = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de 4 items vendidos: ");
        sold_4_items = in.nextDouble();
        in.nextLine();
        weekly_salary=1200;
        gross_sales_in_the_week=sold_1_items*100+sold_2_items*150+sold_3_items*200+sold_4_items*300;
        commission=gross_sales_in_the_week*0.05;
        earnings=weekly_salary+commission;
        System.out.println("Valor de la comisión: " + commission);
        System.out.println("Valor de las ganancias: " + earnings);
        System.out.println("Valor de las ventas brutas en la semana: " + gross_sales_in_the_week);
        System.out.println("Valor del salario semanal: " + weekly_salary);
    
    }
    
}
