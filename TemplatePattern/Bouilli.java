package TemplatePattern;
//红烧肉做法
public class Bouilli extends DodishTemplate {

	@Override
	public void preparation() {
		// TODO 自动生成的方法存根
		System.out.println("切猪肉和一些佐料");
	}

	@Override
	public void doing() {
		// TODO 自动生成的方法存根
		System.out.println("烧好红烧肉并倒入佐料");
	}

	@Override
	public void carriedDishes() {
		// TODO 自动生成的方法存根
		System.out.println("将菜盛入碗内端给客人吃");
	}

}
