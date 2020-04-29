package TemplatePattern;
//定义一个抽象的做菜父类
public abstract class DodishTemplate {
	protected void dodish() {
		this.preparation();
		this.doing();
		this.carriedDishes();//抽象的做菜过程，准备，做法，上菜	
	}
	public abstract void preparation();
	public abstract void doing();
	public abstract void carriedDishes();
}
