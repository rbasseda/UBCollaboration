package edu.bridgeport.cs441.collaborator.collaborate.handlers;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoginPage extends Dialog {

	private Text UserIDTxt;
    private Text PasswordTxt;
    private String userid = "";
    private String password = "";
	
    
	protected LoginPage(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
    protected Control createDialogArea(Composite parent) {
            Composite container = (Composite) super.createDialogArea(parent);
            GridLayout layout = new GridLayout(2, false);
            layout.marginRight = 5;
            layout.marginLeft = 10;
            container.setLayout(layout);

            Label lblUser = new Label(container, SWT.NONE);
            lblUser.setText("User:");

            UserIDTxt = new Text(container, SWT.BORDER);
            UserIDTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
                            1, 1));
            UserIDTxt.setText(userid);
            UserIDTxt.addModifyListener(new ModifyListener() {

                    @Override
                    public void modifyText(ModifyEvent e) {
                            Text textWidget = (Text) e.getSource();
                            String userText = textWidget.getText();
                            userid = userText;
                    }
            });

            Label lblPassword = new Label(container, SWT.NONE);
            GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false,
                            false, 1, 1);
            gd_lblNewLabel.horizontalIndent = 1;
            lblPassword.setLayoutData(gd_lblNewLabel);
            lblPassword.setText("Password:");

            PasswordTxt = new Text(container, SWT.BORDER| SWT.PASSWORD);
            PasswordTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
                            false, 1, 1));
            PasswordTxt.setText(password);
            PasswordTxt.addModifyListener(new ModifyListener() {

                    @Override
                    public void modifyText(ModifyEvent e) {
                            Text textWidget = (Text) e.getSource();
                            String passwordText = textWidget.getText();
                            password = passwordText;
                    }
            });
            return container;
    }
	
	
	
	@Override
    protected void createButtonsForButtonBar(Composite parent) {
            createButton(parent, IDialogConstants.OK_ID, "Login", true);
            createButton(parent, IDialogConstants.CANCEL_ID,
                            IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
            return new Point(450, 300);
    }

    @Override
    protected void okPressed() {
            userid = UserIDTxt.getText();
            password = PasswordTxt.getText();
            super.okPressed();
    }

    public String getUser() {
            return userid;
    }

    public void setUser(String user) {
            this.userid = user;
    }

    public String getPassword() {
            return password;
    }

    public void setPassword(String password) {
            this.password = password;
    }

}
