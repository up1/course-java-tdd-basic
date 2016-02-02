import static org.junit.Assert.*;

import org.junit.Test;


public class GradeCovnertorTest {

	@Test
	public void ได้เกรดA(){
		String expectedGrade = "A";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(100));
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(80));
	}
	
	@Test
	public void ได้เกรดBบวก(){
		String expectedGrade = "B+";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(79));
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(75));
	}
	
	@Test
	public void ได้เกรดB(){
		String expectedGrade = "B";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(74));
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(70));
	}
	
	@Test
	public void ได้เกรดCบวก(){
		String expectedGrade = "C+";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(69));
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(65));
	}
	
	@Test
	public void ได้เกรดC(){
		String expectedGrade = "C";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(64));
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(60));
	}
	
	@Test
	public void ได้เกรดD(){
		String expectedGrade = "D";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(59));
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(50));
	}
	
	@Test
	public void ได้เกรดF(){
		String expectedGrade = "F";
		GradeConvertor helloWorld = new GradeConvertor();
		assertEquals(expectedGrade, helloWorld.convertScoreToGrade(49));
	}
	
}
