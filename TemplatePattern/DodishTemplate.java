package TemplatePattern;
//����һ����������˸���
public abstract class DodishTemplate {
	protected void dodish() {
		this.preparation();
		this.doing();
		this.carriedDishes();//��������˹��̣�׼�����������ϲ�	
	}
	public abstract void preparation();
	public abstract void doing();
	public abstract void carriedDishes();
}
