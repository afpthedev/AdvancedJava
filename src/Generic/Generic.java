package Generic;


public class Generic {
    public static void main(String[] args) {

        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getNesne());

        // instance of String type
        Test<String> sObj
                = new Test<String>("Ahmet Faruk PALA ");
        System.out.println(sObj.getNesne());


    }
}
