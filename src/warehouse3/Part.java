package warehouse3;

public class Part extends Component {
	
	private CatalogueEntry entry ; 
	
	//constructor
	public Part(CatalogueEntry e) { 
		this.entry = e; 
	}

	public String getName(){
		return this.entry.getName();
	}
	
	public long getNumber(){
		return this.entry.getNumber();
	}
	
	@Override
	public double cost(){
		return this.entry.getCost();
	}
}

