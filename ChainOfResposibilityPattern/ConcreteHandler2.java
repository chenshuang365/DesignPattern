package ChainOfResposibilityPattern;
//���崦���߽�ɫ2
public class ConcreteHandler2 extends Handler {

	@Override
	public void handlerRequest(String request) {
		// TODO �Զ����ɵķ������
			if(request.equals("two")) {
				System.out.println("���崦����2�����������");
			}else {
				if(getNext()!=null) {
					getNext().handlerRequest(request);
				}else
				{
					System.out.println("û���˴��������");
				}
			}
	}

}
