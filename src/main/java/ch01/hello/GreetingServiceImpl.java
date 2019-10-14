package ch01.hello;

/**
 * @author rancho
 * @date 2019/10/14
 */
public class GreetingServiceImpl implements IGreetingService {

    private String greeting;

    public GreetingServiceImpl() {

    }

    public GreetingServiceImpl(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayGreeting() {
        System.out.println(this.greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
