import javax.swing.* ;import java.awt.* ;
import java.awt.event.* ;
public class butonLIstner {

	public static void main(String[] args) {
		Fen1Bouton b=new Fen1Bouton();
        b.setVisible(true);
	}

}
class Fen1Bouton extends JFrame 
{ public Fen1Bouton ()
{ setTitle ("Premier bouton") ;
setSize (300, 200) ;
monBouton1 =new JButton ("ESSAI") ;
monBouton2 =new JButton ("SIMO") ;


getContentPane().setLayout(new FlowLayout()) ;
getContentPane().add(monBouton1) ;
getContentPane().add(monBouton2) ;

f n=new f();
f1 k=new f1();
monBouton1.addActionListener(n);
monBouton2.addActionListener(k);

}
class f implements ActionListener{
public void actionPerformed (ActionEvent ev)
{ 
   System.out.println ("action sur bouton1") ;
   
}
}

class f1 implements ActionListener{
public void actionPerformed (ActionEvent ev)
{ 
   System.out.println ("action sur bouton2") ;
   
}
}
private JButton monBouton1 ;
private JButton monBouton2 ;
}