package org.TypeTest;


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose mode:"+"\n"+"1.One minute" + "\n"+"2.Text limited");
        int mode=sc.nextInt();
        if(mode>2 || mode<1 ){
            System.out.printf("Try again!\n");
            System.exit(0);
        }
        System.out.println("Choose difficulty:"+'\n'+"1.Easy"+'\n'+"2.Medium"+'\n'+"3.Hard"+'\n'+"4.Impossible");
        int difficulty=sc.nextInt();
        if(difficulty>4 || difficulty<1){
            System.out.printf("Try again!\n");
            System.exit(0);
        }
        SpeedTest test=new SpeedTest(mode,difficulty);
        test.Start();





    }



}