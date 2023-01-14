public class whileloop6 {
    public static void main(String[] args) {
        //1 2 3 4 6 7 8 9 11 12 13 14 16
        int num = 1;
        while (num<=16){
            if(num%5!=0){
                System.out.println(num);
            }
            num++;
        }
    }
}
