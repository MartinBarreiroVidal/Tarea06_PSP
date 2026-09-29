public class Main {
    public static void main (String[] args) {
        ProfesoresThread p1 = new ProfesoresThread("Diego", 4);
        ProfesoresThread p2 = new ProfesoresThread("Damian" , 3);

        Thread p3 = new Thread(new ProfesoresRunnable(5) , "Araujo");
        Thread p4 = new Thread(new ProfesoresRunnable(5), "Manuel");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
