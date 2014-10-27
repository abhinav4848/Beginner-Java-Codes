//to generate  5 random nos. from 0 to 2 and declare winner from 2 players depending on whose sum of nos. are greater.
public class Game
{
    public static void main(String args[])
    {
        /*Suppose a game of tossing a coin is played among two players in which each player is allowed to toss a coin 10 times. Aplayer is declared winner if he/she gets maximum no. of heads. It can be illustrated with the help of for statement and random() function as given below:*/
        int d,c=0,p=0;
        for(int i=1;i<=10;i++)
        {
            d=(int)(Math.random()*2);/*The 2 can be replaced with any no. and result nos. will be below that no.*/
            System.out.println("The Score of First player="+d);
            if(d==1)
            c++;
        }
        for(int i=1;i<=10;i++)
        {
            d=(int)(Math.random()*2);/*The 2 can be replaced with any no. and result nos. will be below that no.*/
            System.out.println("The Score of Second player="+d);
            if(d==1)
            p++;
        }
        if(c>p)
        System.out.println("\nThe First Player Wins.");
        else
        System.out.println("\nThe Second Player Wins.");
    }
}