package entities;

public class ExercicioListasEmpregado {
    private Integer id;
    private String name;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(double percentage) {
        this.salary = salary + (percentage / 100.0) * salary;
        setSalary(salary);
    }

    public String printEmployee() {
        return String.format("%d, %s, %.2f\n", getId(), getName(), getSalary());
    }

}
