import java.util.*;
class tictactoe
{
    char arr[][]=new char[3][3];
    void fill()
    {
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            arr[i][j]=' ';
        }
    }
    void random(char ch)
    {
        int a=(int)((Math.random()*1000)%100%3);
        int b=(int)((Math.random()*1000)%100%3);
        if (arr[a][b]==' ')
        arr[a][b]=ch;
        else
        random(ch);
    }
    void print()
    {
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            System.out.print(arr[i][j]+"\t");
            System.out.println("\n");
        }
    }
    void user(char ch,char c)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the row and column");
        int a=s.nextInt();
        int b=s.nextInt();
        if (arr[a][b]!=' ')
        {
            System.out.println("It has already been played there");
            user(ch,c);
        }
        else
        arr[a][b]=ch;
    }
    void check(String st,char ch)
    {
        if (arr[0][0]==ch && arr[0][1]==ch && arr[0][2]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[1][0]==ch && arr[1][1]==ch && arr[1][2]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[2][0]==ch && arr[2][1]==ch && arr[2][2]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[0][0]==ch && arr[1][0]==ch && arr[2][0]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[0][1]==ch && arr[1][1]==ch && arr[2][1]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[0][2]==ch && arr[1][2]==ch && arr[2][2]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[0][0]==ch && arr[1][1]==ch && arr[2][2]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
        if (arr[0][2]==ch && arr[1][1]==ch && arr[2][0]==ch)
        {
            System.out.println(st+" Wins");
            System.exit(0);
        }
    }
    void time(int k)
    {
        try 
        {
            Thread.sleep(k);//Sample: Thread.sleep(1000); 1 second sleep 
        } 
        catch (InterruptedException ex) 
        { 
            //SomeFishCatching 
        } 
    }
    public static void main()
    {
        tictactoe obj=new tictactoe();
        Scanner s=new Scanner(System.in);
        System.out.println("Choose X or O");
        char ui=s.next().charAt(0);
        char ci;
        if (ui=='X')
        ci='O';
        else
        ci='X';
        obj.fill();
        for(int i=1;i<=9;i++)
        {
            System.out.print("\f");
            obj.random(ci);
            obj.print();
            obj.time(1000);
            obj.check("Computer",ci);
            obj.user(ui,ci);
            System.out.print("\f");
            obj.print();
            obj.time(1000);
            obj.check("Player",ui);
        }
    }
}