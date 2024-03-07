
public class Fibonacci {
	public boolean verificar(int N) {
        int ant = 0;
        int at = 1;

        while (at < N) {
            int prox = ant + at;
            ant  = at;
            at = prox;

            if (at == N) {
                return true;
            }
        }

        return false;
    }
}

