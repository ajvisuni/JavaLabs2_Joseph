public class Task2 {
    public static void main(String[] args){
        int randomnumberjoseph = (int)(Math.random()*100) + 1;
        System.out.println("A random number between 1 to 100: " + randomnumberjoseph);
        if (randomnumberjoseph % 2 == 0 ) {
            System.out.println("The random number is " + randomnumberjoseph + " is EVEN because its modulo 2 equals 0");
        }else{
            System.out.println("The random number is " + randomnumberjoseph + " is ODD because its modulo 2 equals 1");
        }
    }
}
