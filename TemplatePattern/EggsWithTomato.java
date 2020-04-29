package TemplatePattern;
//西红柿炒蛋做法
public class EggsWithTomato extends DodishTemplate {

	@Override
	public void preparation() {
		// TODO 自动生成的方法存根
		System.out.println("切西红柿，打鸡蛋");
	}

	@Override
	public void doing() {
		// TODO 自动生成的方法存根
		System.out.println("翻炒西红柿并倒入鸡蛋搅拌");
	}

	@Override
	public void carriedDishes() {
		// TODO 自动生成的方法存根
		System.out.println("将菜盛入盘子送给客人吃");
	}

}
