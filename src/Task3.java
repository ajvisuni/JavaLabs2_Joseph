public class Task3 {
    public static void main(String[] args){
        int amountofbricksjoseph = 67;
        int containercapacityjoseph = 8;

        System.out.println("There is " + amountofbricksjoseph + " total Lego bricks.");
        System.out.println("Each container can hold exactly " + containercapacityjoseph + " bricks");

        int fullcontainersjoseph = amountofbricksjoseph / containercapacityjoseph;
        System.out.println("The total number of bricks in a Container are : " + fullcontainersjoseph);

        int partialyfilledcontainersjoseph = amountofbricksjoseph % containercapacityjoseph;//that is a long variable ;)
        System.out.println("Number of bricks in the partialy filled contaniners: " + partialyfilledcontainersjoseph);


        int totalcontainersjoseph = fullcontainersjoseph;
        if(partialyfilledcontainersjoseph > 0){
            totalcontainersjoseph = totalcontainersjoseph + 1;
        }
        System.out.println("Total number of containers used overall: " + totalcontainersjoseph);
    }
}
