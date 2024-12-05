import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
        HelloWorld beanNew =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(beanNew.getMessage());
//        System.out.println(bean.toString());
//        System.out.println(beanNew.toString());
        System.out.println(bean.equals(beanNew));

//        System.out.println("-------");
        Cat cat = (Cat) applicationContext.getBean("cat");
//        System.out.println(cat.getMessage());
        Cat catNew = (Cat) applicationContext.getBean("cat");
//        System.out.println(catNew.getMessage());
//        System.out.println(cat.toString());
//        System.out.println(catNew.toString());
        System.out.println(cat.equals(catNew));
    }
}