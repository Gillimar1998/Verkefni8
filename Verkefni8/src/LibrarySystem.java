import java.time.LocalDate;
import java.util.List;

public class LibrarySystem {
    private Student student;
    private FacultyMember facultyMember;
    private Book book;
    private Lending lending;


    public LibrarySystem() {
    }

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("Author list is empty");
        }
        this.book.setTitle(title);
        this.book.setAuthors(authors);
    }

    public void addStudentUser(String name, boolean feePaid) {
        this.student.setName(name);
        this.student.setFeePaid(feePaid);
    }

    public void addFacultyMemberUser(String name, String department) {
        this.facultyMember.setName(name);
        this.facultyMember.setDepartment(department);
    }

    public Book findBooksByTitle(String title) {
        return null;
    }

    public User findUserByName(String Name) {
        return null;
    }

    public void borrowBook(User user, Book book) {
        lending = new Lending(book, user);
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {
        throw new UserOrBookDoesNotExistException("Book not found");
    }

    public void returnBook(User user, Book book) {
    }
}
