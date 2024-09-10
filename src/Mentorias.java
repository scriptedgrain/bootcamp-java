import java.time.LocalDate;

public class Mentorias extends Conteudo {

    private LocalDate dataMentoria;

    public Mentorias(String titulo, String descricao) {
        super(titulo, descricao);
    }
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }   

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }
    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentorias [titulo=" + getTitulo() + ", descricaoCurso=" + getDescricao() + ", dataMentoria=" + dataMentoria
                + "";
    }

}
