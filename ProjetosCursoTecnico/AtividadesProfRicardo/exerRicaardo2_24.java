package att224;
import javax.swing.JOptionPane;

public class Atividade224 {
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public Atividade224() {
		num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
	}
	
	public int Resto() {
		return num % 2;
    }
    
    public static void main(String[] args) {
		Atividade224 objA = new Atividade224();
		if (objA.Resto()!=0) {
			JOptionPane.showMessageDialog(null, "O número "+objA.getNum()+" é ímpar");
		}
		else {
			JOptionPane.showMessageDialog(null, "O número "+objA.getNum()+" é par");
		}

	}

}
