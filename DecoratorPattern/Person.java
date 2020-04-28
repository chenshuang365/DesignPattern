package DecoratorPattern;
//定义被装饰者-人
	public class Person {
		private String name;
		public Person() {
			
		}
			public Person(String name) {
				this.name=name;
			}
		
		public void show() {
			System.out.println(name+"的装饰:");
		}
	}


