public class About extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
    public About() {
        initComponents();
    }

    private void initComponents() {

    	setTitle("About");
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("aboutusphoto.png"));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 420);
        setResizable(false);
        //setUndecorated(true);
        //getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;

}
