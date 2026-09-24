package models;

import java.time.LocalDate;

public class Transactions {

    private int transaction_id;
    private int student_id;
    private Float amount_paid;
    private LocalDate payment_date;
    private String payment_mode;
    private String receipt_number;

    public void transactions(int transaction_id, int student_id, Float amount_paid, LocalDate payment_date, String payment_mode, String receipt_number) {
        this.transaction_id = transaction_id;
        this.student_id = student_id;
        this.amount_paid = amount_paid;
        this.payment_date = payment_date;
        this.payment_mode = payment_mode;
        this.receipt_number = receipt_number ;
    }

    public int transaction_id_getter() {
        return this.transaction_id;
    }

    public void transaction_id_setter(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int student_id_getter() {
        return this.student_id;
    }

    public void student_id_setter(int student_id) {
        this.student_id = student_id;
    }

    public Float amount_paid_getter() {
        return this.amount_paid;
    }

    public void amount_paid_setter(Float amount_paid) {
        this.amount_paid = amount_paid;
    }

    public LocalDate payment_date_getter() {
        return this.payment_date;
    }

    public void payment_date_setter(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public String paymrnt_mode_getter() {
        return this.payment_mode;
    }

    public void payment_mode_setter( String payment_mode) {
        this.payment_mode = payment_mode;
    }
    public String receipt_number_getter(){
        return this.receipt_number;
    }
    public void receipt_number_setter(String receipt_number){
        this.receipt_number = receipt_number;
    }
}
