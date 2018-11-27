import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.text.DecimalFormat;

public class SavingsAccountTester
{
	public static void main(String[] args)
	{


        SavingsAccount userSavings = new SavingsAccount(0);
        String name = JOptionPane.showInputDialog("Enter your name");
	    Object[] withdraw_deposit_quit = { "Withdraw", "Deposit", "Quit"};
        JPanel bankAccountWindow= new JPanel();
        bankAccountWindow.add(new JLabel("What would you like to do?"));
		int choice;

        do {
			 choice = JOptionPane.showOptionDialog(null, bankAccountWindow, "Bank Account",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, withdraw_deposit_quit, null);
			if (choice==JOptionPane.YES_OPTION)
			{
				String withdraw = JOptionPane.showInputDialog("Enter the amount you'd like to withdraw");
				double withdrawAmount = Double.parseDouble(withdraw);
				userSavings.withdraw(withdrawAmount);
			}
			else if (choice==JOptionPane.NO_OPTION)
            {
                String deposit = JOptionPane.showInputDialog("Enter the amount you're depositing");
                double depositAmount = Double.parseDouble(deposit);
                userSavings.deposit(depositAmount);
            }

		}
		while (choice == JOptionPane.YES_OPTION||choice==JOptionPane.NO_OPTION );
        JOptionPane.showMessageDialog(null, "ACCOUNT SUMMARY FOR: "+name+"\nACCOUNT BALANCE: $"
        +userSavings.getBalance());
		}
	}
		


