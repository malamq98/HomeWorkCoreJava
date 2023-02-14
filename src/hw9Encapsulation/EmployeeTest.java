package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Md Alam");
		emp.setAge(50);
		emp.setSex('M');
		emp.setCitizen(true);

		System.out.println("Employee Name :" + emp.getName() + "\nEmpyoee Age :" + emp.getAge() + "\nEmpyoee Sex :"
				+ emp.getSex() + "\nCitizen of USA :" + emp.isCitizen());
	}
}
