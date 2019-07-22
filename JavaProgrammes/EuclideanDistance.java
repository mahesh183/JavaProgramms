import java.util.Scanner;
import java.lang.Math;

import java.lang.Math;
public class EuclideanDistance{
    static double r;
    static double calculateEuclidean(Double x1,double y1,double x2,double y2){
        x1 -= x2;
        x1 = Math.pow(x1, 2);
        y1 -= y2;
        y1  = Math.pow(y1,2);
        r   = Math.sqrt(x1+y1);
        return r;
    }

    public static void main(String args[]){
        double x2=Double.parseDouble(args[1]);
        double y2=Double.parseDouble(args[0]);
       
        System.out.println("First Argument y2"+y2);
        System.out.println("second Argument x2"+x2);

        double x1=0;
        double y1=0;
        double r;
        r = calculateEuclidean(x1,y1,x2,y2);
        System.out.println("Euclidean Distance for "+x2+ " and " +y2+ " from origine (0,0) is "+r+" .");

    }
}