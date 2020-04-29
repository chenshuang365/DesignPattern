package ChainOfResposibilityPattern;
//抽象处理角色
public abstract class Handler {
	private Handler next;
	public void setNext(Handler next)
	{	
		this.next=next;
		}
	public Handler getNext() {
		return next;
	}//处理请求的方法
	public abstract void handlerRequest(String request);
	}
