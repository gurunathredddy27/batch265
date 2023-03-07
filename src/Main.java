 public class Main{
    public static void main(String[] args){
        int a = 4;
        int b = 3;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("addtion of numbers "+ add);
        System.out.println("subtration of numbers "+sub);
        System.out.println("multiply of numbers "+mul);
        System.out.println("divsion of numbers "+div);
        System.out.println("the whole new world");
        System.out.println("namaste world!");

        System.out.println("!!Namaste!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one number");
        int a = sc.nextInt();
        System.out.println("choose another number");
        int b = sc.nextInt();

        System.out.println("enter your choice: \n 1)Add \n 2)Sub \n 3)Mul \n 4)Div \n 5)Remainder ");
        int choice = sc.nextInt();

        if(choice == 1){
            int add = a + b;
            System.out.println("the addition of two numbers "+ add);
        } else if(choice == 2){
            int sub = a - b;
            System.out.println("the subtraction of two numbers "+ sub);
        } else if (choice == 3) {
            int mul = a * b;
            System.out.println("the multiplicaiton of two numbers " + mul);
        } else if (choice == 4){
            int div = a / b;
            System.out.println("the division of two numbers "+ div);
        } else if (choice == 5) {
            int mod = a % b;
            System.out.println("The remainder is  "+mod);
        }

        else{
            System.out.println("it is invalid option");
        }

    }
}

    }
 }
