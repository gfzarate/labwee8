public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Create some students
        Student student1 = new Student(1, "John Doe", "john.doe@example.com");
        Student student2 = new Student(2, "Jane Smith", "jane.smith@example.com");
        Student student3 = new Student(3, "Alice Brown", "alice.brown@example.com");

        // Add students to HashSet
        manager.addStudentToHashSet(student1);
        manager.addStudentToHashSet(student2);
        manager.addStudentToHashSet(student3);

        // Display students in HashSet
        manager.displayHashSetStudents();

        // Add students to TreeSet (sorted by name)
        manager.addStudentToTreeSet(student1);
        manager.addStudentToTreeSet(student2);
        manager.addStudentToTreeSet(student3);

        // Display students in TreeSet
        manager.displayTreeSetStudents();

        // Pop the last added student from the Stack
        manager.popLastStudentFromStack();
        manager.popLastStudentFromStack();
        manager.popLastStudentFromStack();
        manager.popLastStudentFromStack();  // No students left in the stack

        // Bonus Task: Remove a student and show the effect on all collections
        System.out.println("\nRemoving student with ID 2:");
        manager.removeStudent(student2);
        manager.displayHashSetStudents();
        manager.displayTreeSetStudents();
    }
}
