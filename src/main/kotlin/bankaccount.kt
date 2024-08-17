
class BankAccount(private val accountNumber: String, private var balance: Double) {
    private var accountHolderName: String = ""

    fun setAccountHolderName(name: String) {
        accountHolderName = name
    }

    fun getAccountHolderName(): String {
        return accountHolderName
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit successful. New balance: $balance")
        } else {
            println("Invalid deposit amount.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawal successful. New balance: $balance")
        } else {
            println("Invalid withdrawal amount or insufficient funds.")
        }
    }

    fun getBalance(): Double {
        return balance
    }

    fun printDetails() {
        println("Account Number: $accountNumber")
        println("Account Holder Name: $accountHolderName")
        println("Balance: $balance")
    }
}