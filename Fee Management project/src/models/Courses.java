package models;

public class Courses {

    private int course_id;
    private String course_name;
    private Float total_fee;
    private String academic_year;

    public void courses() {

    }

    public void courses (int course_id, String course_name, Float total_fee, String academic_year) {
        this.course_id = course_id;
        this.total_fee = total_fee;
        this.course_name = course_name;
        this.academic_year = academic_year;

    }

    public int course_id_getter() {
        return this.course_id;
    }

    public void course_id_setter(int course_id) {
        this.course_id = course_id;
    }
    public Float total_fee_getter(){
        return this.total_fee;
    }
    public void total_fee_setter(Float total_fee){
        this.total_fee = total_fee ;
    }

    public String course_name_getter() {
        return this.course_name;
    }

    public void course_name_setter(String course_name) {
        this.course_name = course_name;
    }

    public String academic_year_getter() {
        return this.academic_year;
    }

    public void academic_year_setter(String academic_year) {
        this.academic_year = academic_year;
    }

}
