package de.uniol.como.generator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class StarterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StarterPage frame = new StarterPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StarterPage() {
		setTitle("Difference Language Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.window);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Provide Meta-model:");
		lblNewLabel.setBounds(28, 32, 162, 16);
		desktopPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(214, 27, 272, 26);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Browse...");
		btnNewButton.setBounds(369, 53, 117, 29);
		desktopPane.add(btnNewButton);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generator generator = new Generator();
				try {
					generator.generate("jar:file:/Users/backup/Desktop/dilshod/gitlabRepo/differenceLanguage/de.uniol.como.generator/src/main/resources/metamodel/org.eclipse.uml2.uml.resources_3.0.0.v200906011111.jar!/");
				} catch (IOException | NoSuchFieldException | SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnGenerate.setBounds(369, 216, 117, 29);
		desktopPane.add(btnGenerate);
		
		JLabel lblNewLabel_1 = new JLabel("Provide destination to store");
		lblNewLabel_1.setBounds(28, 119, 191, 16);
		desktopPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 114, 272, 26);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDestination = new JButton("Destination...");
		btnDestination.setBounds(369, 141, 117, 29);
		desktopPane.add(btnDestination);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(28, 194, 458, 20);
		desktopPane.add(progressBar);
	}
}
