public class whileloop5 {
    public static void main(String[] args) {
        boolean flag=true;
        int s=0;
        while (flag){
            System.out.println("hi");
            if(s>3){
                flag=false;
            }
            s++;
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
        int x=0;
        while (x<10){
            if(x%2==0){
                System.out.println("even "+x);
            }
            x++;
        }
    }
}
