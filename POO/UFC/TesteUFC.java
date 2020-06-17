package UFC;
public class TesteUFC {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[8]; 
                
        l[0] = new Lutador("Wellington", "Brasil", 20, 1.73f, 62, 10, 8, 2);
        l[1] = new Lutador("Gleice", "Brasil", 20, 1.58f, 49, 10, 5, 0);
        l[2] = new Lutador("Zé de Julo", "Brasil", 45, 1.70f, 70, 15, 8, 1);
        l[3] = new Lutador("Cristina", "Brasil", 46, 1.48f, 58, 4, 6, 4);
        l[4] = new Lutador("Lucival", "Brasil", 45, 1.70f, 75, 20, 10, 5);
        l[5] = new Lutador("Sônia", "Brasil", 37, 1.60f, 75, 5, 5, 5);
        l[6] = new Lutador("Liedson", "Brasil", 13, 1.65f, 52, 2, 1, 0);
        l[7] = new Lutador("Luiz", "Brasil", 7, 1.35f, 25, 1, 1, 0);
        
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[1], l[6]);
        UFC01.fight();
    }
}
