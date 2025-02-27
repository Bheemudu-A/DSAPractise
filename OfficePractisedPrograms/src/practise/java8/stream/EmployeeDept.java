package practise.java8.stream;

public class EmployeeDept {

	private int id;
	private String empDept;
	
	
	public EmployeeDept(int id, String empDept) {
		super();
		this.id = id;
		this.empDept = empDept;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpDept() {
		return empDept;
	}


	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "EmployeeDept [id=" + id + ", empDept=" + empDept + "]";
	}
	
	
	
}
