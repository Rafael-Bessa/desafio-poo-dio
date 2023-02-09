package poo.dio;

public class Cursos implements  Atividade{
    private static final double XP_PADRAO = 100d;

    private String nome;
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public Cursos(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria

                ;
    }
}
