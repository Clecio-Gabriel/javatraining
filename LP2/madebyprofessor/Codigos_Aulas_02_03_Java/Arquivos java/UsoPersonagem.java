public class UsoPersonagem {
    public static void main(String[] args) {
        Personagem ada = new Personagem("Ada", 50);
        Recompensa pocao = new Recompensa("Poção", 20);

        ada.receber(pocao);
        ada.descansar();

        System.out.println(ada);
        System.out.printf("Energia consultada: %d%n", ada.getEnergia());
        System.out.printf("Personagens criados: %d%n", Personagem.getTotalCriados());
    }
}
