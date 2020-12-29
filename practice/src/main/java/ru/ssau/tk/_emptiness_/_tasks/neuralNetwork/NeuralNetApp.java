package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

public class NeuralNetApp extends javax.swing.JFrame {
    public NeuralNetApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jTxtInput0 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtInput1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtOutput0 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBtnANDDelta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBtnANDAdaline = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaOutput = new javax.swing.JTextArea();
        jCmbActivationFnc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtWeight0 = new javax.swing.JTextField();
        jTxtWeight1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtWeight2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBtnORDelta = new javax.swing.JButton();
        jBtnORAdaline = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Input 0");

        jTxtInput0.setToolTipText("");
        jTxtInput0.setName("jTxtInput0"); // NOI18N

        jLabel6.setText("Input 1");
        jLabel6.setToolTipText("");

        jTxtInput1.setToolTipText("");
        jTxtInput1.setName("jTxtInput0"); // NOI18N

        jLabel7.setText("Output 0");
        jLabel7.setToolTipText("");

        jTxtOutput0.setToolTipText("");
        jTxtOutput0.setName("jTxtInput0"); // NOI18N

        jButton1.setText("Init");

        jBtnANDDelta.setText("Train Delta Rule");

        jButton3.setText("Calc");
        jButton3.setToolTipText("");

        jBtnANDAdaline.setText("Train Adapline");

        jTxtAreaOutput.setColumns(20);
        jTxtAreaOutput.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaOutput);

        jCmbActivationFnc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Sigmoid", "HyperTan", "Linear", "Threshold"}));

        jLabel2.setText("Activation Function");
        jLabel2.setToolTipText("");

        jLabel1.setText("Weight 0");

        jLabel3.setText("Weight 1");
        jLabel3.setToolTipText("");

        jLabel4.setText("Bias");
        jLabel4.setToolTipText("");

        jLabel8.setText("AND");
        jLabel8.setToolTipText("");

        jBtnORDelta.setText("Train Delta Rule");

        jBtnORAdaline.setText("Train Adapline");

        jLabel9.setText("OR");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTxtInput0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jTxtOutput0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel6)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTxtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jButton3)
                                                                        .addGap(30, 30, 30)))
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jButton1)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel1)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(jTxtWeight0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel4))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTxtWeight2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTxtWeight1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jBtnANDAdaline, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jBtnANDDelta, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jBtnORAdaline, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jBtnORDelta, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jScrollPane1)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jCmbActivationFnc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 270, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jCmbActivationFnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jTxtWeight0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jTxtWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jTxtWeight2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jBtnANDDelta)
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jBtnANDAdaline)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jBtnORDelta)
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jBtnORAdaline))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jTxtInput0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jTxtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jTxtOutput0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NeuralNetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeuralNetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeuralNetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeuralNetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeuralNetApp().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jBtnANDAdaline;
    private javax.swing.JButton jBtnANDDelta;
    private javax.swing.JButton jBtnORAdaline;
    private javax.swing.JButton jBtnORDelta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCmbActivationFnc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtAreaOutput;
    private javax.swing.JTextField jTxtInput0;
    private javax.swing.JTextField jTxtInput1;
    private javax.swing.JTextField jTxtOutput0;
    private javax.swing.JTextField jTxtWeight0;
    private javax.swing.JTextField jTxtWeight1;
    private javax.swing.JTextField jTxtWeight2;
}
