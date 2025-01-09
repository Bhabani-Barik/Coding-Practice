public class switchStatement {
    public static String getQuarter(String month) {
        //Enhanced switch statement
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month  + " is bad";
                yield  badResponse;
            }
        };
    }

    public static void main(String[] args) {
        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
}
