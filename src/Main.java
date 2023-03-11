import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Равнобедренный
        String a = " * ";
        String tab = "\t";
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество символов равнобедренного треугольника");
//        int answer = scanner.nextInt();
//        ;
//        var j = answer;
//        for (int i = 0; i < answer; i++) {
//            System.out.println(tab.repeat(j) + a.repeat(i) + a.repeat(i) + " * ");
//            j--;
//        }
//
//
////треугольник2
//
//
//        System.out.println("Введите количество символов в катете треугольника");
//        int stor1 = scanner.nextInt();
//
//
//        for (int i = 1; i <= stor1; i++) {
//            System.out.println(a.repeat(i));}
////Треугольник 3
//        System.out.println("Введите количество символов в катете треугольника (V.2)");
//        int stor2 = scanner.nextInt();
//
//
//        for (int i = stor2; i >= 0; i--) {
//            System.out.println(a.repeat(i));}
////Квадрат
//
//        System.out.println("Введите количество символов в стороне квадрата");
//        int stor3 = scanner.nextInt();;
//
//        for (int i = 0; i<stor3; i++){
//            System.out.println(tab.repeat(i));
//            for (int s = stor3; s > 0 ; s--) {
//                System.out.println(a.repeat(s));
//                break;}
//        }
//Ромб
        System.out.println("Введите количество символов в стороне квадрата");
        int stor4 = scanner.nextInt();
        ;
        var d = stor4;
        for (int i = 0; i < stor4; i++) {
            d--;
            if (i==stor4-1) {
                System.out.println("\t"+tab.repeat(d) + a.repeat(i) + a.repeat(i) + " * ");
            }else{
                System.out.println(tab.repeat(d) + a.repeat(i) + a.repeat(i) + " * ");
            }

        }
        for (int i = stor4; i >= 0; i--) {

            System.out.println(tab.repeat(d) + a.repeat(i) + a.repeat(i) + " * ");
            d++;
        }


        }
    }