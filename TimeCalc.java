public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minToAdd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        int totalMinutes = (hours *60) + minutes + minToAdd;
        int totalHours =  totalMinutes / 60;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes - (totalHours*60);
        String timeFinal = "0";
        
        if (newHours < 10) {
            timeFinal = timeFinal + newHours;
        }
        else {
            timeFinal = "" + newHours;
        }

        if (newMinutes < 10) {
            timeFinal = timeFinal + ":0" + newMinutes;
        }
        else {
            timeFinal = timeFinal + ":" + newMinutes;
        }
        
        System.out.println(timeFinal);




        

    }
}
