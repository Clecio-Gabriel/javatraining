import java.util.Objects;

public final class Recompensa {
    private final String descricao;
    private final int energia;

    public Recompensa(String descricao, int energia) {
        this.descricao = Objects.requireNonNull(descricao, "descrição obrigatória").trim();
        if (this.descricao.isEmpty()) {
            throw new IllegalArgumentException("descrição não pode ficar vazia");
        }
        if (energia < 0) {
            throw new IllegalArgumentException("energia não pode ser negativa");
        }
        this.energia = energia;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEnergia() {
        return energia;
    }

    @Override
    public String toString() {
        return "%s (+%d energia)".formatted(descricao, energia);
    }
}
