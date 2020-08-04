//model dzialania projektu
package Model_Biznesowy;
import java.math.BigDecimal;

public class Model {
	private static final String wartoscPoczatkowa = "0";  
	private BigDecimal wynik;
	private String operacja;
	private BigDecimal liczba;
	private boolean modInfo=false;
	public Model() {
		kasuj();
	}
	public void setModInfo(boolean s) {
		modInfo=s;
	}
	public boolean getModInfo() {
		return modInfo;
	}
	public void setLiczba(String s) {
		liczba=new BigDecimal(s);
	}
	public String getLiczba() {
		return liczba.toString();
	}
	public void setOperacja(String s) {
		operacja=s;
	}
	public String getOperacja() {
		return operacja;
	}
	public String getWynik() {
        return wynik.toString();
    }
	public void setWynik(String value) {
        wynik=new BigDecimal(value);
    }
	public void kasuj() {
        wynik=new BigDecimal(wartoscPoczatkowa);
    }
	public void kasujLiczba() {
		liczba=new BigDecimal(wartoscPoczatkowa);
	}
	public void pomnozPrzez(String s) { 
		wynik=wynik.multiply(new BigDecimal(s));
	}
	public void podzielPrzez(String s) { 
		wynik=wynik.divide(new BigDecimal(s));
	}
	public void dodaj(String s) {
		wynik=wynik.add(new BigDecimal(s));
	}
	public void odejmij(String s) {
		wynik=wynik.subtract(new BigDecimal(s));
	}
	
}
