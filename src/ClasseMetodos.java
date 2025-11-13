import javax.swing.*;
import java.io.*;
import java.util.*;
public class ClasseMetodos {
    String fileName = "Estatistica.txt";
    Random random = new Random();
    public Estatistica[] FCadastrarEstatistica (Estatistica[] estatistica) throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        for(int i=0; i<10;i++){
            estatistica[i].codCidade = random.nextInt(300)+1;
            estatistica[i].nomeCidade = JOptionPane.showInputDialog("Nome da cidade: ");
            estatistica[i].qntAcidentes = random.nextInt(1000)+1;
            gravar.write("Código da cidade: " + estatistica[i].codCidade + "\nNome da Cidade: " + estatistica[i].nomeCidade + "\nQntd de acidentes: " + estatistica[i].qntAcidentes + "\n");
            gravar.newLine();
        }
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        gravar.close();
        return estatistica;
    }
    public void pQntAcidentes(Estatistica[] estatistica)throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName, true));
        gravar.newLine();
        gravar.write("Cidades com qntd de acidentes entre 100 e 500.\n");
        for(int i=0; i<10; i++){
            if(estatistica[i].qntAcidentes > 100 && estatistica[i].qntAcidentes < 500){
                JOptionPane.showMessageDialog(null, "Cidades com qntd de acidentes entre 100 e 500.\n" + "Cidade: " + estatistica[i].nomeCidade + "\nQntd de acidentes: " + estatistica[i].qntAcidentes + "\nCódigo da cidade: " + estatistica[i].codCidade + "\n");
                gravar.write("Cidade: " + estatistica[i].nomeCidade + "\nQntd de acidentes: " + estatistica[i].qntAcidentes + "\nCódigo da cidade: " + estatistica[i].codCidade + "\n");
                gravar.newLine();
            }
        }
        gravar.close();
    }
    public void pMaiorMenor(Estatistica[] estatistica)throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName, true));
        int maior = estatistica[0].qntAcidentes;
        int menor = estatistica[0].qntAcidentes;
        String Cmaior = estatistica[0].nomeCidade;
        String Cmenor = estatistica[0].nomeCidade;
        for(int i=0; i<10;i++){
            if(estatistica[i].qntAcidentes>maior){
                maior = estatistica[i].qntAcidentes;
                Cmaior = estatistica[i].nomeCidade;
            }
        }
        for(int i=0; i<10;i++){
            if(estatistica[i].qntAcidentes<menor){
                menor = estatistica[i].qntAcidentes;
                Cmenor = estatistica[i].nomeCidade;
            }
        }
        JOptionPane.showMessageDialog(null, "\nCidade com maior n° de acidentes: " + Cmaior + " = " + maior + "\nCidade com menor n° de acidentes: " + Cmenor + " = " + menor + "\n");
        gravar.write("Cidade com maior n° de acidentes: " + Cmaior + " = " + maior + "\nCidade com menor n° de acidentes: " + Cmenor + " = " + menor + "\n");
        gravar.newLine();
        gravar.close();
    }
    public void pAcima(Estatistica[] estatistica)throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName, true));
        double media = 0.0;
        double soma  = 0.0;
        for(int i=0;i<10;i++){
            soma += estatistica[i].qntAcidentes;
        }
        media = soma/10;
        for(int i=0;i<10;i++){
            gravar.write("Cidades com qntd de acidentes acima da média: \n" + "Média de acidentes: " + media);
            if(estatistica[i].qntAcidentes>media){
                JOptionPane.showMessageDialog(null, "Cidades com qntd de acidentes acima da média: \n" + "Média de acidentes: " + media + "\nCidade: " + estatistica[i].nomeCidade + "\nQuantidade de acidentes: " + estatistica[i].qntAcidentes + "\n");
                gravar.newLine();
                gravar.write("\nCidade: " + estatistica[i].nomeCidade + "\nQuantidade de acidentes: " + estatistica[i].qntAcidentes + "\n");
                gravar.newLine();
            }
        }
        gravar.close();
    }
}
