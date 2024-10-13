# Bank Contract

## Overview

This is a simple decentralized bank system implemented using **Solidity** for the Ethereum blockchain. The contract allows users to:
1. Create an account.
2. Deposit Ether into their account.
3. Withdraw Ether from their account.
4. Transfer Ether to other accounts.
5. Check their account balance.

The contract uses a **mapping** to store account balances for each user, where the key is the Ethereum address of the user, and the value is their account balance in Wei (the smallest unit of Ether).

## Functions

### 1. `createAccount()`
This function initializes an account with a balance of 0 for the sender (`msg.sender`).

### 2. `deposit(uint256 amount)`
This function allows the sender to deposit an amount into their account. The `payable` keyword allows Ether to be sent to the contract during this transaction.

### 3. `withdraw(uint256 amount)`
This function allows the sender to withdraw an amount from their account, provided they have enough balance. If the balance is insufficient, the transaction is reverted with an error message.

### 4. `transfer(address recipient, uint256 amount)`
This function allows the sender to transfer a specified amount to another account (recipient), provided they have sufficient balance. The amount is deducted from the sender's account and added to the recipient's account.

### 5. `getBalance()`
This is a view function that returns the balance of the sender's account. It does not modify any state, hence it is marked as `view`.

## How to Run the Contract

### Prerequisites
- **Solidity Compiler** (Solc) or **Remix IDE**
- **Ethereum Wallet** like **MetaMask** to interact with the contract

### Steps to Deploy & Test

1. **Deploy the Contract**:
   - Use Remix IDE to compile and deploy the contract.
   - Ensure you have selected the correct environment (e.g., JavaScript VM or an actual test network like Ropsten or Goerli).
   - Click on the "Deploy" button in Remix after compiling the contract.

2. **Create an Account**:
   - Once the contract is deployed, use the `createAccount()` function to initialize your account.
   
3. **Deposit Ether**:
   - Use the `deposit(uint256 amount)` function to deposit some Ether into your account. 
   - The `amount` should be specified in Wei, and the value field in Remix (or in a transaction) should also correspond to the amount you want to deposit.

4. **Check Balance**:
   - You can check your balance using the `getBalance()` function. It will return the balance in Wei.

5. **Withdraw Ether**:
   - Use the `withdraw(uint256 amount)` function to withdraw Ether from your account. Make sure you have sufficient balance, or the transaction will be reverted.

6. **Transfer Ether**:
   - You can transfer Ether to another account using the `transfer(address recipient, uint256 amount)` function. Enter the recipient's address and the amount in Wei.

## Working Example

1. **Creating an Account**:
   - A user starts by calling the `createAccount()` function.
   
2. **Depositing Ether**:
   - The user can deposit an amount by specifying the amount in Wei using the `deposit()` function. For example, depositing 1 Ether (which equals `1000000000000000000` Wei).
   
3. **Checking Balance**:
   - After depositing, the user can check their balance with `getBalance()`, which will return the deposited amount in Wei.

4. **Withdrawing Ether**:
   - The user can withdraw Ether using `withdraw()`, provided they have enough balance.
   
5. **Transferring Ether**:
   - Users can transfer Ether to other accounts using the `transfer()` function by specifying the recipient's address and the amount to transfer.

## Important Notes

- **payable**: This keyword allows the contract to accept Ether, which is essential for deposit transactions.
- **msg.sender**: This is the address of the person who is interacting with the contract.
- **Wei**: The smallest denomination of Ether (1 Ether = 10^18 Wei).
- **Error Handling**: The contract uses `require()` statements to ensure that conditions (like sufficient balance) are met before proceeding with transactions. If conditions are not met, the transaction is reverted.

## Gas Fees

- Each transaction on the Ethereum blockchain requires gas. The more complex the operation (e.g., transfers or withdrawals), the more gas it consumes. Make sure to have enough Ether in your wallet to cover the gas fees during transactions.
