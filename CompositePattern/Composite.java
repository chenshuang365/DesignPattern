package CompositePattern;

import java.util.ArrayList;

public class Composite extends Component {
	public Composite(String name) {
		super(name);
	}
	private ArrayList<Component> componentArraryList=new ArrayList<Component>();
	@Override
	public void add(Component component) {
		// TODO �Զ����ɵķ������
		this.componentArraryList.add(component);
	}
	@Override
	public void remove(Component component) {
		// TODO �Զ����ɵķ������
		this.componentArraryList.remove(component);
	}

	@Override
	public void display(int depth) {
		// TODO �Զ����ɵķ������
		 for(int i=0; i<depth; i++) {
			             System.out.print('-');
			        }
			         System.out.println(name);
			 
			         for (Component component : componentArraryList) {
			        	 component.display(depth + 1);
			         }
	}

}
