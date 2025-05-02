public class Main{
    public static void main(String[]args){

        context a1= new context(new subtract());
        context a2= new context(new add());
        context a3= new context(new division());
        System.out.println(a1.execute(1,2));
        System.out.println();

        a1 = new context(new add());
        System.out.println(a1.execute(1,2));
        System.out.println();

    }
}