package assignment3;

public class TesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpState employee = new EmpState(1, "kwame", "ama", "efhlflh", 002, 2456.12);
		EmpState employee1 = new EmpState(1, "kwame", "ama", "efhlflh", 002, 2456.12);
		
		String employeeDetail = employee.toString();
		
		
		System.out.println(employeeDetail);
		System.out.println(employee1.toString());
		
		
		//WorkerState workerState = new WorkerState(45, 0, employeeDetail, employeeDetail, employeeDetail, 0, 0);
		
		//System.out.println(workerState.toString());
		
		

	}
	

}
