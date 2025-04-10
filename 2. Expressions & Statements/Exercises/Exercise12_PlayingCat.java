/*
* write a small program that can determine whether the cat is engaged in playtime, based on the temperature.
*
*Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false

1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.



EXAMPLES OF INPUT/OUTPUT:

isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45

isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)

isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
* */




public class Exercise12_PlayingCat {
        // write code here
        public static boolean isCatPlaying(boolean summer, int temperature) {
            int max = summer ? 45 : 35;
            return temperature >= 25 && temperature <= max;
        }
}
