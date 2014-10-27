//Lock Points are question nos. 4, 9, 12.
//Errors are : If 50:50 is used followed by phone a friend or audience poll, the results come out for all the 4 answers.
//Double Dip and Flip the Question are still left to make.
import javax.swing.JOptionPane;
import java.io.*;
public class KBC_Mod
{
    public static String name, cash, finalcash="0";
    public static String cor1="", cor2="", cor3="", cor4="";
    public static int ans, entAns, conf, last=0, helpTime=0;
    public static char ch, choice;
    public static String for50;
    public static int for51, fiftyfifty=0, phoneFriend=0, audience=0, password;
    public static String phone, aud1, aud2, aud3, aud4;
    public static int rite=1;
    public static void help()throws IOException
    {
        System.out.println("--HELP--");
        if(helpTime==0)
            System.out.println("**In Fastest Finger First, Type the Number and press Enter and then Type the next number and press Enter again till all the 4 numbers are entered.\n**For other General Questions,");
        System.out.println("**Enter the number corresponding to the correct answer and press Enter. (Only the first character is taken into account)");
        System.out.println("**After you give the answer, and if the answer is right, we proceed to the next question.");
        System.out.println("**The Lock points are Question 4, Question 9, and Question 12, out of the 15 Questions in Total.");
        System.out.println("**After any Question, Press 'Q' for 50:50, 'W' for Phone a Friend 'E' for Audience Poll.");
        System.out.println("**Press 'Z' for help anytime you want.\n--------");
        if (helpTime==1)
        {
            System.out.println("Now, Get Back to answering.");
            carryon();
        }
    }
    public static void bye()//called at the end
    {
        System.out.println("----------------------------");
        System.out.println("**KBC Developed by Abhinav Kumar.\n**Copyright Reserved(c). 2011\n**All Rights Reserved.\n**This program is not affiliated in any way to '2 Way Traffic' and belongs to COGIA CORP.");
        System.out.println("----------------------------");
    }
    public static void helpLine(int ch)throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        char ch1=(char)ch;
        if(ch=='q' || ch=='Q')
        {
            //50:50
            if(fiftyfifty==0)
            {
                System.out.println("You asked for 50:50");
                fiftyfifty++;
                if(ans==1)
                {
                    JOptionPane.showMessageDialog(null, "The Remaining options are:\n"+cor1+"\n"+for50, "Results", JOptionPane.PLAIN_MESSAGE);
                    System.out.println("The Remaining options are:\n"+cor1+"\n"+for50);
                }
                if(ans==2)
                {
                    if(for51>ans)
                    {
                        JOptionPane.showMessageDialog(null, "The Remaining options are:\n"+cor2+"\n"+for50, "Results", JOptionPane.PLAIN_MESSAGE);
                        System.out.println("The Remaining options are:\n"+cor2+"\n"+for50);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "The Remaining options are:\n"+for50+"\n"+cor2, "Results", JOptionPane.PLAIN_MESSAGE);
                        System.out.println("The Remaining options are:\n"+for50+"\n"+cor2);
                    }
                }
                if(ans==3)
                {
                    if(for51>ans)
                    {
                        JOptionPane.showMessageDialog(null, "The Remaining options are:\n"+cor3+"\n"+for50, "Results", JOptionPane.PLAIN_MESSAGE);
                        System.out.println("The Remaining options are:\n"+cor3+"\n"+for50);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "The Remaining options are:\n"+for50+"\n"+cor3, "Results", JOptionPane.PLAIN_MESSAGE);
                        System.out.println("The Remaining options are:\n"+for50+"\n"+cor3);
                    }
                }   
                if(ans==4)
                {
                    JOptionPane.showMessageDialog(null, "The Remaining options are:\n"+for50+"\n"+cor4, "Results", JOptionPane.PLAIN_MESSAGE);
                    System.out.println("The Remaining options are:\n"+for50+"\n"+cor4);
                }
                System.out.println("Choose which of the two you think is right (or you may choose another Life Line if you have):");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You already used 50:50 once, You can't use it again.\nYou have to tell the answer or choose another Life Line", "Error", JOptionPane.ERROR_MESSAGE);
                //System.out.println("You already used 50:50 once, You can't use it again.\nYou have to tell the answer or choose another Life Line");
            }
            carryon();
        }
        else if(ch=='w' || ch=='W')
        {
            //Phone a friend
            if(phoneFriend==0)
            {
                phoneFriend++;
                System.out.println("You asked for Phone A Friend.");
                System.out.println("Hey "+name+", Howz Life man?\nI think the answer should be "+phone);
                System.out.print("Let's see how much you trust your friend (or you may choose another Life Line if you have): ");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You already called your Friend once, You can't use it again.\nYou have to tell the answer or choose another Life Line", "Sorry", JOptionPane.ERROR_MESSAGE);
                //System.out.println("You already called your Friend once, You can't use it again.\nYou have to tell the answer or choose another Life Line");
            }
            carryon();
        }
        else if(ch=='e' || ch=='E')
        {
            //Audience Poll
            if(audience==0)
            {
                audience++;
                System.out.println("You asked for The Almighty Audience Poll, and here it is:");
                JOptionPane.showMessageDialog(null, "**"+aud1+"\n**"+aud2+"\n**"+aud3+"\n**"+aud4, "Audience Poll", JOptionPane.PLAIN_MESSAGE);
                System.out.println("**"+aud1+"\n**"+aud2+"\n**"+aud3+"\n**"+aud4);
                System.out.print("Now say, which one do you prefer (or you may choose another Life Line if you have): ");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You already used Audience Poll once, You can't use it again.\nYou have to tell the answer or choose another Life Line.", "Results", JOptionPane.ERROR_MESSAGE);
                //System.out.println("You already used Audience Poll once, You can't use it again.\nYou have to tell the answer or choose another Life Line.");
            }
            carryon();
        }
        else if(ch=='p'||ch=='P')//Admin crack, if the password is right, it gives the right answer to you.
        {
            if(password==0)
            {
                System.out.println("Verify if you really know the loophole by answering upcoming questions");
                //System.out.println("Enter your 9 digit password:");
                //String pass=ak.readLine();
                String pass=JOptionPane.showInputDialog("Enter your 9 digit password:");
                String actualPass="135798642";
                if(pass.compareTo(actualPass)==0)
                {
                    //System.out.println("Answer who developed this program:");
                    //String programmer=ak.readLine();
                    String programmer=JOptionPane.showInputDialog("Answer who developed this program:");
                    programmer=programmer.toLowerCase();
                    String actProgrammer="abhinav";
                    if(programmer.compareTo(actProgrammer)==0)
                    {
                         System.out.println("--Congratulations, you made it.--");
                         System.out.print("The answer is: ");
                         if(ans==1)
                            System.out.println(cor1);
                         if(ans==2)
                            System.out.println(cor2);
                         if(ans==3)
                            System.out.println(cor3);
                         if(ans==4)
                            System.out.println(cor4);
                         password=1;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry, you got the programmer name wrong!!!, Try on your own..", "Results", JOptionPane.WARNING_MESSAGE);
                        password=2;
                        //System.out.println("Sorry, you got the programmer name wrong!!!, Try on your own..");
                    }
                }
                else
                {
                    System.out.println("Access Denied, Wrong Password");
                    password=2;
                }
            }
            else if(password==1)
            {
                System.out.println("As you attempted this password trick earlier, we directly give you the answer now.");
                System.out.print("The answer is: ");
                if(ans==1)
                    System.out.println(cor1);
                if(ans==2)
                    System.out.println(cor2);
                if(ans==3)
                    System.out.println(cor3);
                if(ans==4)
                    System.out.println(cor4);
            }
            else if(password==2)
            {
                //System.out.println("You had given wrong entry earlier, so you can't access this feature for this session of the game.");
                JOptionPane.showMessageDialog(null, "You had given wrong entry earlier, so you can't access this feature for this session of the game.", "Results", JOptionPane.ERROR_MESSAGE);
            }
            carryon();
        }
    }
    public static void carryon()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        ch=(ak.readLine()).charAt(0);
        if(Character.isDigit(ch))
        {
            entAns=(int)(ch);
            entAns-=48;//ASCII value of 1 is 49 and of 0 is 48, so to get char into int, subtract 48 from the character.
            if(entAns==0 || entAns>4)
            {
                JOptionPane.showMessageDialog(null, "Please Enter only 1, 2, 3, 4, or one of the valid commands (eg. Q, W, E, Z) Nothing Else.... Enter Again:", "Error", JOptionPane.WARNING_MESSAGE);
                //System.out.println("Please Enter only 1, 2, 3, 4, or one of the valid commands (eg. Q, W, E, Z) Nothing Else.... Enter Again:");
                carryon();
            }
            else
            {
                checker(ans, entAns);
            }
        }
        else if(ch=='q' || ch=='w' || ch=='e' || ch=='Q' || ch=='W' || ch=='E' || ch=='p' || ch=='P')
        {
            helpLine(ch);
        }
        else if(ch=='z' || ch=='Z')
        {
            help();
        }
        else
        {
            //System.out.println("Wrong Input, Try Again.");//if anything other than what is asked is entered, it will ask to re enter another value.
            JOptionPane.showMessageDialog(null, "Wrong Input, Try Again.", "Wrong Input", JOptionPane.ERROR_MESSAGE);
            carryon();
        }
    }
    public static void confFastestFinger(int ans1, int ans2, int ans3, int ans4, int rite)
    {
        int fin=0;
        String correct="";
        if(rite==1)
        {
            if(ans1==4 && ans2==2 && ans3==3 && ans4==1)
                fin=1; 
            else
                correct=cor4+"\n"+cor2+"\n"+cor3+"\n"+cor1;
        }
        if(rite==2)
        {
            if(ans1==3 && ans2==1 && ans3==2 && ans4==4)
                fin=1; 
            else
                correct=cor3+"\n"+cor1+"\n"+cor2+"\n"+cor4;
        }   
        if(rite==3)
        {
             if(ans1==2 && ans2==4 && ans3==3 && ans4==1)
                fin=1; 
            else
                correct=cor2+"\n"+cor4+"\n"+cor3+"\n"+cor1;
        }
        if(rite==4)
        {
             if(ans1==3 && ans2==4 && ans3==2 && ans4==1)
                fin=1; 
            else
                correct=cor3+"\n"+cor4+"\n"+cor2+"\n"+cor1;
        }
        if(fin==1)
        {
            System.out.println("Congratulations, it's Right.");
            System.out.println("So Let's Proceed...");
        }
        else
        {
            System.out.println("-----------------");
            System.out.println("Sorry, That was Wrong, The right order is \n"+correct);
            System.out.println("Doesn't Matter, Let's Proceed....");
        }
    }
    public static void fastestFinger()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------------------");
        System.out.println("-------- FASTEST FINGER FIRST --------");
        int ch=(int)(Math.random()*5);
        int ans1, ans2, ans3, ans4;
        if(ch==0)
        {
            rite=1;
            System.out.println("Put these in Roman Numerals in ascending order:");
            cor1="1: M"; cor2="2: L"; cor3="3: C"; cor4="4: X";
        }
        if(ch==1)
        {
            rite=2;
            System.out.println("Put these Islands in Decreasing order of size");
            cor1="1: Great Britain"; cor2="2: Cuba"; cor3="3: Madagascar"; cor4="4: Sri Lanka";
        }
        if(ch==2)
        {
            rite=3;
            System.out.println("Order these Instruments from small to Big:");
            cor1="1: Grand Piano"; cor2="2: Flute"; cor3="3: Double Bass"; cor4="4: Banjo";
        }
        if(ch==3)
        {
            rite=4;
            System.out.println("Furthest First, Order these By Distance from the Sun:");
            cor1="1: Mercury"; cor2="2: Earth"; cor3="3: Neptune"; cor4="4: Mars";
        }
        if(ch==4)
        {
            rite=3;
            System.out.println("Starting with the oldest, put these actresses in order:");
            cor1="1: Mia Wasikowska"; cor2="2: Meryl Streep"; cor3="3: Nicole Kidman"; cor4="4: Sandra Bullock";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        ans1=((ak.readLine()).charAt(0))-48;//This is done to prevent occurence of errors if characters are entered.
        ans2=((ak.readLine()).charAt(0))-48;
        ans3=((ak.readLine()).charAt(0))-48;
        ans4=((ak.readLine()).charAt(0))-48;
        confFastestFinger(ans1, ans2, ans3, ans4, rite);
    }
    public static void checker(int ans, int entAns)
    {
        if(ans==entAns)
        {
            System.out.println("Congratulations, You Win Rs. "+cash);
            JOptionPane.showMessageDialog(null, "Congratulations, You Win Rs. "+cash, "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            if(last==1)
                bye();
        }
        else
        {
            System.out.print("Wrong answer, The Right Answer is ");
            if(ans==1)
                 System.out.println(cor1);
            if(ans==2)
                 System.out.println(cor2);
            if(ans==3)
                 System.out.println(cor3);
            if(ans==4)
                 System.out.println(cor4);
            //System.out.println("You are Leaving with Rs."+finalcash+"\nNice to have played with you, Bye. Bye......");
            JOptionPane.showMessageDialog(null, "You are Leaving with Rs."+finalcash+"\nNice to have played with you, Bye. Bye......", "Sorry", JOptionPane.WARNING_MESSAGE);
            bye();
            conf=1;//don't Modify this value.
        }
    }
    public static void question1()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="1,000";
        System.out.println("----Question 1----");
        if(ch==0)
        {
            ans=3;
            for51=4;
            System.out.println("Complete the title of the Film '.... in the Rain'");
            cor1="1: Screamin'"; cor2="2: Shoutin'"; cor3="3: Singin'"; cor4="4: Screamin'";
            for50=cor4;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 01%";
            aud2=cor2+"- 07%";
            aud3=cor3+"- 82%";
            aud4=cor4+"- 10%";
        }
        if(ch==1)
        {
            ans=1;
            for51=4;
            System.out.println("In which country is the Holiday destination of Orlando Located?");
            cor1="1: USA"; cor2="2: Australia"; cor3="3: Mexico"; cor4="4: Canada";
            for50=cor4;
            phone=cor1+" Definitely.";
            aud1=cor1+"- 92%";
            aud2=cor2+"- 03%";
            aud3=cor3+"- 00%";
            aud4=cor4+"- 05%";
        }
        if(ch==2)
        {
            ans=1;
            for51=2;
            System.out.println("Yogurt is made from what?");
            cor1="1: Milk"; cor2="2: Eggs"; cor3="3: Flour"; cor4="4: Butter";
            for50=cor2;
            phone=cor1+" Definitely.";
            aud1=cor1+"- 98%";
            aud2=cor2+"- 01%";
            aud3=cor3+"- 01%";
            aud4=cor4+"- 00%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
   public static void question2()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*4);
        cash="2,000";
        System.out.println("----Question 2----");
        if(ch==0)
        {
            ans=2;
            for51=4;
            System.out.println("In Which Year will India observe its bicentenery year of Independence?");
            cor1="1: 2047"; cor2="2: 2147"; cor3="3: 2247"; cor4="4: 2097";
            for50=cor4;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 01%";
            aud2=cor2+"- 99%";
            aud3=cor3+"- 00%";
            aud4=cor4+"- 00%";
        }
        if(ch==1)
        {
            ans=2;
            for51=1;
            System.out.println("Which river flows through the capital of India?");
            cor1="1: Ganga"; cor2="2: Yamuna"; cor3="3: Sabarmati"; cor4="4: Narmada";
            for50=cor1;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 02%";
            aud2=cor2+"- 95%";
            aud3=cor3+"- 03%";
            aud4=cor4+"- 00%";
        }
        if(ch==2)
        {
            ans=2;
            for51=4;
            System.out.println("Which of these terms refers to a delievery in cricket?");
            cor1="1: Leg Puller"; cor2="2: Leg Cutter"; cor3="3: Leg Chopper"; cor4="4: Leg Grinder";
            for50=cor4;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 05%";
            aud2=cor2+"- 95%";
            aud3=cor3+"- 00%";
            aud4=cor4+"- 05%";
        }
        if(ch==3)
        {
            ans=3;
            for51=1;
            System.out.println("The purity of which of these is usually measured in carats?");
            cor1="1: Aluminium"; cor2="2: Bronze"; cor3="3: Gold"; cor4="4: Iron";
            for50=cor1;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 00%";
            aud2=cor2+"- 30%";
            aud3=cor3+"- 70%";
            aud4=cor4+"- 00%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question3()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="5,000";
        System.out.println("----Question 3----");
        if(ch==0)
        {
            ans=2;
            for51=3;
            System.out.println("Which planned city is named after the temple of Chandi?");
            cor1="1: Chandernagore"; cor2="2: Chandigarh"; cor3="3: Chandipur-on-Sea"; cor4="4: Chandrapur";
            for50=cor3;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 02%";
            aud2=cor2+"- 96%";
            aud3=cor3+"- 01%";
            aud4=cor4+"- 01%";
        }
        if(ch==1)
        {
            ans=4;
            for51=2;
            System.out.println("In which of the following films did Juhi Chawla not act?");
            cor1="1: Darr"; cor2="2: Yes Boss"; cor3="3: Duplicate"; cor4="4: Swadesh";
            for50=cor2;
            phone=cor4+" Definitely.";
            aud1=cor1+"- 00%";
            aud2=cor2+"- 05%";
            aud3=cor3+"- 07%";
            aud4=cor4+"- 88%";
        }
        if(ch==2)
        {
            ans=2;
            for51=4;
            System.out.println("Which community's new year is called 'Navroz'?");
            cor1="1: Sikhs"; cor2="2: Parsis"; cor3="3: Christians"; cor4="4: Muslims";
            for50=cor4;
            phone=cor2+" Definitely. It's a tricky question, but I knew It.";
            aud1=cor1+"- 10%";
            aud2=cor2+"- 76%";
            aud3=cor3+"- 05%";
            aud4=cor4+"- 09%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question4()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="10,000. No matter what happens, you will atleast leave with this Rs. 10,000 now.";
        System.out.println("----Question 4 (Lock Point)----");
        if(ch==0)
        {
            ans=3;
            for51=1;
            System.out.println("Which gods are jointly worshipped under the title 'Hari-Hara'?");
            cor1="1: Shiva and Brahma"; cor2="2: Brahma and Vishnu"; cor3="3: Vishnu and Shiva"; cor4="4: Ganesh and Indra";
            for50=cor1;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 00%";
            aud2=cor2+"- 19%";
            aud3=cor3+"- 75%";
            aud4=cor4+"- 06%";
        }
        if(ch==1)
        {
            ans=2;
            for51=3;
            System.out.println("Which Boxer's real name is 'Cassius Clay'?");
            cor1="1: Mike Tyson"; cor2="2: Muhammad Ali"; cor3="3: Sonny Liston"; cor4="4: Roberto Duran";
            for50=cor3;
            phone=cor2+" Definitely. How would you not know it's the ultimate Guy?????";
            aud1=cor1+"- 30%";
            aud2=cor2+"- 69%";
            aud3=cor3+"- 01%";
            aud4=cor4+"- 00%";
        }
        if(ch==2)
        {
            ans=2;
            for51=1;
            System.out.println("Which is the hardest subastance in the human body?");
            cor1="1: Skull Bones"; cor2="2: Tooth Enamel"; cor3="3: Kneecap"; cor4="4: Finger Nail";
            for50=cor1;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 31%";
            aud2=cor2+"- 64%";
            aud3=cor3+"- 04%";
            aud4=cor4+"- 01%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question5()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="20,000";
        finalcash="10,000";
        System.out.println("----Question 5----");
        if(ch==0)
        {
            ans=4;
            for51=1;
            System.out.println("Which of these 'Bollywood' Films did not star a former Miss India?");
            cor1="1: Partner"; cor2="2: Vaastav"; cor3="3: Dastak"; cor4="4: Sarkar";
            for50=cor1;
            phone=cor4+" Definitely.";
            aud1=cor1+"- 00%";
            aud2=cor2+"- 11%";
            aud3=cor3+"- 14%";
            aud4=cor4+"- 75%";
        }
        if(ch==1)
        {
            ans=3;
            for51=4;
            System.out.println("Who among these is a religious and spiritual leader of the Jews?");
            cor1="1: Padre"; cor2="2: Maulvi"; cor3="3: Rabbi"; cor4="4: Sensei";
            for50=cor4;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 11%";
            aud2=cor2+"- 10%";
            aud3=cor3+"- 70%";
            aud4=cor4+"- 09%";
        }
        if(ch==2)
        {
            ans=2;
            for51=4;
            System.out.println("Which leadeer was also called the 'Fuehrer'?");
            cor1="1: Stalin"; cor2="2: Hitler"; cor3="3: Idi Amin"; cor4="4: Mussolini";
            for50=cor4;
            phone=cor2+" Definitely, We studied it in History last Year.";
            aud1=cor1+"- 09%";
            aud2=cor2+"- 72%";
            aud3=cor3+"- 12%";
            aud4=cor4+"- 07%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question6()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="40,000";
        System.out.println("----Question 6----");
       if(ch==0)
        {
            ans=2;
            for51=3;
            System.out.println("The emblem of RK Films was taken from an image from which of these films?");
            cor1="1: Awara"; cor2="2: Barsaat"; cor3="3: Shree 420"; cor4="4: Jagte Raho";
            for50=cor3;
            phone=cor2+" I am not that sure but I am sure enough to say you go with Barsaat.";
            aud1=cor1+"- 12%";
            aud2=cor2+"- 79%";
            aud3=cor3+"- 09%";
            aud4=cor4+"- 00%";
        }
        if(ch==1)
        {
            ans=3;
            for51=1;
            System.out.println("Which Asian country's flag bears Peepal (Bo) Leaves?");
            cor1="1: Nepal"; cor2="2: Bhutan"; cor3="3: Sri Lanka"; cor4="4: Thailand";
            for50=cor1;
            phone=cor3+" Definitely. Around the lion , there are 4 of them.";
            aud1=cor1+"- 00%";
            aud2=cor2+"- 11%";
            aud3=cor3+"- 79%";
            aud4=cor4+"- 10%";
        }
        if(ch==2)
        {
            ans=2;
            for51=4;
            System.out.println("Which of these batsmen had (has) an average of 99.94 runs in Test Cricket?");
            cor1="1: Gary Sobers"; cor2="2: Don Bradman"; cor3="3: Sunil Gavaskar"; cor4="4: George Headley";
            for50=cor4;
            phone=cor2+" Definitely. Cricket Freak Man.";
            aud1=cor1+"- 12%";
            aud2=cor2+"- 76%";
            aud3=cor3+"- 12%";
            aud4=cor4+"- 00%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question7()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="80,000";
        System.out.println("----Question 7----");//Programmer Note: Questions taken from Question 7 section of the Quiz book.
        if(ch==0)
        {
            ans=2;
            for51=1;
            System.out.println("In which mountain range does Siachen Glacier lie?");
            cor1="1: Himalaya"; cor2="2: Karakoram"; cor3="3: Kunlun Shan"; cor4="4: Hindu Kush";
            for50=cor1;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 32%";
            aud2=cor2+"- 37%";
            aud3=cor3+"- 14%";
            aud4=cor4+"- 17%";
        }
        if(ch==1)
        {
            ans=2;
            for51=3;
            System.out.println("What is the currency of Afghanistan?");
            cor1="1: Riyal"; cor2="2: Afghani"; cor3="3: Dirham"; cor4="4: Rupiah";
            for50=cor3;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 20%";
            aud2=cor2+"- 44%";
            aud3=cor3+"- 11%";
            aud4=cor4+"- 25%";
        }
        if(ch==2)
        {
            ans=1;
            for51=2;
            System.out.println("Which dynasty ruled Delhi immediately after the Tughlaqs?");
            cor1="1: Sayyid"; cor2="2: Lodi"; cor3="3: Mughal"; cor4="4: Khilji";
            for50=cor2;
            phone=cor1+" Definitely. It was the Sayyid Dynasty.";
            aud1=cor1+"- 38%";
            aud2=cor2+"- 15%";
            aud3=cor3+"- 17%";
            aud4=cor4+"- 30%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question8()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="1,60,000";
        System.out.println("----Question 8----");//Programmer Note: Questions taken from Question 7 section of the Quiz book.
        if(ch==0)
        {
            ans=2;
            for51=4;
            System.out.println("In Australia, what are MCG and SCG names of?");
            cor1="1: Anabolic Steroids"; cor2="2: Cricket Stadiums"; cor3="3: Kangaroo Parks"; cor4="4: Rock Bands";
            for50=cor4;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 17%";
            aud2=cor2+"- 49%";
            aud3=cor3+"- 21%";
            aud4=cor4+"- 13%";
        }
        if(ch==1)
        {
            ans=3;
            for51=1;
            System.out.println("Whom did Sonia Gandhi succeed as the President of the Congress in 1998?");
            cor1="1: P V Narasimha Rao"; cor2="2: Pranab Mukharjee"; cor3="3: Sitaram Kesri"; cor4="4: Sharad Pawar";
            for50=cor1;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 32%";
            aud2=cor2+"- 22%";
            aud3=cor3+"- 37%";
            aud4=cor4+"- 09%";
        }
        if(ch==2)
        {
            ans=3;
            for51=1;
            System.out.println("Which Hindi Film comedian's real name is 'Badruddin Jamaluddin Qazi'?");
            cor1="1: Mehmood"; cor2="2: Jalal Agha"; cor3="3: Johnny Walker"; cor4="4: Ajit";
            for50=cor1;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 05%";
            aud2=cor2+"- 17%";
            aud3=cor3+"- 59%";
            aud4=cor4+"- 19%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question9()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="3,20,000. No matter what happens, you will atleast leave with this Rs. 3,20,000 now.";
        System.out.println("----Question 9 (Lock Point)----");//Programmer Note: Questions taken from Question 8 section of the Quiz book.
        if(ch==0)
        {
            ans=3;
            for51=2;
            System.out.println("In Olympic archery, what is the colour of the central ring of the target?");
            cor1="1: White"; cor2="2: Red"; cor3="3: Yellow"; cor4="4: Black";
            for50=cor2;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 14%";
            aud2=cor2+"- 17%";
            aud3=cor3+"- 62%";
            aud4=cor4+"- 07%";
        }
        if(ch==1)
        {
            ans=3;
            for51=2;
            System.out.println("How many languages are listed in the 8th schedule of the Indian Constitution?");
            cor1="1: Twelve"; cor2="2: Fifteen"; cor3="3: Twenty-Two"; cor4="4: Twenty-One";
            for50=cor2;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 23%";
            aud2=cor2+"- 15%";
            aud3=cor3+"- 47%";
            aud4=cor4+"- 15%";
        }
        if(ch==2)
        {
            ans=4;
            for51=1;
            System.out.println("Which Gulf will one have to cross to get to Diu form Daman?");
            cor1="1: Gulf of Kutch"; cor2="2: Gulf of Mannar"; cor3="3: Gulf of Martaban"; cor4="4: Gulf of Khambhat";
            for50=cor1;
            phone=cor4+" Definitely. I am a Pedophile....";
            aud1=cor1+"- 19%";
            aud2=cor2+"- 18%";
            aud3=cor3+"- 24%";
            aud4=cor4+"- 39%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question10()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="6,40,000";
        finalcash="3,20,000";
        System.out.println("----Question 10----");//Programmer Note: Questions taken from Question 8 section of the Quiz book.
        if(ch==0)
        {
            ans=3;
            for51=2;
            System.out.println("Where are the headquarters of the 'OPEC' (Organization of the Petroleum exporting Countries)?");
            cor1="1: Tehran"; cor2="2: Riyadh"; cor3="3: Vienna"; cor4="4: Geneva";
            for50=cor2;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 12%";
            aud2=cor2+"- 14%";
            aud3=cor3+"- 58%";
            aud4=cor4+"- 16%";
        }
        if(ch==1)
        {
            ans=2;
            for51=3;
            System.out.println("Who was the last Jain Tirthankar?");
            cor1="1: Parshvanath"; cor2="2: Mahavira"; cor3="3: Neminath"; cor4="4: Rishabhdev";
            for50=cor3;
            phone=cor2+" Definitely.";
            aud1=cor1+"- 19%";
            aud2=cor2+"- 40%";
            aud3=cor3+"- 12%";
            aud4=cor4+"- 29%";
        }
        if(ch==2)
        {
            ans=3;
            for51=1;
            System.out.println("On what surface are French Open Tennis matches played at the Roland Garros?");
            cor1="1: Grass"; cor2="2: Synthetic"; cor3="3: Clay"; cor4="4: Concrete";
            for50=cor1;
            phone=cor3+" Definitely.";
            aud1=cor1+"- 16%";
            aud2=cor2+"- 33%";
            aud3=cor3+"- 39%";
            aud4=cor4+"- 12%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question11()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="12,50,000";
        System.out.println("----Question 11----");//Programmer Note: Questions taken from Question 9 section of the Quiz book.
        if(ch==0)
        {
            ans=1;
            for51=3;
            System.out.println("Who is the only woman to have receibed two Nobel prizes?");//q 1
            cor1="1: Marie Curie"; cor2="2: Aung San Su Kyi"; cor3="3: Mother Teresa"; cor4="4: Pearl S Buck";
            for50=cor3;
            phone=cor1+" Definitely. Ultimate Radium..";
            aud1=cor1+"- 31%";
            aud2=cor2+"- 21%";
            aud3=cor3+"- 30%";
            aud4=cor4+"- 18%";
        }
        if(ch==1)
        {
            ans=1;
            for51=4;
            System.out.println("Who was the frist person to walk in space?");//q 3
            cor1="1: Alexei Leonov"; cor2="2: John Glenn"; cor3="3: Leonid Kizim"; cor4="4: Yuri Romanenko";
            for50=cor4;
            phone=cor1+" Definitely. I am surfing the net now. He He...";
            aud1=cor1+"- 27%";
            aud2=cor2+"- 20%";
            aud3=cor3+"- 29%";
            aud4=cor4+"- 24%";
        }
        if(ch==2)
        {
            ans=2;
            for51=3;
            System.out.println("What name is give to a person who can recite the entire Koran from memory?");//q 4
            cor1="1: Mutawalli"; cor2="2: Hafiz"; cor3="3: Maulana"; cor4="4: Khatib";
            for50=cor3;
            phone=cor2+" Definitely. I am surfing the net now. He He...";
            aud1=cor1+"- 22%";
            aud2=cor2+"- 26%";
            aud3=cor3+"- 28%";
            aud4=cor4+"- 24%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question12()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="50,00,000. No matter what happens, you will atleast leave with this Rs. 50,00,000 now.";
        System.out.println("----Question 12 (Lock Point)----");//Programmer Note: Questions taken from Question 9 section of the Quiz book.
        if(ch==0)
        {
            ans=2;
            for51=3;
            System.out.println("Which court poet wrote the 'Akbarnama'?");//q 5
            cor1="1: Akbar"; cor2="2: Abul Fazl"; cor3="3: Birbal"; cor4="4: Firdausi";
            for50=cor3;
            phone=cor2+" Definitely. He was the only poet there.... I Think";
            aud1=cor1+"- 20%";
            aud2=cor2+"- 30%";
            aud3=cor3+"- 25%";
            aud4=cor4+"- 25%";
        }
        if(ch==1)
        {
            ans=3;
            for51=4;
            System.out.println("Which of these actors has not played nine different roles in one film?");//q 6
            cor1="1: Sivaji Ganesan"; cor2="2: Sanjeev Kumar"; cor3="3: Chiranjeevi"; cor4="4: A Nageshwar Rao";
            for50=cor4;
            phone=cor2+" I doubt it though";
            aud1=cor1+"- 30%";
            aud2=cor2+"- 11%";
            aud3=cor3+"- 37%";
            aud4=cor4+"- 22%";
        }
        if(ch==2)
        {
            ans=3;
            for51=4;
            System.out.println("To popularise which sport was the Silchar Club established in 1859?");//q 7
            cor1="1: Golf"; cor2="2: Badminton"; cor3="3: Polo"; cor4="4: Football";
            for50=cor4;
            phone=cor2+" Sounds like this should be the answer. Doesn't it?";
            aud1=cor1+"- 32%";
            aud2=cor2+"- 19%";
            aud3=cor3+"- 39%";
            aud4=cor4+"- 10%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question13()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="1,00,00,000";
        finalcash="50,00,000";
        System.out.println("----Question 13----");
        if(ch==0)
        {
            ans=3;
            for51=1;
            System.out.println("Which of these is a train run by the Indian Railways?");//q1
            cor1="1: Royal Palace"; cor2="2: Royal Queen"; cor3="3: Royal Orient"; cor4="4: Royal Safari";
            for50=cor1;
            phone=cor1+" Or wait, is it Palace on Wheels??";
            aud1=cor1+"- 17%";
            aud2=cor2+"- 24%";
            aud3=cor3+"- 30%";
            aud4=cor4+"- 29%";
        }
        if(ch==1)
        {
            ans=1;
            for51=4;
            System.out.println("Who is the only Indian to Score a hattrick in Olympic football?");//q2
            cor1="1: Nevill D'Souza"; cor2="2: P K Banerjee"; cor3="3: Shabbir Ali"; cor4="4: Baichung Bhutia";
            for50=cor4;
            phone=cor1+" I just saw on the net last week.";
            aud1=cor1+"- 29%";
            aud2=cor2+"- 24%";
            aud3=cor3+"- 22%";
            aud4=cor4+"- 25%";
        }
        if(ch==2)
        {
            ans=2;
            for51=3;
            System.out.println("Form which plant is the anti-malarial drug 'Quinine' obtained?");//q4
            cor1="1: Wattle"; cor2="2: Cinchona"; cor3="3: Eucalyptus"; cor4="4: Cinnamon";
            for50=cor3;
            phone=cor2+" Definitely. This is the cheapest question at this high level of difficulty. It's "+cor2;
            aud1=cor1+"- 24%";
            aud2=cor2+"- 30%";
            aud3=cor3+"- 27%";
            aud4=cor4+"- 19%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question14()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        cash="2,00,00,000";
        System.out.println("----Question 14----");
        if(ch==0)
        {
            ans=4;
            for51=3;
            System.out.println("Who invented the Oral Polio Vaccine (OPV)?");// q 1
            cor1="1: Ronald Ross"; cor2="2: Lousi Pasteur"; cor3="3: Francis Crick"; cor4="4: Albert Sabin";
            for50=cor3;
            phone=cor2+" I doubt it though.";
            aud1=cor1+"- 27%";
            aud2=cor2+"- 24%";
            aud3=cor3+"- 23%";
            aud4=cor4+"- 26%";
        }
        if(ch==1)
        {
            ans=4;
            for51=1;
            System.out.println("Which was the first country to make Christianity its official Religion?");// q 3
            cor1="1: Italy"; cor2="2: England"; cor3="3: Greece"; cor4="4: Armania";
            for50=cor1;
            phone=cor2+" Not sure though, but sounds like this should be.";
            aud1=cor1+"- 22%";
            aud2=cor2+"- 27%";
            aud3=cor3+"- 24%";
            aud4=cor4+"- 27%";
        }
        if(ch==2)
        {
            ans=3;
            for51=1;
            System.out.println("Who was the first Chief Justice of The Supreme Court of India?");//q4
            cor1="1: Mehr Chand Khanna"; cor2="2: K John Mathew"; cor3="3: H J Kania"; cor4="4: K N Wanchoo";
            for50=cor1;
            phone=cor3+" Definitely. We Indians should know it.";
            aud1=cor1+"- 25%";
            aud2=cor2+"- 24%";
            aud3=cor3+"- 26%";
            aud4=cor4+"- 25%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    public static void question15()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*3);
        last=1;
        cash="5,00,00,000. Well Done. You Maxed the game. Try again if you want.";
        System.out.println("----Question 15----");
        if(ch==0)
        {
            ans=4;
            for51=3;
            System.out.println("Which was the first National Park in India?");// q1
            cor1="1: Jaisalmer Desert"; cor2="2: Kanha"; cor3="3: Gir"; cor4="4: Hailey";
            for50=cor3;
            phone=cor3+" Sounds like it should be this only.";
            aud1=cor1+"- 25%";
            aud2=cor2+"- 28%";
            aud3=cor3+"- 19%";
            aud4=cor4+"- 28%";
        }
        if(ch==1)
        {
            ans=1;
            for51=3;
            System.out.println("Which of these awards was designed by Eva Savitribai Khanolkar?");//q 2
            cor1="1: Param Vir Chakra"; cor2="2: Jnanpith Award"; cor3="3: Bharat Ratna"; cor4="4: Miss India Crown";
            for50=cor3;
            phone=cor2+" with 100% doubt.";
            aud1=cor1+"- 20%";
            aud2=cor2+"- 24%";
            aud3=cor3+"- 32%";
            aud4=cor4+"- 24%";
        }
        if(ch==2)
        {
            ans=1;
            for51=4;
            System.out.println("By what name was Port Blair originally known?");//q 11
            cor1="1: Port Cornwallis "; cor2="2: Port Welleslley"; cor3="3: Port Dalhousie"; cor4="4: Port Bentinck";
            for50=cor4;
            phone=cor4+" but I'm not that sure.";
            aud1=cor1+"- 22%";
            aud2=cor2+"- 21%";
            aud3=cor3+"- 28%";
            aud4=cor4+"- 29%";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    /*
        public static void questionDemo()throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        int ch=(int)(Math.random()*1);
        cash="0,000";
        System.out.println("----Question Prototype----");
        if(ch==0)
        {
            ans=;
            for51=;
            System.out.println("");
            cor1="1: "; cor2="2: "; cor3="3: "; cor4="4: ";
            for50=cor;
            phone=cor+" Definitely.";
            aud1=cor1+"- %";
            aud2=cor2+"- %";
            aud3=cor3+"- %";
            aud4=cor4+"- %";
        }
        System.out.println(cor1+"\n"+cor2+"\n"+cor3+"\n"+cor4);
        carryon();
    }
    */
    public static void main(String args[])throws IOException
    {
        BufferedReader ak=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello and welcome to Who Wants to be a CROREPATI.. (Beta)");
        System.out.println("Press 'Z' and Enter for Help, any other value to proceed without HELP.");
        char help=(ak.readLine()).charAt(0);
        if(help=='z' || help=='Z')
            help();
        helpTime=1;
        System.out.println("Enter your Name:");
        name=ak.readLine();
        for(int i=1; i<2; i++)
        {
            fastestFinger();
            question1();
            if(conf==1)
                break;
            question2();
            if(conf==1)
                break;
            question3();
            if(conf==1)
                break;
            question4();
            if(conf==1)
                break;
            question5();
            if(conf==1)
                break;
            question6();
            if(conf==1)
                break;
            question7();
            if(conf==1)
                break;
            question8();
            if(conf==1)
                break;
            question9();
            if(conf==1)
                break;
            question10();
            if(conf==1)
                break;
            question11();
            if(conf==1)
                break;
            question12();
            if(conf==1)
                break;
            question13();
            if(conf==1)
                break;
            question14();
            if(conf==1)
                break;
            question15();
        }
    }
}