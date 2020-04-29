package ChainOfResposibilityPattern;
//具体处理者角色2
public class ConcreteHandler2 extends Handler {

	@Override
	public void handlerRequest(String request) {
		// TODO 自动生成的方法存根
			if(request.equals("two")) {
				System.out.println("具体处理者2负责处理该请求");
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
