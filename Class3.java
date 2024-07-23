package Switch;

public class Class3 {
    public static void main(String agr[]){
        String car="nissan";
        switch (car){
            case "BMW":
                    System.out.println("my car is BMW");
                    break;
            case "nissan":
                  System.out.println("my car is nissan");
                  break;
            case "Ford":
                  System.out.println("my car is ford");
                  break;
            case "KIA":
                  System.out.println("my car is KIA");
                  break;
            default:
                System.out.println("this car company belong to another branch ");
        }
    }
}
