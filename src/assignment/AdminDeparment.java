package assignment;

public class AdminDeparment extends SuperDeparment {

	@Override
	public String departmentName() {
		return "Admin Deparment";
	}

	@Override
	public String getTodaysWork() {
		return "Complete  your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}
