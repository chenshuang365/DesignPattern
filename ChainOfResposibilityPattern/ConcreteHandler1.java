package ChainOfResposibilityPattern;
//���崦���ɫ1
public class ConcreteHandler1 extends Handler {
	
	@Override
	public void handlerRequest(String request) {
		// TODO �Զ����ɵķ������
		if(request.equals("one")) {
			System.out.println("���崦����1�����������");
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
