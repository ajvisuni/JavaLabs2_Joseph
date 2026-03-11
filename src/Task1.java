public class Task1 {
    public static void main(String[] args){
        float earthweightjoseph;
        float marsgravityjoseph;
        double marsweightdoublejoseph;
        int marsweightintjoseph;
        char marsweightcharjoseph;
        int finalmathresultjoseph;
        //as instructed all the variables are the top of the class

        earthweightjoseph = 90.0f;
        marsgravityjoseph = 0.38f;//ratio of the diff btw earths gravity and Mars that is to be multiplied to the earths cosntant


        System.out.println("My weight on earth in KGs :" + earthweightjoseph + "  Mars's gravitational Difference Ratio to mutiply with my weight " + marsgravityjoseph);

        marsweightdoublejoseph=earthweightjoseph * marsgravityjoseph;
        System.out.printf("My Calculated Weight on Mars : %.4f\n", marsweightdoublejoseph);

        marsweightintjoseph=(int)marsweightdoublejoseph;
        System.out.println("The 'double' weight to int, Without Decimals: " + marsweightintjoseph);

        marsweightcharjoseph=(char)marsweightintjoseph;
        System.out.println("The projected 'int' weight to char :" + marsweightcharjoseph);

        finalmathresultjoseph = marsweightcharjoseph + 100;
        System.out.println("Added 100 to the final 'char' wight " + finalmathresultjoseph);


    }
}
