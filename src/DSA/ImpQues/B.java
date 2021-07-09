package DSA.ImpQues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        long numbcasesr= sc.nextLong();

        PriorityQueue<Long> myqueue = new PriorityQueue<>(Collections.reverseOrder());


        for (long test=1; test<=Math.sqrt(numbcasesr); test++)
        {
            if (numbcasesr%test==0)
            {

                if (numbcasesr/test == test)
                    myqueue.add(test);

                else
                {  myqueue.add(test);myqueue.add(numbcasesr/test);}
            }


        }



        int k= myqueue.size();



        for(int i=0;i<k;i++)
        {


            long r= myqueue.poll();

            if(ChechIt(r)){ System.out.println(r);break;}

        }
    }

    static boolean ChechIt(long y)
    {

        long i=2;



        while(i*i<=y)
        {
            if(y%(i*i)==0) return false;


            i++;
        }
        return true;


    }


}
