public class Demo {

    public static void main(String[] args) {
        System.out.println("Lombok tutorial");


        EmployeeWithoutLombok employeeWithoutLombok = new EmployeeWithoutLombok.EmployeeBuilder()
                .withEmpId("12345")
                .withFirstName("John")
                .withLastName("Kris")
                .build();

        EmployeeWithLombok employeeWithLombok = EmployeeWithLombok.builder()
                .empId("12345")
                .firstName("John")
                .lastname("Kris")
                .build();

        System.out.println("employeeWithoutLombok.toString(): " + employeeWithoutLombok.toString());
        System.out.println("employeeWithLombok.toString(): " + employeeWithLombok.toString());

        int a = 3 + 4;
    }
}
