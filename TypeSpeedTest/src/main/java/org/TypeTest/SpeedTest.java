package org.TypeTest;

import java.time.Clock;
import java.util.Date;
import java.util.Scanner;

public class SpeedTest {
    private int Mode;
    private int Difficulty;
    String result;
    Text text=new Text(Difficulty);
    double accuracy=0;
    SpeedTest(int Mode, int Difficulty) {
        this.Mode = Mode;
        this.Difficulty = Difficulty;
    }

    public void Start(){
        switch(Mode){
            case 1:
                result=FirstMode(Difficulty);
                accuracy=Check(result,Difficulty);
                DisplayResults(accuracy,Difficulty);
                break;
            case 2:
                result=SecondMode(Difficulty);
                accuracy=Check(result,Difficulty);
                DisplayResults(accuracy,Difficulty);
                break;

        }
    }

    private String SecondMode(int difficulty) {
        StringBuilder result=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Prepare to type the text");
        switch(difficulty){
            case 1:
                System.out.println(text.getEasy()+"\n");
                break;
            case 2:
                System.out.println(text.getMedium()+"\n");
                break;
            case 3:
                System.out.println(text.getHard()+"\n");
                break;
            case 4:
                System.out.println(text.getImpossible()+"\n");
                break;
        }
                result.append(sc.nextLine());


        return result.toString();
    }

    private void DisplayResults(double accuracy, int difficulty) {
            System.out.println("Your accuracy is "+accuracy+'%'+" with difficulty "+difficulty);
    }

    private double Check(String result,int Difficulty) {
        double acccuracy=0;
        long size = switch (Difficulty) {
            case 1 -> text.getEasy().length();
            case 2 -> text.getMedium().length();
            case 3 -> text.getHard().length();
            case 4 -> text.getImpossible().length();
            default -> throw new IllegalStateException("Unexpected value: " + Difficulty);
        };
        if(size>result.length())
        {
            size=result.length();
            System.out.println("You did not typed the whole text!!");
        }
        for(int i=0;i<size;i++){
            if(result.charAt(i)==text.getEasy().charAt(i)){
                acccuracy++;
            }
        }
        return acccuracy==0?0:acccuracy/result.length()*100;







    }

    private String FirstMode(int difficulty ) {
        StringBuilder res= new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Prepare to type the text");
        switch(difficulty){
            case 1:  System.out.println(text.getEasy()+"\n"); break;
            case 2:  System.out.println(text.getMedium()+"\n"); break;
            case 3:  System.out.println(text.getHard()+"\n"); break;
            case 4:  System.out.println(text.getImpossible()+"\n"); break;
        }
        ClockThread clock=new ClockThread();
        clock.run();
        while(clock.isAlive()){
            if(sc.hasNextLine()){
                res.append(sc.nextLine());
            }
        }
        System.out.println("Your time is up");

        return res.toString();
    }


}
class ClockThread extends Thread{

    Thread clock=new Thread();




    @Override
    public void run() {
        try {
          sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}