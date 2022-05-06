import org.junit.Assert;
import org.junit.Test;

public class operationsTests {

	@Test
	public void OperationTest() {
		Operation oper = new Operation();
		Assert.assertEquals(0,oper.value());
	}
	
	@Test
	public void OperationAdd() {
		Operation oper = new Operation();
		oper.add();
	}

}
