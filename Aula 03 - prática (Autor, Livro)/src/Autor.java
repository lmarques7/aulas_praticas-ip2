
public class Autor {

    private String name;
    private String email;
    private char gender;
    
    public Autor(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return "Nome: " + name + "\n" + "Gênero: " + gender + "   Email: " + email;
    }

    public static void main(String[] args) {
        Autor a1 = new Autor("Paulo", "paulo@xxx.com", 'M');
        a1.getEmail();
        a1.setEmail("paulo123@hotmail.com");

        System.out.println(a1.getEmail());
    }

}
