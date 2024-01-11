import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++){
            if(i%a !=0){
                System.out.print(i +" ");
            }else if(i%a == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
