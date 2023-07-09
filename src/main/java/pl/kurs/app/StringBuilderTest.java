package pl.kurs.app;

public class StringBuilderTest {
    public static void main(String[] args) {

        long start1 = System.nanoTime();

        StringBuilder sb = new StringBuilder("0");
        for (int i = 1; i < 1000; i++) {
            sb.append(" ");
            sb.append(i);
        }
        String w1 = sb.toString();
        long stop1 = System.nanoTime();
        long t1 = stop1 - start1;
        System.out.println(w1);


        System.out.println("------------------------------");

        long start2 = System.nanoTime();
        String w2 = "0";
        for (int i = 1; i < 1000; i++) {
            w2 = w2 + " " + i;
        }
        long stop2 = System.nanoTime();
        long t2 = stop2 - start2;
        System.out.println(w2);
        double timeRatio = ((double) t2) / t1;
        System.out.println("timeRatio = " + timeRatio);
    }

    //Dlaczego StringBuilder jest szybszy:
    //1. jest mutowalny to znaczy ze mozna go modyfikowac bez tworzenia nowych obiektow
    //2. Efektywnie zarządza pamięcią: zamiast tworzyć nowy obiekt rozszerza swoją pemięć wewnętrzną w ineligentny sposób.
    //3. Oferuje metody do efektywnej konkatenacji takiej jak append() ktore sa optymalizowane pod kątem wydajności.
}
