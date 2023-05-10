import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Datação por Carbono-14");
        // Entradas: a descrição do artefato, o tipo do artefato: 1, 2, 3, e o percentual de carbono-14

        Scanner scanner = new Scanner(System.in);

        // Descrição do Artefato
        System.out.print("Entre com a descrição do artefato: ");
        String artefato = scanner.nextLine();
        System.out.println("");

        // O tipo do Artefato
        System.out.print("Entre com o tipo do artefato: ");
        int tipo = scanner.nextInt();
        System.out.println("");

        // O percentual de Carbono
        System.out.print("Entre com o percentual (%) de Carbono-14: ");
        Double percentual = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        analise_artefato(artefato, tipo, percentual);
    }

        // Processamento
        // Calcular o Periodo aproximado do Artefato
        static private void analise_artefato(String descricao, int tipo, Double percentual) {
            System.out.println(descricao);
            System.out.println(Tipo_artefato(tipo));
            String periodo = Periodo_artefato(percentual);
            System.out.println(periodo);
            System.out.println(Nome_pesquisador(tipo, periodo));

        }

        static private String Periodo_artefato(Double percentual) {
            String periodo = "";
            
            if (percentual == 100) {
                periodo = "Idade Moderna";
            }
            else if (percentual < 100 && percentual > 49) {
                periodo = "Idade Média";
            }
            else if (percentual < 50 && percentual > 25) {
                periodo = "Idade do Bronze";
            }
            else if (percentual < 26 && percentual > 9) {
                periodo = "Idade do Ferro";
            }
            else if (percentual < 10 && percentual > 1) {
                periodo = "Pré-História";
            }
            else {
                periodo = "Inválido";
            }
            
            return periodo;

        }
        
        static private String Tipo_artefato(int tipo) {
            String tipo_descricao = "";
            
            if (tipo == 1) {
                tipo_descricao = "Arma ou Tecnologia similiar de metal";
            }
            else if (tipo == 2) {
                tipo_descricao = "Ferramentas ou utensílios domésticos";
            }
            else if (tipo == 3) {
                tipo_descricao = "Artefato Desconhecido (Isu)";
            }
            else {
                tipo_descricao = "Inválido";
            }
            
            return tipo_descricao;
        }

        static private String Nome_pesquisador(int tipo, String periodo) {
            String pesquisador = "";
            
            if (tipo == 1 && periodo == "Idade Moderna") {
                pesquisador = "Doutora Kassandra";
            }
            else if (tipo == 1 && periodo == "Idade Média") {
                pesquisador = "Doutor Kenway";
            }
            else if (tipo == 1 && periodo == "Idade do Bronze") {
                pesquisador = "Doutor Alexios";
            }
            else if (tipo == 1 && periodo == "Idade do Ferro") {
                pesquisador = "Doutor Alexios";
            }
            else if (tipo == 1 && periodo == "Pré-História") {
                pesquisador = "Doutor Arno";
            }
            else if (tipo == 2 && periodo == "Idade Moderna") {
                pesquisador = "Doutor Edward";
            }
            else if (tipo == 2 && periodo == "Idade Média") {
                pesquisador = "Doutor Ezio";
            }
            else if (tipo == 2 && periodo == "Idade do Bronze") {
                pesquisador = "Doutor Altair";
            }
            else if (tipo == 2 && periodo == "Idade do Ferro") {
                pesquisador = "Doutora Eivor";
            }
            else if (tipo == 2 && periodo == "Pré-História") {
                pesquisador = "Doutora Elise";
            }
            else if (tipo == 3 && periodo == "Idade Moderna") {
                pesquisador = "Doutor Cesare Borgia";
            }
            else if (tipo == 3 && periodo == "Idade Média") {
                pesquisador = "Doutor Rodrigo";
            }
            else if (tipo == 3 && periodo == "Idade do Bronze") {
                pesquisador = "Doutor Cormac";
            }
            else if (tipo == 3 && periodo == "Idade do Ferro") {
                pesquisador = "Doutor Berg";
            }
            else if (tipo == 3 && periodo == "Pré-História") {
                pesquisador = "Doutora Braddock";
            }
            else {
                pesquisador = "Inválido";
            }
            
            return pesquisador;

        }
    }
