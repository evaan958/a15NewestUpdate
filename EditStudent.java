package a15;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditStudent extends javax.swing.JFrame {

	ArrayList<Student> students;

	public EditStudent() {
		initComponents();
		students = new ArrayList<Student>();
		populateArrayList();

		String studentsArray[] = new String[students.size()];
		for (int i = 0; i < students.size(); i++) {
			studentsArray[i] = students.get(i).getStudentNumber();
		}
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(studentsArray));
	}

	public void populateArrayList() {
		try {
			FileInputStream file = new FileInputStream("Students.dat");
			ObjectInputStream inputFile = new ObjectInputStream(file);
			boolean test = false;
			while (!test) {
				try {
					students.add((Student) inputFile.readObject());
				} catch (EOFException e) {
					test = true;
				}
			}
			inputFile.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "error has ocurred " + e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error has ocurred " + e.getMessage());
		}
	}

	public void saveStudentsToFile() {
		try {
			FileOutputStream file = new FileOutputStream("Students.dat");
			ObjectOutputStream outputFile = new ObjectOutputStream(file);
			for (int i = 0; i < students.size(); i++) {
				outputFile.writeObject(students.get(i));
			}
			outputFile.close();
			JOptionPane.showMessageDialog(null, "SAVED");
			this.dispose();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "error has ocurred" + e.getMessage());
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jFirstName = new javax.swing.JTextField();
		jLastName = new javax.swing.JTextField();
		jAge = new javax.swing.JTextField();
		jGender = new javax.swing.JTextField();
		jStudentNumber = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox<>();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setText("First Name");

		jLabel2.setText("Last Name");

		jLabel3.setText("Age");

		jLabel4.setText("Gender");

		jLabel5.setText("Student Number");

		jButton1.setText("Save");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jGender.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jLabel6.setText("Student Number");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

		jMenu1.setText("Edit Student");
		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButton1))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
												.addGap(26, 26, 26)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jStudentNumber, javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																		.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(jLabel5)
																				.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
																		.addComponent(jFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
																		.addComponent(jAge, javax.swing.GroupLayout.Alignment.LEADING))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																		.addComponent(jLabel2)
																		.addComponent(jLabel4)
																		.addComponent(jGender, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
																		.addComponent(jLastName))))))
								.addGap(26, 26, 26))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(25, 25, 25)
								.addComponent(jLabel6)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(36, 36, 36)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1)
										.addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4)
										.addComponent(jLabel3))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
								.addComponent(jLabel5)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(26, 26, 26)
								.addComponent(jButton1)
								.addContainerGap())
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField4ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed                                        
		if (jFirstName.getText().isEmpty() || jLastName.getText().isEmpty() || jAge.getText().isEmpty() || jGender.getText().isEmpty() || jStudentNumber.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR, enter all fields.");
		} else {
			int selectedIndex = jComboBox1.getSelectedIndex();
			students.get(selectedIndex).setFirstName(jFirstName.getText());
			students.get(selectedIndex).setLastName(jLastName.getText());
			students.get(selectedIndex).setAge(Integer.parseInt(jAge.getText()));
			students.get(selectedIndex).setGender(jGender.getText());
			students.get(selectedIndex).setStudentNumber(jStudentNumber.getText());

			// TODO do we need this, we only have to worry about one combo box right?
//			Job j = jobs.get(jComboBox2.getSelectedIndex());
//			employees.get(selectedIndex).setJob(j);
			saveStudentsToFile();
		}
		this.dispose();
	}//GEN-LAST:event_jButton1ActionPerformed
	
	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {        
        int SelectedIndex = jComboBox1.getSelectedIndex();
        jFirstName.setText(students.get(SelectedIndex).getFirstName());
        jLastName.setText(students.get(SelectedIndex).getLastName());
		jAge.setText(String.valueOf(students.get(SelectedIndex).getAge()));
		jGender.setText(students.get(SelectedIndex).getGender());
		// TODO do we need the "" that was in editEmployee?
        jStudentNumber.setText(students.get(SelectedIndex).getStudentNumber());
//        int index = 0;
//        Student j = students.get(SelectedIndex).getJob();
//        for (int i = 0; i < jobs.size(); i++) {
//            if (jobs.get(i).equals(j)) {
//                index = i;
//                break;
//            }
//        }
//        jEmployeeComboBox.setSelectedIndex(index);
    } 
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EditStudent().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JTextField jFirstName;
	private javax.swing.JTextField jLastName;
	private javax.swing.JTextField jAge;
	private javax.swing.JTextField jGender;
	private javax.swing.JTextField jStudentNumber;
	// End of variables declaration//GEN-END:variables
}
