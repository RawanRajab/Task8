fun main() {

        val account = BankAccount("19200255", 1000.0)
        account.setAccountHolderName("Yara  hassan")

        // Deposit money
        account.deposit(500.0)

        // Withdraw money
        account.withdraw(200.0)

        // Print account details
        account.printDetails()

    println( "Employee ")
    val employee = Employee(19203, " Rawan Rajab", 5000.0)
    employee.printDetails()
}
