package warehouse3;


import static org.junit.Assert.*;


import org.junit.Test;

public class AssemblyTest {
	
	
	@Test
	public void testCost() {
		
		CatalogueEntry drill = new CatalogueEntry("drill", 28834, 70.00);
		CatalogueEntry lathe = new CatalogueEntry("lathe", 28835, 140.00);
		CatalogueEntry cutter = new CatalogueEntry("tile cutter", 28836, 90.00);
		CatalogueEntry afterSales = new CatalogueEntry("after sales", 2, 10.00);
		
		Assembly assembly1 = new Assembly();
		assembly1.add(new Part(drill));
		assembly1.add(new Service(afterSales));
		
		Assembly assembly2 = new Assembly();
		assembly2.add(new Part(drill));
		assembly2.add(new Part(lathe));
		assembly1.add(new Service(afterSales));
		
		Assembly assembly3 = new Assembly();
		assembly3.add(assembly1);
		assembly3.add(new Part(cutter));
		assembly3.add(new Service(afterSales));
		
		Assembly assembly4 = new Assembly();
		assembly4.add(assembly2);
		assembly4.add(new Part(lathe));
		assembly3.add(new Service(afterSales));
		
		Assembly assembly5 = new Assembly();
		assembly5.add(assembly3);
		assembly5.add(new Part(drill));
		assembly5.add(new Part(cutter));
		assembly5.add(new Service(afterSales));
		assembly5.add(assembly4);
		
		
		double output = assembly5.cost();
		double expected = 720;
		
		assertEquals(expected, output, 0.01);
	}
}


