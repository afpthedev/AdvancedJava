package Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int a = 2 ;
        int b = 0;

        int c;

        try{
            System.out.println(a+b);
            c= a/b;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Sorun var aritmetikte");
        }
    }

}
