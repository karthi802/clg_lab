import java.util.*;

class Wrappercls {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        Integer a_obj = Integer.valueOf(a);

        try {
            Integer b_obj = Integer.valueOf(b);
            System.out.println("Length : " + (a_obj.toString() + b_obj.toString()).length());
            System.out.println("Output : " + (a_obj.toString() + b_obj.toString()));

        } catch (NumberFormatException e) {
            Float b_obj = Float.valueOf(b);
            System.out.println("Length : " + (a_obj.toString() + b_obj.toString()).length());
            System.out.println("Output : " + (a_obj.toString() + b_obj.toString()));

        }
        sc.close();
    }
}