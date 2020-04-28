package CompositePattern;

public class Leaf extends Component {
	public Leaf(String name) {
		super(name);
	}
	@Override
	public void add(Component component) {
		// TODO 自动生成的方法存根
		throw new UnsupportedOperationException();	
	}

	@Override
	public void remove(Component component) {
		// TODO 自动生成的方法存根
		 throw new UnsupportedOperationException();
	}

	@Override
	public void display(int depth) {
		// TODO 自动生成的方法存根
		 for(int i=0; i<depth; i++) {
			 System.out.print('-');
			      }
			 System.out.println(name);
	}

}
