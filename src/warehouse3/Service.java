package warehouse3;

public class Service extends Component {
	
	private CatalogueEntry entry;

	public Service (CatalogueEntry cat){
		this.entry = cat;
	}

	@Override
	public double cost() {
		return this.entry.getCost();
	}
	
	//needs getter methods

}
