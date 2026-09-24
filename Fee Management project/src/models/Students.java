package models;

public class Students {

    private int student_id;
    private String student_name;
    private int course_id;
    private String contact_number;

    public void students() {

    }

    public void students(int student_id, String student_name, int course_id, String contact_number) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.course_id = course_id;
        this.contact_number = contact_number;

    }

    public int student_id_getter() {
        return this.student_id;
}

    public void student_id_setter(int student_id) {
        this.student_id = student_id;
    }

    public String student_name_getter() {
        return this.student_name;
    }

    public void student_name_setter(String student_name) {
        this.student_name = student_name;
    }

    public int course_id_getter() {
        return this.course_id;
    }

    public void course_id_setter(int course_id) {
        this.course_id = course_id;
    }

    public String contact_number_getter() {
        return this.contact_number;
    }

    public void contact_number_setter(String contact_number) {
        this.contact_number = contact_number;
    }

}
