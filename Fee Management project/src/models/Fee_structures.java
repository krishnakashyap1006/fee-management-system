package models;

public class Fee_structures {
    private int fee_structures_id;
    private int course_id;
    private int semester;
    private Float amount_due ;

    public void fee_structures(int fee_structures_id, int course_id, int semester, Float amount_due){
        this.fee_structures_id = fee_structures_id;
        this.course_id = course_id;
        this.semester = semester;
        this.amount_due = amount_due;
    }

    public int fee_structures_id_getter(){
        return this.fee_structures_id;
    }
    public void fee_structures_id(int fee_structures_id){
        this.fee_structures_id = fee_structures_id;
    }
    public int course_id_getter(){
        return this.course_id;
    }
    public void course_id(int course_id){
        this.course_id = course_id;
    }
    public int semester_getter(){
        return this.semester;
    }
    public void semester_setter(int semester){
        this.semester = semester ;
    }
    public Float amount_due_getter(){
        return this.amount_due;
    }
    public void amount_due_setter(Float amount_due){
        this.amount_due = amount_due;
    }
}