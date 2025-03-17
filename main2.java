package Bai2;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Nguyen Van Phep","123 Le Van Sy");
		person.toString();
		System.out.println(person.toString());
		
		Student student = new Student("Nguyen Thi No","456 Cong Hoa","Computer Science",2,5000.0);
		student.toString();
		System.out.println(student.toString());
		
		Staff staff = new Staff("Anh Huynh","789 Cao Thang","Tech University",60000.0);
		staff.toString();
		System.out.println(staff.toString());

	}

}
