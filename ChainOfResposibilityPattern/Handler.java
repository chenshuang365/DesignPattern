package ChainOfResposibilityPattern;
//�������ɫ
public abstract class Handler {
	private Handler next;
	public void setNext(Handler next)
	{	
		this.next=next;
		}
	public Handler getNext() {
		return next;
	}//��������ķ���
	public abstract void handlerRequest(String request);
	}
