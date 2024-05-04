package tv;

import java.util.Objects;

public abstract class Canal {
    public String genero;
    public String faixaEtaria;
    public String avaliacao;
    public String nome;

    public Canal() {
    }

    public Canal(Canal target) {
        if (target != null) {
            this.genero = target.genero;
            this.faixaEtaria = target.faixaEtaria;
            this.avaliacao = target.avaliacao;
            this.nome = target.nome;
        }
    }

    public abstract Canal clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Canal)) return false;
        Canal canal2 = (Canal) object2;
        return Objects.equals(canal2.genero, genero) &&
                Objects.equals(canal2.faixaEtaria, faixaEtaria) &&
                Objects.equals(canal2.avaliacao, avaliacao) &&
                Objects.equals(canal2.nome, nome);
    }
}
