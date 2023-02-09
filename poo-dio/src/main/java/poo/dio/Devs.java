package poo.dio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Devs {

    private String nome;
    private String email;
    private Set<Cursos> cursosInscritos = new LinkedHashSet<>();
    private Set<Cursos> cursosConcluidos = new LinkedHashSet<>();

    public Devs(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.cursosInscritos.addAll(bootcamp.getCursos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Cursos> curso = this.cursosInscritos.stream().findFirst();
        if(curso.isPresent()) {
            this.cursosConcluidos.add(curso.get());
            this.cursosInscritos.remove(curso.get());
        } else {
            System.err.println("Você não está matriculado em nenhum curso!");
        }
    }

    public double calcularTotalXp() {
        double soma = 0;
        for (Cursos cursos : cursosConcluidos) {
            soma += cursos.calcularXp();
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Cursos> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(Set<Cursos> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Cursos> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Cursos> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }
}
