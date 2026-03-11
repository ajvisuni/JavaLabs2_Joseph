public class Task3 {
    public static void main(String[] args){
        int amountofbricks = 67;
        int containercapacity = 8;

        System.out.println("There is " + amountofbricks + " total Lego bricks.");
        System.out.println("Each container can hold exactly " + containercapacity + " bricks");

        int fullcontainers = amountofbricks / containercapacity;
        System.out.println("The total number of bricks in a Container are : " + fullcontainers);

        int partialyfilledcontainers = amountofbricks % containercapacity;//that is a long variable ;)
        System.out.println("Number of bricks in the partialy filled contaniners: " + partialyfilledcontainers);


        int totalcontainers = fullcontainers;
        if(partialyfilledcontainers > 0){
            totalcontainers = totalcontainers + 1;
        }
        System.out.println("Total number of containers used overall: " + totalcontainers);
    }
}
