package br.com.AcademiaSite.Enums;

public enum Planos {
    PlanoBasico("Básico"),
    PlanoIntermediario("Intermediário"),
    PlanoAvancado("Avançado");

    private final String descricao;

    private Planos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
