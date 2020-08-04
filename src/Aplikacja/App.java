package Aplikacja;
import Grafika_GUI.*;
import Model_Biznesowy.*;
import Kontrola_Dzialania.*;

public class App {

	public static void main(String[] args) {
		Model model = new Model();
		Widok_Kalkulator widok = new Widok_Kalkulator(model);
		Kontroler kontroler = new Kontroler(model, widok);
		widok.setVisible(true);
	}

}
