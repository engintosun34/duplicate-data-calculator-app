
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Pencere extends javax.swing.JFrame {
    
private ArrayList<String> product_data;
private ArrayList<String> company_data;
private ArrayList<String> issue_data;
private ArrayList<String> state_data;
private double all_thread_time;
private double one_thread_time;


    public Pencere(ArrayList<String> product_data, ArrayList<String> company_data, ArrayList<String> issue_data, ArrayList<String> state_data,double all_thread_time,double one_thread_time) {
        this.product_data = product_data;
        this.company_data = company_data;
        this.issue_data = issue_data;
        this.state_data = state_data;
        this.all_thread_time=all_thread_time;
        this.one_thread_time=one_thread_time;
        
           initComponents();
           
           String toplam =Double.toString(all_thread_time);
           
           Toplam_Sure.setText(toplam);
           
           String bir=Double.toString(one_thread_time);
           
           Thread_Sure.setText(bir);

         // use the addRowToJTable
  
    }
    

   /**
     * Creates new form Pencere
     */
 

    public void addRowToJTable_product_data(ArrayList<String> product_data)
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[product_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < product_data.size(); i++) {
            
           array[0]=product_data.get(i);
           array[1]=product_data.get(i+1);
           array[2]=product_data.get(i+2);
           array[3]=product_data.get(i+3);
           array[4]=product_data.get(i+4);
           i=i+4;
  
            Object data_object[]=array;
         model.addRow(data_object);
           
            
        }
        
        
                
    }
    
    public void addRowToJTable_issue_data(ArrayList<String> issue_data)
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[issue_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < issue_data.size(); i++) {
            
           array[0]=issue_data.get(i);
           array[1]=issue_data.get(i+1);
           array[2]=issue_data.get(i+2);
           array[3]=issue_data.get(i+3);
           array[4]=issue_data.get(i+4);
           i=i+4;
  
            Object data_object[]=array;
         model.addRow(data_object);
           
            
        }
        
    

                
    }
    
    public void addRowToJTable_company_data( ArrayList<String> company_data)
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[company_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < company_data.size(); i++) {
            
           array[0]=company_data.get(i);
           array[1]=company_data.get(i+1);
           array[2]=company_data.get(i+2);
           array[3]=company_data.get(i+3);
           array[4]=company_data.get(i+4);  // benzerlik oranı
           i=i+4;
  
            Object data_object[]=array;
         model.addRow(data_object);
           
            
        }
        
        
                
    }
    
    public void addRowToJTable_state_data(ArrayList<String> state_data)
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[state_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < state_data.size(); i++) {
            
           array[0]=state_data.get(i);
           array[1]=state_data.get(i+1);
           array[2]=state_data.get(i+2);
           array[3]=state_data.get(i+3);
           array[4]=state_data.get(i+4);
           i=i+4;
  
            Object data_object[]=array;
         model.addRow(data_object);
           
            
        }
        
        
                
    }
    
    public void addRowToJTable_product_threshold(ArrayList<String> product_data,String thr)
    {
        
     String []temp=thr.split("-");
 
     double a1= Double.parseDouble(temp[0]);
     double a2= Double.parseDouble(temp[1]);
     

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[product_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < product_data.size(); i++) {
            
      if((i+1)%5==0){
      
          Double b=Double.parseDouble(product_data.get(i));
          
      if(b>=a1 && b<=a2){
      
           array[0]=product_data.get(i-4);
           array[1]=product_data.get(i-3);
           array[2]=product_data.get(i-2);
           array[3]=product_data.get(i-1);
           array[4]=product_data.get(i);  
           
           Object data_object[]=array;
         model.addRow(data_object);
          
      }      
      }   
     
        }
          
    }
    
    
    public void addRowToJTable_issue_threshold(ArrayList<String> issue_data,String thr)
    {
        
     String []temp=thr.split("-");
 
     double a1= Double.parseDouble(temp[0]);
     double a2= Double.parseDouble(temp[1]);
     

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[issue_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < issue_data.size(); i++) {
            
      if((i+1)%5==0){
      
          Double b=Double.parseDouble(issue_data.get(i));
          
      if(b>=a1 && b<=a2){
      
           array[0]=issue_data.get(i-4);
           array[1]=issue_data.get(i-3);
           array[2]=issue_data.get(i-2);
           array[3]=issue_data.get(i-1);
           array[4]=issue_data.get(i);  
           
           Object data_object[]=array;
         model.addRow(data_object);
          
      }      
      }   
     
        }
          
    }
    
    
    public void addRowToJTable_company_threshold(ArrayList<String> company_data,String thr)
    {
        
     String []temp=thr.split("-");
 
     double a1= Double.parseDouble(temp[0]);
     double a2= Double.parseDouble(temp[1]);
     

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[company_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < company_data.size(); i++) {
            
      if((i+1)%5==0){
      
          Double b=Double.parseDouble(company_data.get(i));
          
      if(b>=a1 && b<=a2){
      
           array[0]=company_data.get(i-4);
           array[1]=company_data.get(i-3);
           array[2]=company_data.get(i-2);
           array[3]=company_data.get(i-1);
           array[4]=company_data.get(i);  
           
           Object data_object[]=array;
         model.addRow(data_object);
          
      }      
      }   
     
        }
          
    }
    
    
    public void addRowToJTable_state_threshold(ArrayList<String> state_data,String thr)
    {
        
     String []temp=thr.split("-");
 
     double a1= Double.parseDouble(temp[0]);
     double a2= Double.parseDouble(temp[1]);
     

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object data=new Object[state_data.size()/5];
         String []array=new String[5];
        
        for (int i = 0; i < state_data.size(); i++) {
            
      if((i+1)%5==0){
      
          Double b=Double.parseDouble(state_data.get(i));
          
      if(b>=a1 && b<=a2){
      
           array[0]=state_data.get(i-4);
           array[1]=state_data.get(i-3);
           array[2]=state_data.get(i-2);
           array[3]=state_data.get(i-1);
           array[4]=state_data.get(i);  
           
           Object data_object[]=array;
         model.addRow(data_object);
          
      }      
      }   
     
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Threshold = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Product = new javax.swing.JButton();
        Issue = new javax.swing.JButton();
        Company = new javax.swing.JButton();
        State = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Toplam_Sure = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Thread_Sure = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Product_Threshold = new javax.swing.JButton();
        Issue_Threshold = new javax.swing.JButton();
        Company_Threshold = new javax.swing.JButton();
        State_threshold = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Column Name");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Row Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Thread Sayisi");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Threshold");

        Threshold.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-10", "11-30", "31-40", "41-50", "51-70", "71-85", "86-100", " " }));
        Threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThresholdActionPerformed(evt);
            }
        });

        jButton1.setText("Search");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "20", "30", " " }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aranacak Verinin Sırası", "Aranacak Veri", "Kıyaslanacak Verinin Sırası", "Kıyaslanacak Veri", "Benzerlik Oranı"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane3);

        Product.setText("Product");
        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });

        Issue.setText("Company");
        Issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueActionPerformed(evt);
            }
        });

        Company.setText("Issue");
        Company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyActionPerformed(evt);
            }
        });

        State.setText("State");
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });

        Clear.setText("Temizle");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel5.setText("               Thread Toplam Süre :");

        Toplam_Sure.setText("jLabel9");

        jLabel9.setText("                1 Thread Süre :");

        Thread_Sure.setText("jLabel10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Thread_Sure, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(Toplam_Sure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Toplam_Sure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Thread_Sure))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Threshold Sütun");

        Product_Threshold.setText("Product");
        Product_Threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_ThresholdActionPerformed(evt);
            }
        });

        Issue_Threshold.setText("Company");
        Issue_Threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Issue_ThresholdActionPerformed(evt);
            }
        });

        Company_Threshold.setText("Issue");
        Company_Threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Company_ThresholdActionPerformed(evt);
            }
        });

        State_threshold.setText("State");
        State_threshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                State_thresholdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Company, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Product, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(State, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Issue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Product_Threshold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Company_Threshold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(State_threshold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Issue_Threshold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 122, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Threshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jButton1))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Threshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product)
                    .addComponent(Product_Threshold))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Company)
                            .addComponent(Company_Threshold))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Issue)
                            .addComponent(Issue_Threshold))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(State)
                            .addComponent(State_threshold))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
        // TODO add your handling code here:
        addRowToJTable_product_data(product_data);
        
    }//GEN-LAST:event_ProductActionPerformed

    private void IssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueActionPerformed
        // TODO add your handling code here:
        
        addRowToJTable_issue_data(issue_data);
        
     
    }//GEN-LAST:event_IssueActionPerformed

    private void CompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyActionPerformed
        // TODO add your handling code here:
        
         addRowToJTable_company_data(company_data);
    }//GEN-LAST:event_CompanyActionPerformed

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed
        // TODO add your handling code here:
        
        addRowToJTable_state_data(state_data);
    }//GEN-LAST:event_StateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
