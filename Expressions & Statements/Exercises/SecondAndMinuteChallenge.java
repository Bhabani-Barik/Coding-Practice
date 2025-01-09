public class SecondAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); //This is the first test case
        System.out.println(getDurationString(-65, 45)); //This is the second test case.
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        //Two-step approach  to get hours
        /*int minutes = seconds / 60;
        int hours  = minutes / 60;
        System.out.println("Hours:: " + hours);*/

        /*One-step approach to get hours*/
        /*int hours1 = seconds / 3600;
        System.out.println("Hours1:: " + hours1);*/

        /*int remainingMinutes = minutes % 60;
        System.out.println("Minutes:: " + minutes);
        System.out.println("Remaining Minutes:: " + remainingMinutes);*/

        /*int remainingSeconds = seconds % 60;
        System.out.println("Remaining Seconds:: " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";*/

        if(seconds < 0) {
            return "Invalid data for seconds(" + seconds +"), must be a positive integer value";
        } else {
            int minutes = seconds / 60;
//            return getDurationString(minutes, seconds);
            return getDurationString(seconds/60, seconds % 60);
        }

    }

    public static String getDurationString(int minutes, int seconds) {
//        int minutes = seconds / 60;
        if(minutes < 0) {
            return "Invalid data for seconds(" + minutes +"), must be a positive integer value";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }
        int hours  = minutes / 60;
        System.out.println("Hours:: " + hours);

        int remainingMinutes = minutes % 60;
        System.out.println("Minutes:: " + minutes);
        System.out.println("Remaining Minutes:: " + remainingMinutes);

        int remainingSeconds = seconds % 60;
        System.out.println("Remaining Seconds:: " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }

}
