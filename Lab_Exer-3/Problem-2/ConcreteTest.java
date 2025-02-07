public class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  // This will invoke the display() method
    }
}
