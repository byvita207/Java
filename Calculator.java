
import java.util.Scanner;

public class Calculator {
	
	public static double getNumber(){
		Scanner sc = new Scanner(System.in);
		 double a = 0;
		 boolean check=true;
		  while(check) {
	    System.out.println("Введите число:");
	    if(sc.hasNextDouble()){
	        a = sc.nextDouble();
	        check=false;
	    } else {
	        System.out.println("Ошибка! Повторите ввод числа");
	        sc.next();  
	    }}
	    return a;
	}
	public static void selectAction(double a, double b){
		Scanner sc = new Scanner(System.in);
		boolean r=true;
		double res = 0; 
		while(r) {
		System.out.println("Выберите действие. 1.Сложение. 2.Вычитание. 3.Умножение 4. Деление");
		int choice = 0;
		if(sc.hasNextInt()) choice=sc.nextInt();
		else  sc.next();
        switch (choice) {
        case 1:
        	res=a+b;
        	r=false;
        	break;
        case 2:
        	res=a-b;
        	r=false;
        	break;
        case 3:
        	res=a*b;
        	r=false;
        	break;
        case 4:
        	res=a/b;
        	r=false;
        	break;
        default:
            System.out.println("Операция не распознана.");
            break;
        
	}}
		System.out.println(res);
	}
	public static void main(String[] args) {
		double a=getNumber();
		double b=getNumber();
		selectAction(a,b);
}}
