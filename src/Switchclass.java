public class Switchclass {
    public static void main(String[] args) {
        String country="USA";
        switch (country.toLowerCase()){//convert the text to lower case:usa
            case "usa":
                System.out.println("burgers");
                break;
            case"Italy":
                System.out.println("pasta");
                break;
            case"afghanistan":
                System.out.println("manto");
                break;
            default:
                System.out.println("wrong country");
        }
    }
}
