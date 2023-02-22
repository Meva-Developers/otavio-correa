package EditorVideos;

public class EditorVideosConstrutor {

    public static void main(String[] args) {
        EditorVideos ev = new EditorVideos();
        ev.setNome("Maria");
        ev.setCpf("111.222.333/44");
        ev.setSalario(4500.00);


        System.out.println(ev.getNome());
        System.out.println(ev.getCpf());
        System.out.println(ev.getSalario());
        System.out.println(ev.getBonificacao());
        System.out.println(ev.getBonificacao() + ev.getSalario());
    }

}
