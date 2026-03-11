public class Task2 {
    public static void main(String[] args){
        int randomnumber = (int)(Math.random()*100) + 1;
        System.out.println("A random number between 1 to 100: " + randomnumber);
        if (randomnumber % 2 == 0 ) {
            System.out.println("The random number is " + randomnumber + " is EVEN because its modulo 2 equals 0");
        }else{
            System.out.println("The random number is " + randomnumber + " is ODD because its modulo 2 equals 1");
        }
    }
}
