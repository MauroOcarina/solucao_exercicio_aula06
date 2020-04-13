import javax.swing.JOptionPane;
public class TesteAtribuicao {
    public static void main (String [] args) {
        String nome = JOptionPane.showInputDialog("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));

        Professor professor = new Professor(nome, idade);

        nome = JOptionPane.showInputDialog("Nome");
        boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("Pratica?true/false"));

        Disciplina disciplina = new Disciplina(nome, pratica);

        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
        
    }
}