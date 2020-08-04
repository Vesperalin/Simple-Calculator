//obsluga zdarzen
package Kontrola_Dzialania;
import Grafika_GUI.*;
import Model_Biznesowy.*;
import java.awt.event.*;

public class Kontroler {
	private Model model;
	private Widok_Kalkulator widok;
	public Kontroler(Model m, Widok_Kalkulator w) {
		model=m;
		widok=w;
		widok.addUsuwanieListener(new UsuwanieListener());
		widok.addZeroListener(new ZeroListener());
		widok.addJedenListener(new JedenListener());
		widok.addDwaListener(new DwaListener());
		widok.addTrzyListener(new TrzyListener());
		widok.addCzteryListener(new CzteryListener());
		widok.addPiecListener(new PiecListener());
		widok.addSzescListener(new SzescListener());
		widok.addSiedemListener(new SiedemListener());
		widok.addOsiemListener(new OsiemListener());
		widok.addDziewiecListener(new DziewiecListener());
		widok.addKropkaListener(new KropkaListener());
		widok.addPlusListener(new PlusListener());
		widok.addMinusListener(new MinusListener());
		widok.addMnozenieListener(new MnozenieListener());
		widok.addDzielenieListener(new DzielenieListener());
		widok.addRownaSieListener(new RownaSieListener());
		
	}
	class UsuwanieListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			model.kasuj();
			widok.reset();
			model.kasujLiczba();
		}
	}
	class ZeroListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("0");
			}else {
				widok.insertNumber("0");
			}
		}
	}
	class JedenListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("1");
			}else {
				widok.insertNumber("1");
			}
		}
	}
	class DwaListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("2");
			}else {
				widok.insertNumber("2");
			}
		}
	}
	class TrzyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("3");
			}else {
				widok.insertNumber("3");
			}
		}
	}
	class CzteryListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("4");
			}else {
				widok.insertNumber("4");
			}
		}
	}
	class PiecListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("5");
			}else {
				widok.insertNumber("5");
			}
		}
	}
	class SzescListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("6");
			}else {
				widok.insertNumber("6");
			}
		}
	}
	class SiedemListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("7");
			}else {
				widok.insertNumber("7");
			}
		}
	}
	class OsiemListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("8");
			}else {
				widok.insertNumber("8");
			}
		}
	}
	class DziewiecListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(widok.getWynik().equals("0")) {
				widok.setWynik("9");
			}else {
				widok.insertNumber("9");
			}
		}
	}
	class KropkaListener implements ActionListener{ 
		public void actionPerformed(ActionEvent e) {
			if(!(widok.getWynik().contains("."))) {
				if(widok.getWynik().equals("0")) {
					widok.setWynik("0.");
				}else {
					widok.insertNumber(".");
				}
			}
		}
	}
	class PlusListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(model.getWynik().equals("0")) {
					model.setLiczba(widok.getWynik());
				}
			}
            catch (NumberFormatException nfex) {
                widok.showError("Wystapil blad");
            }
			model.setOperacja(widok.getPlusJButton().getText());
			widok.reset();
		}
	}
	class MinusListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(model.getWynik().equals("0") && model.getLiczba().equals("0")) {
					model.setModInfo(true);
				}
				if(model.getWynik().equals("0")) {
					model.setLiczba(widok.getWynik());
				}
			}catch(NumberFormatException nfex) {
				widok.showError("Wystapil blad");
			}
			model.setOperacja(widok.getMinusJButton().getText());
			widok.reset();
		}
	}
	class MnozenieListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(model.getWynik().equals("0")) {
					model.setLiczba(widok.getWynik());
				}
			}catch(NumberFormatException nfex) {
				widok.showError("Wystapil blad");
			}
			model.setOperacja(widok.getMnozenieJButton().getText());
			widok.reset();
		}
	}
	class DzielenieListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				if(model.getWynik().equals("0")) {
					model.setLiczba(widok.getWynik());
				}
			}catch(NumberFormatException nfex) {
				widok.showError("Wystapil blad");
			}
			model.setOperacja(widok.getDzielenieJButton().getText());
			widok.reset();
		}
	}
	class RownaSieListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(model.getOperacja().equals(widok.getPlusJButton().getText())) {
				if(model.getModInfo()) {
					model.odejmij(model.getLiczba());
					model.dodaj(widok.getWynik());
					model.setModInfo(false);
				}else {
					model.dodaj(widok.getWynik());
					model.dodaj(model.getLiczba());
				}
			}else if(model.getOperacja().equals(widok.getMinusJButton().getText())) {
				if(model.getModInfo()) {
					model.odejmij(model.getLiczba());
					model.odejmij(widok.getWynik());
					model.setModInfo(false);
				}else {
					model.dodaj(model.getLiczba());
					model.odejmij(widok.getWynik());
				}
			}else if(model.getOperacja().equals(widok.getMnozenieJButton().getText())) {
				if(model.getModInfo()) {
					model.odejmij(model.getLiczba());
					model.pomnozPrzez(widok.getWynik());
					model.setModInfo(false);
				}else {
					model.dodaj(model.getLiczba());
					model.pomnozPrzez(widok.getWynik());
				}

			}else if(model.getOperacja().equals(widok.getDzielenieJButton().getText())) {
				if(widok.getWynik().equals("0")) {
					widok.showError("Nie mozna dzielic przez 0");
				}else {
					if(model.getModInfo()) {
						model.odejmij(model.getLiczba());
						model.podzielPrzez(widok.getWynik());
						model.setModInfo(false);
					}else {
						model.dodaj(model.getLiczba());
						model.podzielPrzez(widok.getWynik());
					}
				}
			}
			model.kasujLiczba();
			widok.setWynik(model.getWynik());
		}
	}
	
}	

