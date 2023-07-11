
package base;

public class Proprietario {
    private String nome;
    private String CPF;

    public Proprietario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}


public class Imovel {
    private Proprietario proprietario;
    private String local;

    public Imovel(Proprietario proprietario, String local) {
        this.proprietario = proprietario;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void exibe() {
        System.out.println("Proprietário: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCPF());
        System.out.println("Local: " + local);
    }
}


package imobiliaria;

import basee.*;


public class Apartamento extends Imovel {
    private int numQuartos;
    private double precoBase;

    public Apartamento(Proprietario proprietario, String local, int numQuartos, double precoBase) {
        super(proprietario, local);
        this.numQuartos = numQuartos;
        this.precoBase = precoBase;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void exibe() {
        super.exibe();
        System.out.println("Número de quartos: " + numQuartos);
    }

    public double calculaAluguel() {
        return 0.0;
    }
}


public class Basico extends Apartamento {
    private boolean porteiro24Horas;

    public Basico(Proprietario proprietario, String local, int numQuartos, double precoBase, boolean porteiro24Horas) {
        super(proprietario, local, numQuartos, precoBase);
        this.porteiro24Horas = porteiro24Horas;
    }

    public boolean isPorteiro24Horas() {
        return porteiro24Horas;
    }

    public void exibe() {
        super.exibe();
        System.out.println("Valor do aluguel: R$ " + calculaAluguel());
        System.out.println("Possui porteiro 24 horas: " + (porteiro24Horas ? "Sim" : "Não"));
    }

    public double calculaAluguel() {
        double aluguel = getPrecoBase();
        if (porteiro24Horas) {
            aluguel += 450.0;
        }
        return aluguel;
    }
}

public class Cobertura extends Apartamento {
    private double areaTerraco;

    public Cobertura(Proprietario proprietario, String local, int numQuartos, double precoBase, double areaTerraco) {
        super(proprietario, local, numQuartos, precoBase);
        this.areaTerraco = areaTerraco;
    }

    public double getAreaTerraco() {
        return areaTerraco;
    }

    public void exibe() {
        super.exibe();
        System.out.println("Valor do aluguel: R$ " + calculaAluguel());
        System.out.println("Área do terraço: " + areaTerraco);
    }

    public double calculaAluguel() {
        return getPrecoBase() + 1000.0 + (areaTerraco * 3.3);
    }
}

import java.util.Scanner;
import base.*;
import imobiliaria.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados do Proprietário:");
        System.out.print("Nome: ");
        String nomeProprietario = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfProprietario = scanner.nextLine();

        Proprietario proprietario = new Proprietario(nomeProprietario, cpfProprietario);

        System.out.println("\nDados do Apartamento Básico:");
        System.out.print("Local: ");
        String localBasico = scanner.nextLine();
        System.out.print("Número de quartos: ");
        int numQuartosBasico = scanner.nextInt();
        System.out.print("Preço base: ");
        double precoBaseBasico = scanner.nextDouble();
        System.out.print("Possui porteiro 24 horas (true/false): ");
        boolean porteiro24HorasBasico = scanner.nextBoolean();

        public Basico apartamentoBasico = new Basico(proprietario, localBasico, numQuartosBasico, precoBaseBasico, porteiro24HorasBasico);

        System.out.println("\nDados do Apartamento de Cobertura:");
        System.out.print("Local: ");
        scanner.nextLine(); 
        String localCobertura = scanner.nextLine();
        System.out.print("Número de quartos: ");
        int numQuartosCobertura = scanner.nextInt();
        System.out.print("Preço base: ");
        double precoBaseCobertura = scanner.nextDouble();
        System.out.print("Área do terraço: ");
        double areaTerracoCobertura = scanner.nextDouble();

        Cobertura apartamentoCobertura = new Cobertura(proprietario, localCobertura, numQuartosCobertura, precoBaseCobertura, areaTerracoCobertura);

        System.out.println("\nApartamento Básico:");
        apartamentoBasico.exibe();
        System.out.println("\nApartamento de Cobertura:");
        apartamentoCobertura.exibe();
    }
}
