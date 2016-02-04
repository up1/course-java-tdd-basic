public class DemoAbstract {
	public static void main(String[] args) {
		Report1  report1 = new Report1();
		report1.generateReport();
	}
}

abstract class ReportTemplate {
	public abstract void createHeader();
	public abstract void createBody();
	public abstract void createFooter();
	public void generateReport(){
		createHeader();
		createBody();
		createFooter();
	}
}

class Report1 extends ReportTemplate{

	@Override
	public void createHeader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createFooter() {
		// TODO Auto-generated method stub
		
	}

}



