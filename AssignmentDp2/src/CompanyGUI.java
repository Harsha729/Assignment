import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class CompanyGUI implements Container {
	List<Employee> operationList;
	final JLabel employeeDetails = new JLabel();

	public void getOperationList(Company company) {

		operationList = company.getempList();
		// Iterator<Employee> iterator = operationList.iterator();
		// System.out.println("Employess are :" + iterator);

	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CompanyIterator();
	}

	public class CompanyIterator implements java.util.Iterator<Employee> {

		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (currentIndex >= operationList.size()) {

				return false;
			}
			return true;
		}

		@Override
		public Employee next() {
			// TODO Auto-generated method stub
			return operationList.get(currentIndex++);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			operationList.remove(currentIndex--);
		}

	}

	public void displayEmployees() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Click here");
		JLabel label = new JLabel(
				"Hello Client !! Click to get the Employess List by clicking here",
				JLabel.CENTER);
		frame.setSize(400, 400);

		frame.add(panel);
		panel.add(label);
		button.addActionListener(new ActionPerformed());
		panel.add(button);
		panel.add(employeeDetails);
		frame.setVisible(true);

	}

	class ActionPerformed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Iterator<Employee> iterator = getIterator();
			while (iterator.hasNext()) {
				Employee temp = iterator.next();
				{
					employeeDetails.setText(temp.name);
				}
			}
		}
	}

}
