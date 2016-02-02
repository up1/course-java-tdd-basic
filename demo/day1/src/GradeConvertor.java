public class GradeConvertor {
	
	Data[] datas;

	public GradeConvertor() {
		initialData();
	}

	private void initialData(){
		datas = new Data[]{
				new Data(80, "A"),	
				new Data(75, "B+"),	
				new Data(70, "B"),
				new Data(65, "C+"),	
				new Data(60, "C"),	
				new Data(50, "D"),
				new Data(0, "F"),
			};
	}

	public String convertScoreToGrade(int score) {
		String grade = "";

		for (Data data : datas) {
			if (score >= data.score) {
				grade = data.grade;
				break;
			}
		}
		return grade;
	}
}
