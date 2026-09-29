class ProfesoresRunnable implements Runnable {
    private int limitePaciencia;

    public ProfesoresRunnable(int limitePaciencia) {
        this.limitePaciencia = limitePaciencia;
    }

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        for (int cabreo = 1; cabreo <= limitePaciencia; cabreo++){
            System.out.println("[" + nome + "]" + " Cabreo nivel: " + cabreo);
            if (cabreo == limitePaciencia) {
                System.out.println("[" + nome + "]" + "... ¡He llegado a mi límite!");
            }
    } try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
