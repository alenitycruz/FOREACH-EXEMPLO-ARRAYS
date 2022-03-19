package soparateste;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0 ; i < mes.length ; i++){
            System.out.println("O mes de " + mes[i] + " tem " + tot[i]);
        }

        for (String m : mes) {
            System.out.println(m);
        }

        double vetor[] = new double[6];
        Arrays.fill(vetor, 3.0);
        for (double v: vetor) {
            System.out.print(v);
        }
    }
}
