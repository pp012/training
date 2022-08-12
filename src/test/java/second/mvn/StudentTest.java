package second.mvn;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StudentTest {
	private int id;
	private String expectedResult;  
	StudentImp si;
	
	public StudentTest(int id,String expectedResult)
	{
		this.id=id;
		this.expectedResult=expectedResult;
	}
	@Before
	public void initialize() {
		si = new StudentImp();
		si.createStudent(1,"Andy");
		si.createStudent(2, "Candy");
	}
	@Test
	public void test() {
		CException ce = assertThrows(
				CException.class,
				()->{si.getStudent(this.id);});
		
		assertEquals(this.expectedResult,ce.getMessage());
	}
	@Parameterized.Parameters
	public static Collection pNums()
	{
		return Arrays.asList(new Object[][]{
			{3,"No such student exists"},
			{4, "No such student exists"},
			{5,"No such student exists"},
		});
	}
}
