package students;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JRadioButton;

public class ChangeFrame extends javax.swing.JFrame {

    public ChangeFrame() {
    	String data;
		try {//������ӵ�������
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Student.txt")));
			while((data = br.readLine()) != null){
				txt.add(data);//ԭ�����ݵ���
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new JRadioButton("ѧ��",true);
        jRadioButton2 = new JRadioButton("����",false);
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(350, 100, 1108, 635));

        jLabel1.setFont(new java.awt.Font("����", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("ѧ����Ϣ����ϵͳ���޸�ѧ����Ϣ��");

        jButton2.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jButton2.setText("������ҳ��");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jButton3.setText("��ѯѧ����Ϣ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jButton4.setText("��ʾ����ѧ����Ϣ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jButton6.setText("�˳�");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel3.setText("ѧ�ţ�");

        jLabel18.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel18.setText("����ţ�");

        jLabel5.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel5.setText("������");

        jLabel7.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel7.setText("�Ա�");

        jLabel9.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel9.setText("�绰��");

        jLabel11.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel11.setText("�������ڣ�");

        jButton1.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jButton1.setText("�ҳ�ѧ��");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel13.setText("������ò��");

        jLabel15.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel15.setText("��ַ��");

        jLabel2.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jLabel2.setText("����");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jRadioButton1.setText("ѧ��");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jRadioButton2.setText("����");

        jTextField1.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField2.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField3.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField5.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField4.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField6.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField7.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField8.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jTextField9.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jLabel4.setFont(new java.awt.Font("����", 0, 30)); // NOI18N

        jButton5.setFont(new java.awt.Font("����", 0, 30)); // NOI18N
        jButton5.setText("�޸�");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(62, 62, 62)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(jButton6)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(390, 390, 390))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new SearchFrame().setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new DisplayFrame().setVisible(true);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String data = jTextField1.getText();
        Object source = evt.getSource();
        if(source == jButton1)
        {
            if(jRadioButton1.isSelected() == true) {//���ѡ����ѧ�Ű�ť
                for(int i = 0 ; i < txt.size() ; i++ ){//ѧ�Ų�ѯ
                    String detail = txt.get(i);//����ַ�����ѧ����Ϣ
                    String[] detaildata = detail.split(",");
                    if(data.equals(detaildata[0])){
                    	jTextField3.setText(detaildata[0]);//ѧ��
                        jTextField2.setText(detaildata[1]);//����
                        jTextField5.setText(detaildata[2]);//�Ա�
                        jTextField7.setText(detaildata[3]);//��������
                        jTextField9.setText(detaildata[4]);//������ò
                        jTextField6.setText(detaildata[5]);//��ͥסַ
                        jTextField4.setText(detaildata[6]);//�绰
                        jTextField8.setText(detaildata[7]);//�����
                        break;
                    }
                }
            }
            if(jRadioButton2.isSelected() == true){
                for(int i = 0 ; i < txt.size() ; i++ ){//������ѯ
                    String detail = txt.get(i);//����ַ�����ѧ����Ϣ
                    String[] detaildata = detail.split(",");
                    if(data.equals(detaildata[1])){
                    	jTextField3.setText(detaildata[0]);//ѧ��
                        jTextField2.setText(detaildata[1]);//����
                        jTextField5.setText(detaildata[2]);//�Ա�
                        jTextField7.setText(detaildata[3]);//��������
                        jTextField9.setText(detaildata[4]);//������ò
                        jTextField6.setText(detaildata[5]);//��ͥסַ
                        jTextField4.setText(detaildata[6]);//�绰
                        jTextField8.setText(detaildata[7]);//�����
                        break;
                    }
                }
            }
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	String data = jTextField1.getText();
    	String mes = null;
    	String stuno = jTextField3.getText();//ѧ��
    	String name = jTextField2.getText();//����
    	String gender = jTextField5.getText();//�Ա�
    	String birthday = jTextField7.getText();//��������
    	String statu = jTextField9.getText();//������ò
    	String address = jTextField6.getText();//��ͥסַ
    	String tel = jTextField4.getText();//�绰
    	String roomnum = jTextField8.getText();//�����
    	String msg = stuno+","+name+","+gender+","+birthday+","+statu+","+
    			address+","+tel+","+roomnum;
    	for(int i = 0 ; i < txt.size() ; i++ ){//��ѧ���޸�
            String detail = txt.get(i);//����ַ�����ѧ����Ϣ
            String[] detaildata = detail.split(",");
            if(data.equals(detaildata[0])){
            	txt.remove(i);
            	txt.add(i, msg);            	
                break;
            }
        }
    	for(int i = 0 ; i < txt.size() ; i++ ){
            String detail = txt.get(i);//����ַ�����ѧ����Ϣ
            String[] detaildata = detail.split(",");
            if(data.equals(detaildata[0])){//��ѧ���޸�
            	txt.remove(i);
            	txt.add(i, msg);            	
                break;
            }else if(data.equals(detaildata[1])){//�������޸�
            	txt.remove(i);
            	txt.add(i, msg);            	
                break;
            }            
        }        
		mes = "�ѳɹ��޸��� "+name+" ����Ϣ(^_^)";
		jLabel4.setText(mes);//��Ӵ�������
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Student.txt")));
			for(int i = 0; i<txt.size();i++){
				pw.println(txt.get(i));
				pw.flush();//ˢ��printwriter������
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify   
    private List<String> txt = new ArrayList<String>();                  
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}
