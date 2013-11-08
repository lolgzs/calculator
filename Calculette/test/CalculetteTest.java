import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculetteTest {
	private Calculette calculette;

	@Before
	public void creerLaCalculette() {
		this.calculette = new Calculette();
	}
	
	@Test
	public void parDefautResultatRetourneZero() {
		assertEquals((Double)0.0, this.calculette.getResultat());
	}
	
	
	@Test
	public void enCliquantUnResultatRetourneUn() {
		this.calculette.click(1);
		assertEquals((Double)1.0, this.calculette.getResultat());		
	}
	
	
	@Test
	public void enCliquantUnPuisDeuxResultatRetourneDouze() {
		this.calculette
			.click(1)
			.click(2);
		assertEquals((Double)12.0, this.calculette.getResultat());
	}
	
	
	@Test 
	public void enCliquantUnPuisPlusPuisCinqResultatRetourneSix() {
		this.calculette
			.click(1)  
			.click("+")
			.click(5);  
		assertEquals((Double)6.0, this.calculette.getResultat());	
	}
	
	@Test
	public void enCliquantUnPlusDeuxPuisDeuxResultatRetourneVingtTrois() {
		this.calculette
			.click(1)
			.click("+")
			.click(2)
			.click(2);
		assertEquals((Double)23.0, this.calculette.getResultat());
	}
	
	
	@Test
	public void enCliquantDeuxPlusTroisPlusQuatreResultatRetourneNeuf() {
		this.calculette
			.click(2)
			.click("+")
			.click(3)
			.click("+")
			.click(4);
		assertEquals((Double)9.0, this.calculette.getResultat());
	}

	
	@Test
	public void enCliquantQuatreMoinsTroisResultatRetourneUn() {
		this.calculette
			.click(4)
			.click("-")
			.click(3);
		assertEquals((Double)1.0, this.calculette.getResultat());
	}
	
	@Test
	public void enCliquantTroisFoisDeuxResultatRetourneSix() {
		this.calculette
			.click(3)
			.click("*")
			.click(2);
		assertEquals((Double)6.0, this.calculette.getResultat());
	}
	
	@Test
	public void enCliquantTroisDiviseParDeuxResultatRetourneUnEtDemi() {
		this.calculette
			.click(3)
			.click("/")
			.click(2);
		assertEquals((Double)1.5, this.calculette.getResultat());
	}
}
