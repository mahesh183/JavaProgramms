
import java.util.Scanner;

public class WindChill{



    public static void main(String[] args) {
        double dRESULT=0;
        double dWIND = Double.parseDouble(args[0]);
        double dTEMPERATURE = Double.parseDouble(args[1]);
        WindChill WCObject=new WindChill();
        if((dTEMPERATURE>0 && dTEMPERATURE<50) && (dWIND>3 && dWIND<120)){
        dRESULT = WCObject.m_windChill(dWIND,dTEMPERATURE);
        }
        else{
            System.out.println("Run Again with proper parameter");    
        }
        System.out.println("WindChill is " +dRESULT);
    }
    
    public double m_windChill(double dWIND,double dTEMPERATURE){
        double dWindChill;
        dWIND = Math.pow(dWIND, 0.16);
        dWindChill   = 35.74+0.+6215*dTEMPERATURE+(0.4275*dTEMPERATURE-35.75)*dWIND;
        return dWindChill;
    }
}