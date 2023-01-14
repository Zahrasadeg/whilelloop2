public class logicalor {
    public static void main(String[] args) {
        String day = "sunday";

        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("friday")) {
            System.out.println("no class today");
        } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
            System.out.println("we have java class");
        }
        else if(day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("tuesday")) {
            System.out.println("manual testing class");
        }
        else if(day.equalsIgnoreCase("tuesday")) {
            System.out.println("review class");
        }
        else {
            System.out.println("wrong day");
        }
    }

    }

