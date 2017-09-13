import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students==null)
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		if(index==0||index<0||index==students.length)
		
		
		System.out.println("IILEGALARGUMENTEXCEPTION");
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		if(index==0||index<0||index>0)
		
		
		System.out.println("IILEGALARGUMENTeXCEPTION");
			
			
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index]=students[index]+index;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}
		if(index==0||index<0||index>0)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}
		
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		students[]=students[index]+index;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}
		
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[index]=null;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}
	
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		return students;
		return index;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		students[index]=null;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation herestudents[index]=null;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		students[index]=null;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}
	}

	@Override
	public void removeToIndex(int index) {
	students[index]=null;
		if(student==null)
		{
		System.out.println("ILLEGALARGUMENTEXCEPTION");
		}	// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return Student;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return Students;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return student;
	}
}
