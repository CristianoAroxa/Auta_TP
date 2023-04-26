
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
public class SituacaoAluno1 {
    private String nome;
    private double prova1;
    private double prova2;
    private double media;
        
    public SituacaoAluno1(){
        this("",0.0,0.0,0.0);
    }

    public SituacaoAluno1(String nome, double prova1, double prova2, double media) {
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.media = media;
    }

    public SituacaoAluno1(String nome, double prova1, double prova2) {
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void inserirDados(){
        this.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
        this.setProva1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 1: ")));
        this.setProva2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 2: ")));
        
    }
    
    public void calcularMedia(){
        this.setMedia((getProva1()+ getProva2())/2);
         
    }
    
    public void listarSituacao(){
         JOptionPane.showMessageDialog(null,"O aluno: "+getNome()+ "\n tirou na primeira prova: " +getProva1()+ "\n na segunda: "+getProva2()+ "\n e ficou média" +getMedia());
        
             
         
    }
}
