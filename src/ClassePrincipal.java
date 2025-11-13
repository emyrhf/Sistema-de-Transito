/**
 *
 * @Emly Rharysa
 */
import java.io.*;
import javax.swing.*;
public class ClassePrincipal {
    public static void main(String[] args)throws IOException{
        //instância de classes
        ClasseMetodos m = new ClasseMetodos();
        Estatistica[] estatistica = new Estatistica[10];
        for (int i=0; i<10; i++){
            estatistica[i] = new Estatistica();
        }
        
        //menu principal
        int opc = 0;
        while(opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("---------------------------------------------------------------\n" + "|	MENU ESTATÍSTICA\n" + "| Estatísticas de acidentes em 2020\n" + "| 1 - Cadastro Estatística\n" + "| 2 - Consulta por quantidade de acidentes\n" + "| 3 - Consulta por estatísticas de acidentes\n" + "| 4 - Acidentes acima da média das 10 cidades\n" + "| 9 - Finaliza\n" + "----------------------------------------------------------------"));
            switch(opc){
                case 1:
                    estatistica = m.FCadastrarEstatistica(estatistica);
                    break;
                case 2:
                    m.pQntAcidentes(estatistica);
                    break;
                case 3:
                    m.pMaiorMenor(estatistica);
                    break;
                case 4:
                    m.pAcima(estatistica);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM.");
                    System.out.print("Arquivo gerado com sucesso!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}