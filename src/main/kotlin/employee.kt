class Employee(private val employeeId: Int, private var name: String, private var salary: Double) {

    fun getEmployeeId(): Int {
        return employeeId
    }

    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

    fun getSalary(): Double {
        return salary
    }

    fun setSalary(newSalary: Double) {
        if (newSalary >= 0) {
            salary = newSalary
        } else {
            println("Invalid salary. Salary must be non-negative.")
        }
    }

    fun printDetails() {
        println("Employee ID: $employeeId")
        println("Employee Name: $name")
        println("Salary: $salary")
    }
}
