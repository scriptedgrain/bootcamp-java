public class Main {
    public static void main(String[] args) {

        Bootcamp java = new Bootcamp("Java", "Formação Java Developer");
        Cursos javaBasico = new Cursos("Java Básico", "Sintaxe", 10);
        java.inserirConteudos(javaBasico);
        Dev dev1 = new Dev("Lucca");
        dev1.inscreverBootcamp(java);
        dev1.progredir();
        System.out.println(java);
        dev1.exibirConteudosConcluidos();
        System.out.println(dev1.calcularTotalXp());
        
    }
}
