package practise.interviewPrograms.siemen;

import java.util.List;
import java.util.Objects;

public class EmployeeHistory {

	private String empName;
	private String manager;
	private List<String> previousCompies;
	
	public EmployeeHistory(String empName, String manager, List<String> previousCompies) {
		super();
		this.empName = empName;
		this.manager = manager;
		this.previousCompies = previousCompies;
	}

	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public List<String> getPreviousCompies() {
		return previousCompies;
	}
	
	public void setPreviousCompies(List<String> previousCompies) {
		this.previousCompies = previousCompies;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EmployeeHistory that = (EmployeeHistory) obj;
        
        return Objects.equals(empName, that.empName) &&
               Objects.equals(manager, that.manager) &&
               Objects.equals(previousCompies, that.previousCompies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, manager, previousCompies);
    }

	@Override
	public String toString() {
		return "EmployeeHistory [empName=" + empName + ", manager=" + manager + ", previousCompies=" + previousCompies
				+ "]";
	}
	
	
}
