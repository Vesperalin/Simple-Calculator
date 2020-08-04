//graficzna czesc projektu
package Grafika_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import Model_Biznesowy.*;

public class Widok_Kalkulator extends JFrame{
	static final long serialVersionUID=1;//zeby info sie nie pokazywalo w pasku  
	private static final String wartoscPoczatkowa="0"; 
	private JPanel panelCentralny;
	private JPanel panelPolnocny;
	private JTextField wynik;
	private JButton usuwanie = new JButton("C"); 
	private JButton zero = new JButton("0");
	private JButton jeden = new JButton("1");
	private JButton dwa = new JButton("2");
	private JButton trzy = new JButton("3");
	private JButton cztery = new JButton("4");
	private JButton piec = new JButton("5");
	private JButton szesc = new JButton("6");
	private JButton siedem = new JButton("7");
	private JButton osiem = new JButton("8");
	private JButton dziewiec = new JButton("9");
	private JButton kropka = new JButton(".");
	private JButton plus = new JButton("+");
	private JButton minus = new JButton("-");
	private JButton mnozenie = new JButton("*");
	private JButton dzielenie = new JButton("/");
	private JButton rownaSie = new JButton("=");
	private Model model;
	public Widok_Kalkulator(Model model) {
		//model
		this.setTitle("Kalkulator");
		this.model = model;
        this.model.setWynik(wartoscPoczatkowa);
        this.model.setLiczba(wartoscPoczatkowa);
		
		//panele
		panelCentralny = new JPanel();
		panelPolnocny = new JPanel();
		panelCentralny.setLayout(new FlowLayout());
		panelPolnocny.setLayout(new FlowLayout());
		this.getContentPane().add(BorderLayout.NORTH, panelPolnocny);
		this.getContentPane().add(BorderLayout.CENTER, panelCentralny);
		
		//przyciski 
		dziewiec.setPreferredSize(new Dimension(55,55));
		osiem.setPreferredSize(new Dimension(55,55));
		siedem.setPreferredSize(new Dimension(55,55));
		szesc.setPreferredSize(new Dimension(55,55));
		piec.setPreferredSize(new Dimension(55,55));
		cztery.setPreferredSize(new Dimension(55,55));
		trzy.setPreferredSize(new Dimension(55,55));
		dwa.setPreferredSize(new Dimension(55,55));
		jeden.setPreferredSize(new Dimension(55,55));
		zero.setPreferredSize(new Dimension(55,55));
		plus.setPreferredSize(new Dimension(55,55));
		minus.setPreferredSize(new Dimension(55,55));
		mnozenie.setPreferredSize(new Dimension(55,55));
		dzielenie.setPreferredSize(new Dimension(55,55));
		rownaSie.setPreferredSize(new Dimension(55,55));
		kropka.setPreferredSize(new Dimension(55,55));
		
		//panel polnocny
		wynik = new JTextField(16);
		wynik.setFont(new Font("System", Font.BOLD, 13));
		wynik.setText(this.model.getWynik());
		wynik.setHorizontalAlignment(JTextField.RIGHT);
		wynik.setEditable(false);
		panelPolnocny.add(usuwanie);
		panelPolnocny.add(wynik);
		
		//panel centralny
		panelCentralny.add(siedem);
		panelCentralny.add(osiem);
		panelCentralny.add(dziewiec);
		panelCentralny.add(plus);
		panelCentralny.add(cztery);
		panelCentralny.add(piec);
		panelCentralny.add(szesc);
		panelCentralny.add(minus);
		panelCentralny.add(jeden);
		panelCentralny.add(dwa);
		panelCentralny.add(trzy);
		panelCentralny.add(mnozenie);
		panelCentralny.add(zero);
		panelCentralny.add(kropka);
		panelCentralny.add(rownaSie);
		panelCentralny.add(dzielenie);

		//ustawienia ramki
		this.setSize(270, 330);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void reset() {
		wynik.setText(wartoscPoczatkowa);
	}
	public String getWynik() {
		return wynik.getText();
	}
	public void insertNumber(String s) {
		this.setWynik(this.getWynik()+s);
	}
	public void setWynik(String nWynik) {
		wynik.setText(nWynik);
	}
	public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
	public JButton getRownaSieJButton() {
		return rownaSie;
	}
	public JButton getPlusJButton() {
		return plus;
	}
	public JButton getMinusJButton() {
		return minus;
	}
	public JButton getMnozenieJButton() {
		return mnozenie;
	}
	public JButton getDzielenieJButton() {
		return dzielenie;
	}
	public void addZeroListener(ActionListener al) {
        zero.addActionListener(al);
    }
	public void addJedenListener(ActionListener al) {
        jeden.addActionListener(al);
    }
	public void addDwaListener(ActionListener al) {
        dwa.addActionListener(al);
    }
	public void addTrzyListener(ActionListener al) {
        trzy.addActionListener(al);
    }
	public void addCzteryListener(ActionListener al) {
        cztery.addActionListener(al);
    }
	public void addPiecListener(ActionListener al) {
        piec.addActionListener(al);
    }
	public void addSzescListener(ActionListener al) {
        szesc.addActionListener(al);
    }
	public void addSiedemListener(ActionListener al) {
        siedem.addActionListener(al);
    }
	public void addOsiemListener(ActionListener al) {
        osiem.addActionListener(al);
    }
	public void addDziewiecListener(ActionListener al) {
        dziewiec.addActionListener(al);
    }
	public void addPlusListener(ActionListener al) {
        plus.addActionListener(al);
    }
	public void addMinusListener(ActionListener al) {
        minus.addActionListener(al);
    }
	public void addMnozenieListener(ActionListener al) {
        mnozenie.addActionListener(al);
    }
	public void addDzielenieListener(ActionListener al) {
        dzielenie.addActionListener(al);
    }
	public void addRownaSieListener(ActionListener al) {
        rownaSie.addActionListener(al);
    }
	public void addKropkaListener(ActionListener al) {
        kropka.addActionListener(al);
    }
	public void addUsuwanieListener(ActionListener al) {
        usuwanie.addActionListener(al);
    }

}
