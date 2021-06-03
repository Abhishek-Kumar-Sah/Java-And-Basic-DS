package DSA.Recursion;


import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfDiscs = sc.nextInt();

        char sourceTower = 'A', auxiliaryTower = 'B', destinationTower = 'C';


        TOH(noOfDiscs,sourceTower,auxiliaryTower,destinationTower);
    }

    public static void TOH(int n,char A , char B, char C){
        if (n == 1) {
            System.out.println("Move Disk 1 form Tower " + A + " to Tower " + C);
            return;
        }

        TOH(n-1,A,C,B);
        System.out.println("Move Disk "+n+" from Tower "+A+" to Tower "+C);
        TOH(n-1,B,A,C);

    }
}
