public class Colaboracao {
    public static void main(String[] args) {
        Recompensa experiencia = new Recompensa("Poção", 20);
        Missao missao = new Missao("Resgatar aldeão", experiencia);
        Personagem personagem = new Personagem("Ada", 50);

        Recompensa obtida = missao.concluir();
        personagem.receber(obtida);

        System.out.printf("%s concluiu '%s'.%n", personagem.getNome(), missao.getTitulo());
        System.out.printf("Recompensa: %s%n", obtida);
        System.out.printf("Energia final: %d%n", personagem.getEnergia());
    }
}
