package CompositePattern;

public class Leaf extends Component {
	public Leaf(String name) {
		super(name);
	}
	@Override
	public void add(Component component) {
		// TODO �Զ����ɵķ������
		throw new UnsupportedOperationException();	
	}

	@Override
	public void remove(Component component) {
		// TODO �Զ����ɵķ������
		 throw new UnsupportedOperationException();
	}

	@Override
	public void display(int depth) {
		// TODO �Զ����ɵķ������
		 for(int i=0; i<depth; i++) {
			 System.out.print('-');
			      }
			 System.out.println(name);
	}

}
