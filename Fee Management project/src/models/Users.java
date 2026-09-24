package models;

public class Users {

    private int user_id;
    private String user_name;
    private String password;
    private String role;

    // constructure 
    public void users (int user_id, String user_name, String password, String role) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }
    public int user_id_getter(){
        return this.user_id;
    }
    public void user_id_setter(int user_id){
        this.user_id = user_id;
    }

    public String user_name_getter() {
        return this.user_name;
    }

    public void user_name_setter(String user_name) {
        this.user_name = user_name;
    }
    public String password_getter() {
        return this.password;
    }

    public void password_setter(String password) {
        this.password = password;
    }
    public String role_getter() {
        return this.role;
    }

    public void role_setter(String role) {
        this.role = role;
    }
}
