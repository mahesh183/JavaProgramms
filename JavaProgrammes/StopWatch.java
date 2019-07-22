import java.util.Scanner;
class StopWatch{

    long startWatch(){
        long startTime;
        startTime = System.currentTimeMillis(); 
        System.out.println("start time"+startTime);
        //startTime = startTime/1000;
        return startTime;
    }

    long endWatch(){
        long endTime;
        endTime = System.currentTimeMillis(); 
        System.out.println("start time"+endTime);
        //endTime = endTime/1000;
        return endTime;
    }
    public static void main(String[] args) {
        char start;
        char stop;
        double startT;
        double stopT;
        StopWatch StopWatchObj=new StopWatch();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("If you want to start Stopwatch then Please press Y: ");
            start = sc.next().charAt(0);
            
        }while(start!='Y');
        
        startT = StopWatchObj.startWatch();

        do{
            System.out.println("If you want to stop Stopwatch then Please press Y: ");
            stopT = sc.next().charAt(0);
            
        }while(stopT!='Y');
        stopT = StopWatchObj.endWatch();
        startT = stopT-startT;
        System.out.println("Time Elepsed :"+startT/1000+" Second" );
        sc.close();
    }
}