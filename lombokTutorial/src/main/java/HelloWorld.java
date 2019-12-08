public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Lombok tutorial");

        EmployeeWithoutLombok employeeWithoutLombok = new EmployeeWithoutLombok();

        EmployeeWithLombok.EmployeeWithLombokBuilder builder = EmployeeWithLombok.builder()
                .empId("12")
                .firstName("Shafaaf")
                .lastname("Hossain");

        int a = 3 + 4;
    }
}
