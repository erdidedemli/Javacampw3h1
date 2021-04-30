
public class InstructorManager extends UserManager {

    public void login(Instructor instructor) {
        System.out.println(instructor.getUserName() + " adlý yönetici oturum açtý");
    }

    public void Exit(Instructor instructor) {
        System.out.println(instructor.getUserName() + " adlý yönetici oturumu kapattý");

    }

    public void ShowUsersÝnfo(User[] users) {
        for (User user : users) {
            System.out.println("kullanýcý adý: " + user.getUserName() + "\n"
                    + "isim: " + user.getFirstName() + "\n" + "soyisim: " +
                    user.getLastName() +
                    "\n" + "Mail: " + user.getEmail());
        }
    }
}
