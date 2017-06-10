

package warehouse3;


import java.util.ArrayList;


public class Assembly extends Component{
	
	private ArrayList<Component> components;
	
	
	public Assembly(){
		this.components = new ArrayList<Component>();
	}

	public  void add(Component comp){
		this.components.add(comp);
	}
	
	@Override
	public double cost(){
		double cost = 0.0;
		for(Component comp : components){
			cost+=comp.cost();
		}
		return cost;
	}
}



	