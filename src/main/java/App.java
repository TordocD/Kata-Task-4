import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld anotherBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(anotherBean.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        Cat anotherCat = (Cat) applicationContext.getBean("cat");
        System.out.println(anotherCat.getName());

        System.out.println((bean == anotherBean) + "\n" + (cat == anotherCat));
    }
}