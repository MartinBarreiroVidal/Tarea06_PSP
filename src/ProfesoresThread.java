public class ProfesoresThread extends Thread {
    private int limitePaciencia;

    public ProfesoresThread(String nome, int limitePaciencia) {
        super(nome);
        this.limitePaciencia = limitePaciencia;
    }
    @Override
    public void run() {
        for (int cabreo = 1; cabreo <= limitePaciencia; cabreo++){
        System.out.println("[" + getName() + "]" + " Cabreo nivel: " + cabreo);
            if (cabreo == limitePaciencia) {
                System.out.println("[" + getName() + "]"  + "... ¡He llegado a mi límite!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
