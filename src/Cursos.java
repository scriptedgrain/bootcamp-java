public class Cursos extends Conteudo {

    private int cargaHoraria;

    public Cursos(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   
    @Override
    public String toString() {
        return "Cursos [tituloCurso=" + getTitulo() + ", descricaoCurso=" + getDescricao() + ", cargaHoraria="
                + cargaHoraria + "";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
