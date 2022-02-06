package com.revature.models;

import java.util.Objects;

/**
 * This AbstractReimbursement class defines a minimum functionality for
 * interacting with reimbursements in the ERS application.
 *
 * All reimbursements in this application must at least have:
 * <ul>
 *     <li>ID</li>
 *     <li>Status</li>
 *     <li>Author</li>
 *     <li>Resolver</li>
 *     <li>Amount</li>
 * </ul>
 *
 * Additional fields can be added to the concrete {@link com.revature.models.Reimbursement} class.
 *
 * @author Center of Excellence
 */
public class EmployeeReimbursement {

    private int id;
    private Status status;
    private Employee author;
    private Employee resolver;
    private double amount;
    private String description;

    public EmployeeReimbursement() {
        super();
    }

    public EmployeeReimbursement(int id, Status status, Employee author, Employee resolver, double amount, String description) {
        super();
        this.id = id;
        this.status = status;
        this.author = author;
        this.resolver = resolver;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Employee getAuthor() {
        return author;
    }

    public void setAuthor(Employee author) {

        this.author = author;
    }

    public Employee getResolver() {
        return resolver;
    }

    public void setResolver(Employee resolver) {

        this.resolver = resolver;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeReimbursement that = (EmployeeReimbursement) o;
        return id == that.id && Double.compare(that.amount, amount) == 0 && status == that.status && Objects.equals(author, that.author) && Objects.equals(resolver, that.resolver) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, author, resolver, amount);
    }

    @Override
    public String toString() {
        return "AbstractReimbursement{" +
                "id=" + id +
                ", status=" + status +
                ", author=" + author +
                ", resolver=" + resolver +
                ", amount=" + amount +
                ", description=" + description +
                '}';
    }
}
