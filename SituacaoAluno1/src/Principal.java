
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            SituacaoAluno1 sit  = new SituacaoAluno1();
            double media = 0;
       
       
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("@*****Situação Aluno*****@ " 
                 + "\n 1 - Inserir dados \n 2 - Calcular Média \n 3 - Listar dados \n 4 - Aprovado/Reprovado \n 0 - Sair"));
            
            switch(op){
                case 1:
                    sit.inserirDados();
                    break;
                case 2:
                    sit.calcularMedia();
                    break;
                case 3:
                   sit.listarSituacao();
                   break;
                case 4: 
                    sit.calcularMedia();
                    if (media < 7){
                    JOptionPane.showMessageDialog(null,"O aluno está reprovado: ");
                    }if(media >= 7){
                    JOptionPane.showMessageDialog(null,"O aluno está de exame: ");
                    }if(media >= 8){
                    JOptionPane.showMessageDialog(null,"O aluno está de exame: ");
                    }if(media > 9){
                    JOptionPane.showMessageDialog(null,"O aluno está de exame: ");
                    }else{
                    JOptionPane.showMessageDialog(null,"O aluno está aprovado: ");
                    }
                    break;               
               
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o Programa");
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente outra vez");
            }
            
        }while(op != 0);
    }

    private static double getMedia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

