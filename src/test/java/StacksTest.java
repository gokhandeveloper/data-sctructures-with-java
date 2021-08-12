import org.junit.jupiter.api.Test;

public class StacksTest {
    @Test
    public void test() {
        String str = "(1 + 2";
        StackJava.balancedExpression(str);
    }
    @Test
    public void stackimpt(){
        StackImp stackImp = new StackImp();
        StackImp.push(10);
        StackImp.push(10);
        System.out.println(stackImp.toString());
    }
}
