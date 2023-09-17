object q03 extends App {

    class Account(acc_name: String, acc_balance: Double = 0.0) {
        
        val name: String = acc_name
        var balance: Double = acc_balance
        
        def Deposit(amount:Double)  = {
            balance += amount
        }

        def Withdraw(amount:Double) = {
            if(amount > balance) println("Insufficient Balance")
            else balance -= amount
        }

        def Transfer(other_acc:Account, amount:Double) = {
            if(amount > balance) println("Insufficient Balance")
            else {
                this.Withdraw(amount)
                other_acc.Deposit(amount)
            }
        }

        def display() = {
            println("Name : " + this.name)
            println("Balance: " + this.balance + "\n")
        }
    }


    println("------Before Transferring------")
    val x = new Account("Nipun", 5000.25)
    x.display()
    val y = new Account("Kavindu")
    y.display()
    println("\n------After Transferring------")
    x.Transfer(y, 2500.20)
    x.display()
    y.display()

}