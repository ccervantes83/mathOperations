import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class operationsTests {

	private Operation oper;

	@Before
	public void setUp() throws Exception{
		oper = new Operation();
	}
	
	@Test
	public void OperationTest() throws Exception{
		Assert.assertEquals(0,oper.value());
	}
	
	@Test
	public void OperationAdd2and3equals7() throws Exception{
		oper.add(2,3);
		Assert.assertEquals(5,oper.total());
	}

}
