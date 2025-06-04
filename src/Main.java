public class Main {
    public static void main(String[] args) {
        int age = 20;

        boolean hasID = true;

        if(age >= 18 && hasID){
            System.out.println("You can enter.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if(isWeekend || isHoliday){
            System.out.println("You can take a break.");
        }

        boolean isRaining = true;

        if(!isRaining){
            System.out.println("Just get out.");
        }else{
            System.out.println("Bring your umbrella.");
        }
    }
}