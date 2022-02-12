package att515;
import javax.swing.JOptionPane;
public class Programa2_23
{
public static void main(String[] args)
{
    int maior =0;
    int menor=9999;
    int num=0;
    JOptionPane.showMessageDialog(null,"Programa 2.23");
    for(int i=1; i<=6:i++)
    {
        num=integer.parseInt(JOptionPane.showInputDialog("Informeonumero "+i));
        if(num>maior)
        {
            maior=num;
        }
        if(num<menor)
        {
            menor=num;
        }
    }
    JOptionPane.showMessageDialog(null,"O maior numero é "+maior);
    JOptionPane.showMessageDialog(null,"O menor numero é "+menor);

}
}
