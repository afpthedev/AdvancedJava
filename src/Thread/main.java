package Thread;
// Not : Java sadce bir sınıfı extedn olarak kabul eder.
public class main {
    public static void main(String[] args) {
        Calc calc1 = new Calc("Calc1");
        calc1.run();


        System.out.println();
        Calc calc2 =  new Calc("Calc2");
        calc2.run();



        // Farklı bir kullanım için


        Thread t1 = new Thread(calc1);
        Thread t2 = new Thread(calc2);
    // Eğer multi thread için kullanmak istiyorsak Strat metodunu kullanmalıyız çünkü
        t1.start();
        t2.start();


    }


}
