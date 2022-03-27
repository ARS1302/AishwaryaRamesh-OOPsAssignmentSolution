package assignment;

public class HrDeparment extends SuperDeparment {

	@Override
	public String departmentName() {
		return "Hr Deparment";
	}

	@Override
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	
}
