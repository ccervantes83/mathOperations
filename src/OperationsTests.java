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
	public void OperationAdd3and5equals8() throws Exception{
		oper.add(3,5);
		Assert.assertEquals(8,oper.total());
	}
	
	@Test
	public void OperationAdd2and3equals7() throws Exception{
		oper.add(2,3);
		Assert.assertEquals(5,oper.total());
	}
	
	@Test
	public void OperationSubstract8and3equals5() throws Exception{
		oper.substract(8,3);
		Assert.assertEquals(5,oper.total());
	}
	
	@Test
	public void OperationSubstract9and6equals3() throws Exception{
		oper.substract(9,6);
		Assert.assertEquals(3,oper.total());
	}
	
	@Test
	public void OperationMultiplication8and2equals16() throws Exception{
		oper.multiplicate(8,2);
		Assert.assertEquals(16,oper.total());	
	}
	
	public void OperationMultiplication45and10equals450() throws Exception{
		oper.multiplicate(45,10);
		Assert.assertEquals(450,oper.total());	
	}
	
	@Test
	public void OperationDivision8and2equals4() throws Exception{
		oper.division(8,2);
		//Assert.assertEquals(16,oper.total());	
	}
}
