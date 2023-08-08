package lesson_07;

import java.util.Scanner;

public class Lesson_07 {
    public static void main(String[] args) {

        int x = 1;

        switch (x) {
            case 1: {
                System.out.println("x raven 1");
                break;
            }
            case  2: {
                System.out.println("x raven 2");
                break;
            }
            case 3: {
                System.out.println("x raven 3");
                break;
            }

            default:{
                System.out.println("vedeno kakoye to drugoe cheslo");
            }
        }

        int myMoney = 100;

        int incoming = 20;

        switch (incoming) {
            case 0: {
                incoming -= 5;
                break;
            }

                case 10: {
                    incoming += 25;
                    break;
                }
                case 20: {
                    myMoney +=75;
                    break;
                }
                default: {
                    myMoney += incoming;

                    System.out.println("end my money: " +myMoney );
                    System.out.println("chto takoe joltiy bolshoy s rogami i polniy zaycev?");
                    System.out.println("kak dumaesh?");

                    Scanner scanner = new Scanner(System.in);
                    String answer = scanner.nextLine();

                    char firstCharSubstring = answer.trim().toLowerCase().substring(1,3).charAt(0);
                    answer = answer.trim();

                    switch (answer) {
                        case "troleybus":
                        case "troleybus!":
                            //       case "Troleybus" :

                        {
                            System.out.println("pravilno ti naverno nagooglil");
                            break;
                        }

                        case "sdayus":
                        case "sdayus!":
                            //       case "Sdayus":

                            System.out.println("ochen jal pravelniy otvet troleybus");
                            break;
                    }           }
            }







        String result = "";


        int myChoice = 1;

        switch (myChoice){


            case 1:{
                result = "vi vveli odin";}

            case 2: {
                result = "vi vveli 2";}

            case 3: {
                result = "vi vveli 3";}

            case 4:{
                result = "vi vveli 4";
            }
            case 5: {
                result = "vi vveli 5";
            }
            default:result = "vi veli neznayu chto";

                System.out.println("Result string" + result);

        }


        }



//        if (x == 5) System.out.println("if: x raven 5");


    }

