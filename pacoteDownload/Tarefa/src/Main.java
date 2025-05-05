public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula POO");
        v[1] = new Video("Aula 12 C++");
        v[2] = new Video("Diagrama de classe");

        //Pessoa p = new Pessoa("Guilherme", 26, "M");
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Guilherme", 26, "M", "juba");
        g[1] = new Gafanhoto("Carlos", 22, "F", "chico");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87);
        System.out.println(vis[1].toString());

       // System.out.println(v[0].toString());
       // System.out.println(g[0].toString());
    }
}