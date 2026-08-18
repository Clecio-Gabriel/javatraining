import java.util.Objects;

public class Missao {
    private final String titulo;
    private final Recompensa recompensa;
    private boolean concluida;

    public Missao(String titulo) {
        this(titulo, new Recompensa("Experiência", 10));
    }

    public Missao(String titulo, Recompensa recompensa) {
        this.titulo = Objects.requireNonNull(titulo, "título obrigatório").trim();
        if (this.titulo.isEmpty()) {
            throw new IllegalArgumentException("título não pode ficar vazio");
        }
        this.recompensa = Objects.requireNonNull(recompensa, "recompensa obrigatória");
    }

    public Recompensa concluir() {
        if (concluida) {
            throw new IllegalStateException("a missão já foi concluída");
        }
        concluida = true;
        return recompensa;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
