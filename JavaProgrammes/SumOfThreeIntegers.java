import java.util.Scanner;

class SumOfThreeIntegers{
    static int firstLoopCounter,secondLoopCounter,thirdLoopCounter;
    static int arrayOfInteger[];
    static int length=0;
    static Scanner sObj = new Scanner(System.in);
    public static void main(String arg[]){
        //  Scanner sObj = new Scanner(System.in);

         System.out.println("Enter the lenght of the array:");
         length=sObj.nextInt();
         arrayOfInteger = new int[length];
         System.out.println("Enter the elements into array:");
         getInput();
         System.out.println("Entered array elements are:");
         Display();
         getSumOfThreeIntergerZero();

    }

    static void getInput(){
        for(firstLoopCounter=0;firstLoopCounter<length;firstLoopCounter++){
            arrayOfInteger[firstLoopCounter] = sObj.nextInt();
        }
    }
    static void Display(){
        for(firstLoopCounter=0;firstLoopCounter<length;firstLoopCounter++){
            System.out.println(arrayOfInteger[firstLoopCounter]);
        }
    }
    static void getSumOfThreeIntergerZero(){
        for(firstLoopCounter=0;firstLoopCounter<length;firstLoopCounter++){
            for(secondLoopCounter=1;secondLoopCounter<length-1;secondLoopCounter++){
                for(thirdLoopCounter=2;thirdLoopCounter<length-2;thirdLoopCounter++){
                    if(arrayOfInteger[firstLoopCounter]+arrayOfInteger[secondLoopCounter]+arrayOfInteger[thirdLoopCounter]==0){
                        
                        displayThreeIntegers(arrayOfInteger[firstLoopCounter],arrayOfInteger[secondLoopCounter],arrayOfInteger[thirdLoopCounter]);
                    }
                }
            }
        }
    }
    static void displayThreeIntegers(int firstLoopCounter1,int secondLoopCounter2,int thirdLoopCounter3){
        System.out.print("[");
        System.out.print(firstLoopCounter1+"\t");
        System.out.print(secondLoopCounter2+"\t");
        System.out.print(thirdLoopCounter3);
        System.out.print("]");
    }
}