model.getDataVector().removeAllElements();
model.fireTableDataChanged();
        
    }//GEN-LAST:event_ClearActionPerformed

    private void ThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThresholdActionPerformed
        // TODO add your handling code here:
      
        
        
    }//GEN-LAST:event_ThresholdActionPerformed

    private void Product_ThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_ThresholdActionPerformed
        // TODO add your handling code here:

        String thr=Threshold.getItemAt(Threshold.getSelectedIndex());

        addRowToJTable_product_threshold(product_data,thr);

    }//GEN-LAST:event_Product_ThresholdActionPerformed

    private void Issue_ThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Issue_ThresholdActionPerformed
        // TODO add your handling code here:

        String thr=Threshold.getItemAt(Threshold.getSelectedIndex());

        addRowToJTable_issue_threshold(issue_data,thr);

    }//GEN-LAST:event_Issue_ThresholdActionPerformed

    private void Company_ThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Company_ThresholdActionPerformed
        // TODO add your handling code here:
        
        String thr=Threshold.getItemAt(Threshold.getSelectedIndex());

        addRowToJTable_company_threshold(company_data,thr);
        
    }//GEN-LAST:event_Company_ThresholdActionPerformed

    private void State_thresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_State_thresholdActionPerformed
        // TODO add your handling code here:
        
         String thr=Threshold.getItemAt(Threshold.getSelectedIndex());

        addRowToJTable_state_threshold(state_data,thr);
        
    }//GEN-LAST:event_State_thresholdActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Company;
    private javax.swing.JButton Company_Threshold;
    private javax.swing.JButton Issue;
    private javax.swing.JButton Issue_Threshold;
    private javax.swing.JButton Product;
    private javax.swing.JButton Product_Threshold;
    private javax.swing.JButton State;
    private javax.swing.JButton State_threshold;
    private javax.swing.JLabel Thread_Sure;
    private javax.swing.JComboBox<String> Threshold;
    private javax.swing.JLabel Toplam_Sure;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
