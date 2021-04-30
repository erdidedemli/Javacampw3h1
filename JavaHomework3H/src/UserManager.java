
public class UserManager {

    public  void  add (User user){
        System.out.println( user.getUserName() + " adlý kullanýcý eklendi");
    }

    public void  addMultiple(User[] users) {
        for (User user : users) {
            System.out.println("Kullanýcýlar eklendi: " + user.getFirstName());
        }
    }
}
