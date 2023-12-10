import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class main_test_Etudiant {
    public static void main(String[] args) {
        // Create an instance of EtudiantManagement
        EtudiantManagement etudiantManagement = new EtudiantManagement();

        // Create a list of students
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1, "Alice", 23));
        etudiants.add(new Etudiant(2, "Bob", 25));
        etudiants.add(new Etudiant(3, "Charlie", 22));

        // Display all students
        System.out.println("All students:");
        etudiantManagement.displayStudents(etudiants, System.out::println);

        // Display students older than 22
        System.out.println("\nStudents older than 22:");
        Predicate<Etudiant> isOlderThan22 = e -> e.getAge() > 22;
        etudiantManagement.displayStudentsByFilter(etudiants, isOlderThan22, System.out::println);

        // Get and display student names
        System.out.println("\nStudent names:");
        Function<Etudiant, String> toName = Etudiant::getNom;
        String names = etudiantManagement.returnStudentsNames(etudiants, toName);
        System.out.println(names);

        // Create a new student using a Supplier
        Supplier<Etudiant> studentSupplier = () -> new Etudiant(4, "Dave", 24);
        Etudiant newStudent = etudiantManagement.createStudent(studentSupplier);
        System.out.println("\nCreated new student: " + newStudent);

        // Sort students by ID and display them
        System.out.println("\nSorted students by ID:");
        Comparator<Etudiant> byId = Comparator.comparingInt(Etudiant::getId);
        List<Etudiant> sortedStudents = etudiantManagement.sortStudentsById(etudiants, byId);
        sortedStudents.forEach(System.out::println);

        // Convert list to stream and count the number of students
        // Convert list to stream and count the number of students
        Stream<Etudiant> studentStream = etudiantManagement.convertToStream(etudiants);
        long studentCount = studentStream.count();
        System.out.println("\nNumber of students: " + studentCount);

// Let's use the stream again to demonstrate another operation
// Convert list to stream and find any student older than 24
        studentStream = etudiantManagement.convertToStream(etudiants); // Re-create the stream
        Etudiant olderStudent = studentStream
                .filter(e -> e.getAge() > 24)
                .findAny()
                .orElse(null);

        System.out.println("\nAny student older than 24: " + (olderStudent != null ? olderStudent : "None found"));
    }
}