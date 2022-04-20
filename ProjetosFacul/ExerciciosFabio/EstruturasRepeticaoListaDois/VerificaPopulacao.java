/*
Dado um paıs A, com 5000000 de habitantes e uma taxa de natalidade de 3% ao ano, e um paıs B com 7000000
de habitantes e uma taxa de natalidade de 2% ao ano, calcule e imprima o tempo necessario para
que a populacao do paıs A ultrapasse a popula¸cao do paıs B.
*/
public class VerificaPopulacao {
    public static void main(String[] args) {
        
        int habitantesA=5000000, habitantesB =7000000, anos=0;
        while(habitantesA<habitantesB)
        {
            habitantesA+=(habitantesA*0.02);
            habitantesB+=(habitantesB* 0.03);
            anos++;
        }
        System.out.println("Depois de "+anos+" anos a população de A supera a população de B");
        System.out.println("A possui "+habitantesA+" habitaantes e B possui "+habitantesB+" habitantes");
    }
}
