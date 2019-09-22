/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YUDISTIRA
 */
public class ObjekGUI {

    import javax.swing.

    *;
    
    class ObjekGUI 

    [
    public static void main(string[] args) {
        GUI g = new GUI();
    }
    
    class GUI extends JFrame{
        final JTextfield fnama = new JTextField(10);
        JLable inama = new JLable("Nama Lengkap");
        JLable ijeniskelamin = new JLable("Jenis Kelamin");
        
        JRadioButton rbPria = new JRadioButton ("Laki-Laki");
        JRadioButton rbwanita = new JRadioButton ("Wanita");
        
        JLable lagama = newJLable("Agama");
        String [] namaAgama = {
            "Islam","Kristen","Katholik","Hindu","Budha"
        };
        JComboBox cmbAgama = new JComboBox(namaAgama);
        
        JLable lhobby = newJLable ("Hobby");
        
        JCheckBox cbSepakbola = new JCheckBox ("Sepakbola");
        JCheckBox cbbasket = new JCheckBox ("Basket");
        
        JButton btnSave = new JButton ("ok");
        
        Public GUI() {
            setTitle ("mencoba Kombinasi");
            setDefautCloseOperation(3);
            SetSize (350,200);
            
            ButtonGroup group = new ButtonGroup();
            group.add(rbPria);
            group.add(rbWanita);
            
            SetLayout (null);
            add (lnama);
            add (fnama);
            add (ljenskelamin);
            add (rbpria);
            add (rbwanita);
            add (lagama);
            add (cmbagama);
            add (lhobby);
            add (cbSepakbola);
            add (cbBasket);
            add (btnSave);
            
            lnama.setBounds (10,10,120,20);
            fnama.setBounds (130,10,150,20);
            ljeniskelamin.setBounds (10,35,120,20);
            rbpria.setBounds (130,35,100,20);
            rbwanita.setBounds (230,35,100,20);
            lagama.setBounds (10,60,150,20);
            cmbAgama.setBounds (130,6,150,20);
            lhobby.setBounds (10,85,120,20);
            cbSepakbola.setBounds (130,85,100,20);
            cbbasket.setBounds (230,85,150,20);
            btnSave.setBounds (100,130,120,20);
            setVisible(true);
        }
               
    }

]
}
