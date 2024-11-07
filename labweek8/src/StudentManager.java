import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class StudentManager {
    private HashSet<Student> studentSet = new HashSet<>();
    private Stack<Student> studentStack = new Stack<>();
    private TreeSet<Student> studentTreeSet = new TreeSet<>((s1, s2) -> s1.getName().compareTo(s2.getName()));  // Sorting by name

    // Method to add a student to the HashSet
    public void addStudentToHashSet(Student student) {
        if (studentSet.add(student)) {
            studentStack.push(student);  // Add to stack whenever a student is added
        } else {
            System.out.println("Student with ID " + student.getId() + " is already in the system.");
        }
    }

    // Method to display all students in the HashSet
    public void displayHashSetStudents() {
        System.out.println("Students in HashSet:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }

    // Method to add a student to the TreeSet (sorted by name)
    public void addStudentToTreeSet(Student student) {
        if (studentTreeSet.add(student)) {
            studentStack.push(student);  // Add to stack whenever a student is added
        } else {
            System.out.println("Student with ID " + student.getId() + " is already in the system.");
        }
    }

    // Method to display all students in the TreeSet (by name)
    public void displayTreeSetStudents() {
        System.out.println("Students in TreeSet (Sorted by Name):");
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }
    }

    // Method to pop the last student added from the Stack and display details
    public void popLastStudentFromStack() {
        if (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            System.out.println("Popped student: " + student);
        } else {
            System.out.println("No students in the stack.");
        }
    }

    // Bonus Task: Remove student from HashSet, TreeSet, and Stack
    public void removeStudent(Student student) {
        if (studentSet.remove(student)) {
            System.out.println("Removed from HashSet: " + student);
        } else {
            System.out.println("Student not found in HashSet.");
        }

        if (studentTreeSet.remove(student)) {
            System.out.println("Removed from TreeSet: " + student);
        } else {
            System.out.println("Student not found in TreeSet.");
        }

        // Remove from Stack by searching for the student (remove the first occurrence)
        if (studentStack.contains(student)) {
            studentStack.remove(student);
            System.out.println("Removed from Stack: " + student);
        } else {
            System.out.println("Student not found in Stack.");
        }
    }
}
