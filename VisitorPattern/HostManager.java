package VisitorPattern;
//管家
public class HostManager implements Host {
	private Host hosts[];
	public HostManager() {
	this.hosts=new Host[] {new HostOne(),new HostTwo(),new HostThree()};
	}
	@Override
	public void accept(Visitor visitor) {
		// TODO 自动生成的方法存根
		for(int index=0;index<this.hosts.length;index++) {
			this.hosts[index].accept(visitor);
	}
		visitor.visit(this);
}}
