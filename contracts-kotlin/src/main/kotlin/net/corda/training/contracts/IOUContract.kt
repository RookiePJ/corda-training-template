package net.corda.training.contracts


import net.corda.core.contracts.*
import net.corda.core.transactions.LedgerTransaction
import net.corda.training.states.IOUState
import net.corda.finance.contracts.asset.Cash
import net.corda.finance.contracts.utils.sumCash
/**
 * This is where you'll add the contract code which defines how the [IOUState] behaves. Look at the unit tests in
 * [IOUContractTests] for instructions on how to complete the [IOUContract] class.
 */
class IOUContract : Contract {
    companion object {
        @JvmStatic
        val IOU_CONTRACT_ID = "net.corda.training.contracts.IOUContract"
    }

    /**
     * Add any commands required for this contract as classes within this interface.
     * It is useful to encapsulate your commands inside an interface, so you can use the [requireSingleCommand]
     * function to check for a number of commands which implement this interface.
     */
    interface Commands : CommandData {

        // Add commands here.
        // E.g
        // class DoSomething : TypeOnlyCommandData(), Commands

//        class Issue : TypeOnlyCommandData(), Commands
//        class Transfer : TypeOnlyCommandData(), Commands
//        class Settle : TypeOnlyCommandData(), Commands
    }

    /**
     * The contract code for the [IOUContract].
     * The constraints are self documenting so don't require any additional explanation.
     */
    override fun verify(tx: LedgerTransaction) {
        // Add contract code here.
        // requireThat {
        //     ...
        // }

    }
}