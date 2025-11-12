//import library
import java.io.*; //to read and write data to files or other sources of input and output
import java.util.*;
//It includes the collections framework, legacy collection classes, the event model, date and time facilities, 
//internationalisation, and other utility classes (a string tokenizer, a random-number generator, and a bit array).

//start class 
public class BowlingApp
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); //to read input from keybord.
        
        int frame[] = new int[10]; //array for  ten frame 
        int scoringboard[][] = new int[2][12]; //array for all frame
        int highest = 0;
        String continueplay, name, winner = ""; //variable for confirmation continuation play, name & winner
        
        //use do-while beacuse user need to input the score first then the process proceed.
        //The process keeps going on until user enter n/N
        System.out.println("\n\t  Welcome to Java Bowling Console Gaming Score Board ");
        do
        {
            System.out.printf("\n\t  Enter you name: ");
            name = input.next();
            
            //prepare 10 space for frame
            for(int l1 = 0; l1 < 10; l1++)
                frame[l1] = 0;
            
            //prepare space to enter data of 2 shots
            for(int l2 = 0; l2 < 12; l2++)
                scoringboard[0][l2] = scoringboard[1][l2] = 0;
            
            nextframe: // label
            //enter data for 2 shots
            for(int i = 0; i < 10; i++) 
            {
                boolean check = false; //default value to check 
                int pins = 0; //how many pin has/have been knocked down
            
                while(!check == true)
                {                   
                    //which frame?
                    System.out.printf("\n\t   FRAME %2d ", new Object[] {Integer.valueOf(i + 1)});
                    
                    //First throw
                    System.out.printf("\n\t   Shot 1: ");
                    pins = input.nextInt();
                   
                    //check if input value valid or not
                    if(pins <= 10 && pins >= 0) 
                    {
                        scoringboard[0][i] = pins;
                        check = true;
                    }
                }
               
                //check if strike. jump to next frame if strike
                if(pins == 10)
                {
                    System.out.println("\n\t\t\tPerfect Strike!!");
                    continue;
                }
                check = false; //intialized check to move to next ball
    
                do
                {
                    int pins2 = 0; //utk check next ball jatuhkan brp pin
            
                    if(check)
                        continue nextframe; //continuation from nextframe
                   
                    System.out.print("\n\t   Shot 2: ");
                    pins2 = input.nextInt();
                   
                    //check if input value valid or not
                    if((pins2 <= 10 && pins2 >= 0) && (pins2 + scoringboard[0][i] < 11))
                    {
                        scoringboard[1][i] = pins2; //assign value into scoringboard
                        if(pins2 + scoringboard[0][i] == 10) //check if spare
                            System.out.println("\n\t\t\tNice, Spare!!");
                        check = true;
                    }
                }
                while(!check == true);
            }
        
            //for extra throws
            if(scoringboard[0][9] == 10) //if frame 10 got strike
            { 
                boolean check1 = false;
                int pins3 = 0; //pins for extra1 shot
                
                while(!check1 == true)
                {
                   System.out.print("\n\t   Shot 2: ");
                   pins3 = input.nextInt();
                   //check if the score valid
                   if(pins3 < 11 && pins3 >= 0) 
                   {
                       scoringboard[0][10] = pins3; //store in frame 11 first shot
                       check1 = true;
                   }
                }
                
                //if frame 11 (EXTRA 1) got strike
                if(scoringboard[0][10] == 10)
                {
                    boolean check2 = false;
                    int pins4 = 0; //pins utk extra2 shot
                    System.out.println("\n\t\t\tPerfect Strike...");
                    
                    while(!check2 == true)
                    {
                       System.out.print("\n\t   Shot 3: ");
                       pins4 = input.nextInt();
                       
                       if(pins4 < 11 && pins4 > 0)
                       {
                            scoringboard[0][11] = pins4;
                            check2 = true;
                            if(scoringboard[0][11] == 10)
                                System.out.print("\n\t\t\tPerfect Strike...");
                       }
                    }
                }
                else //if the first extra shot isn't a strike
                {
                    boolean check3 = false;
                    int pins5 = 0; //pins utk extra2 shot
                    
                    while(!check3 == true)
                    {
                        System.out.print("\n\t   Shot 3: ");
                        pins5 = input.nextInt();
                        
                        if((pins5 < 11 && pins5 >= 0) && (pins5 + scoringboard[0][10] < 11))
                        {
                            scoringboard[1][10] = pins5;
                            check3 = true;
                            if(pins5 + scoringboard[0][10] == 10) //check if spare
                                System.out.println("\n\t\t\tNice, Spare!!");
                        }
                    }
                }
            }
            else if(scoringboard[0][9] + scoringboard[1][9] == 10)
            {
                boolean check4 = false;
                int pins6 = 0;

                while(!check4 == true)
                {
                    System.out.print("\n\t   Shot 3: ");
                    pins6 = input.nextInt();
                    
                    if(pins6 <= 10 && pins6 >= 0)
                    {
                        scoringboard[0][10] = pins6;
                        check4 = true;
                    }
                }
            }
        
            //store data in the first frame
            if(scoringboard[0][0] == 10)
            {
                if(scoringboard[0][1] == 10) //calculating frame if next shot is strike
                    frame[0] = 10 + scoringboard[0][1] + scoringboard[0][2];
                else
                    frame[0] = 10 + scoringboard[0][1] + scoringboard[1][1];
            }
            else if(scoringboard[0][0] + scoringboard[1][0] == 10) //for spare
            {
                frame[0] = 10 + scoringboard[0][1];
            }
            else
            {
                frame[0] = scoringboard[0][0] + scoringboard[1][0];
            }
            
            //storing data in frames
            for(int j = 1; j < 10; j++)
            {
                //determining if strike, spare or normal
                if(scoringboard[0][j] == 10) //for strike
                {
                    if(scoringboard[0][j + 1] == 10) //calculating frame if next shot is strike
                        frame[j] = frame[j - 1] + 10 + scoringboard[0][j + 1] + scoringboard[0][j + 2];
                    else
                        frame[j] = frame[j - 1] + 10 + scoringboard[0][j + 1] + scoringboard[1][j + 1];
                }
                else if(scoringboard[0][j] + scoringboard[1][j] == 10) //for spare
                {
                    frame[j] = frame[j - 1] + 10 + scoringboard[0][j + 1];
                }
                else
                {
                    frame[j] = frame[j - 1] + scoringboard[0][j] + scoringboard[1][j];
                }
            }

            //Display output
            System.out.print("\n\tName: " +name);
            //row frame number
            System.out.print("\n\t_______________________________________________________________________________________________");
            System.out.print("\n\t|  FRAME  |");
            for(int k = 1; k < 10; k++)
                System.out.printf("%4d   |", new Object[] {Integer.valueOf(k) });
            System.out.print("    10     |");
            
            //displaying data for shot 1
            System.out.print("\n\t_______________________________________________________________________________________________");
            System.out.print("\n\t|  SHOT   |");
            for(int l = 0; l < 9; l++)
            {
                if(scoringboard[0][l] == 10)//strike
                    System.out.print(" X |   |");
                else if(scoringboard[0][l] + scoringboard[1][l] == 10)//spare
                    System.out.print(" " +scoringboard[0][l]+ " | / |");
                else if(scoringboard[0][l] == 0 && scoringboard[1][l] == 10)//a miss but manage to get spare
                    System.out.print(" - | / |");
                else if(scoringboard[0][l] != 0 && scoringboard[1][l] != 0)//2 shots
                    System.out.print(" " +(scoringboard[0][l])+ " | " +(scoringboard[1][l])+ " |");
                else if(scoringboard[0][l] == 0 && scoringboard[1][l] != 0)//1 shot, 1 miss
                    System.out.print(" - | " +scoringboard[1][l]+ " |");
                else if(scoringboard[1][l] == 0 && scoringboard[0][l] != 0)//opposite 1 shot, 1 miss
                    System.out.print(" " +scoringboard[0][l]+ " | - |");
                else//2 misses
                    System.out.print(" - | - |");
            }
            
            //displaying frame 10
            if(scoringboard[0][9] == 10)//first shot of frame 10 is a strike
            {
                if(scoringboard[0][10] == 10)//display data if the next shot is also a strike
                {
                    if(scoringboard[0][11] == 10)//3 strike in a row
                        System.out.print(" X | X | X |");
                    else if(scoringboard[0][11] != 0)//2 strike and a shot
                        System.out.print(" X | X | " +scoringboard[0][11]+ " |");
                    else//2 strike and a miss
                        System.out.print(" X | X | - |");
                }
                else if(scoringboard[0][10] + scoringboard[1][10] == 10)//a strike and a spare
                    System.out.print(" X | " +scoringboard[0][10]+ " | / |");
                else if(scoringboard[0][10] == 0 && scoringboard[1][10] == 10)//a strike & a miss but manage to get spare
                    System.out.print(" X | - | / |");
                else if(scoringboard[0][10] != 0 && scoringboard[1][10] != 0)//a strike and 2 shots
                    System.out.print(" X | " +scoringboard[0][10]+ " | " +scoringboard[0][11]+ " |");
                else if(scoringboard[0][10] == 0 && scoringboard[1][10] != 0)//a strike, 1 shot and a miss
                    System.out.print(" X | - | " +scoringboard[1][10]+ " |");
                else if(scoringboard[1][10] == 0 && scoringboard[0][10] != 0)//opposite of a strike, 1 shot and a miss
                    System.out.print(" X | " +scoringboard[0][10]+ " | - |");
                else//a strike and 2 misses
                    System.out.print(" X | - | - |");
            }
            else if(scoringboard[0][9] + scoringboard[1][9] == 10)//spare in frame 10
            {
                if(scoringboard[0][10] == 10)//a spare and a strike
                    System.out.print(" " +scoringboard[0][9]+ " | / | X |");
                else if(scoringboard[0][10] != 0)//a spare and a shot
                    System.out.print(" " +scoringboard[0][9]+ " | / | " +scoringboard[0][10]+ " |");
                else//a spare and a miss
                    System.out.print(" " +scoringboard[0][9]+ " | / | - |");
            }
            else//no extra shot in frame 10
            {
                if(scoringboard[0][9] != 0 && scoringboard[1][9] != 0)//2 shots
                    System.out.print(" " +scoringboard[0][9]+ " | " +scoringboard[1][9]+ " | - |");
                else if(scoringboard[0][9] != 0 && scoringboard[1][9] == 0)//1 shot and 1 miss
                    System.out.print(" " +scoringboard[0][9]+ " | - | - |");
                else if(scoringboard[0][9] == 0 && scoringboard[1][9] != 0)//opposite 1 shot and 1 miss
                    System.out.print(" - | " +scoringboard[1][9]+ " | - |");
                else//2 misses
                    System.out.print(" - | - | - |");
            }
            
            //displaying total score
            System.out.print("\n\t_______________________________________________________________________________________________");
            System.out.print("\n\t|  SCORE  |");
            for(int j1 = 0; j1 < 9; j1++)
            {
                if(frame[j1] >= 100)//if the score has 3 digits
                    System.out.print(frame[j1]+ "    |");
                else if(frame[j1] < 10)//if the score has 1 digit
                    System.out.print(frame[j1]+ "      |");
                else//if the score has 2 digits
                    System.out.print(frame[j1]+ "     |");
            }
            System.out.print(frame[9]+ "        |");
            System.out.print("\n\t_______________________________________________________________________________________________");
            
            if(frame[9] > highest)
            {
                highest = frame[9];
                winner = name;
            }
            
            //determining next player
            System.out.print("\n\n\t\t\tNew Player (Y/N)? ");
            continueplay = input.next();
            String s1 = input.nextLine();
        }
        while(continueplay.toUpperCase().charAt(0) == 'Y');
        
        System.out.println("\n\tThe winner of the game is " +winner+ " with a total score of " +highest+ "!");
    }
}
