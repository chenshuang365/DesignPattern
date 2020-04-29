package ChainOfResposibilityPattern;
//具体处理角色1
public class ConcreteHandler1 extends Handler {
	
	@Override
	public void handlerRequest(String request) {
		// TODO 自动生成的方法存根
		if(request.equals("one")) {
			System.out.println("具体处理者1负责处理该请求");
		}else {
			if(getNext()!=null) {
				getNext().handlerRequest(request);
			}else
			{
				System.out.println("没有人处理该请求");
			}
		}
	}

}
