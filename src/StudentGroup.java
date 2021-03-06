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
		
		return getStudents;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		
		return index;
	}

	@Override
	public void setStudent(Student student, int index) {
		students.set(index, student);
		enrollStudents();
	}

	@Override
	public void addFirst(Student student) {
		    Node f = first;
    		Node newNode = new Node(student);
    		newNode.next = f; // this was missing
    		first = newNode;
    		if (f == null)
        		  last = newNode;
   		 else
       		 f.previous = newNode;
		}

	@Override
	public void addLast(Student student) {
		 Node l = last;
    		Node newNode = new Node(student);
    		newNode.previous = l; // this was missing
    		last = newNode;
    		if (l == null)
       		   first = newNode;
    		else
        		  l.next = newNode;
	}

	@Override
	public void add(Student student, int index) {
		if (size == elementArray.length) {
    		ensureCapacity();
    } 
    elementArray[size++] = e;
	}

	@Override
	public void remove(int index) {
                                     if ( index <0 || index>= size) {  
	    	throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
	    }
	    return(index) elementArray[index];
	}

	@Override
	public void remove(Student student) {
		 Object removedElement=elementArray[index];
    		for(int i=index;i<size - 1;i++){
    		elementArray[i]=elementArray[i+1];
	}
		}
	@Override
	public void removeFromIndex(int index) {
		int data = 0;
		Node tmp = root;

		if (index < 0)
			return -1;
		if (index == 0) {
			data = root.data;
			root = root.next;
			return data;
                                           }

		while (index > 0) {
			if (tmp == null) {
				return -1;
			}
			tmp = tmp.next;
			index--;
		}
		data = tmp.data;
		tmp.data = tmp.next.data;
		tmp.next = tmp.next.next;

		return data;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		 int n = arr.length;  
        		int temp = 0;  
         		for(int i=0; i < n; i++){  
                 		for(int j=1; j < (n-i); j++){  
                          	if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
	}
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
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
