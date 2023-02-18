
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        
       long entry_start_time=0;
       long entry_end_time=0;
       
       entry_start_time=System.currentTimeMillis();
       
             
        
 //   String path="/Users/erayk/OneDrive/Masaüstü/rows.csv";
    
ArrayList<String> arr=new ArrayList<String>();

ArrayList<String> product=new ArrayList<String>();
ArrayList<String> issue=new ArrayList<String>();
ArrayList<String> company=new ArrayList<String>();
ArrayList<String> state=new ArrayList<String>();
ArrayList<String> complaint_id=new ArrayList<String>();
ArrayList<String> zip_code=new ArrayList<String>();


ArrayList<String> product_data=new ArrayList<String>();
ArrayList<String> company_data=new ArrayList<String>();
ArrayList<String> issue_data=new ArrayList<String>();
ArrayList<String> state_data=new ArrayList<String>();


        try(Scanner scan=new Scanner(new BufferedReader(new FileReader("/Users/engin/OneDrive/Masaüstü/rows.csv")))) {
            
            while(scan.hasNextLine()){  // okunacak satırın kalıp kalmadigini kontrol eder,sirayla tüm satirlari okur

  
           String word=scan.nextLine();  // satırı word değişkenine at
           
            String []temp=word.split(",");

            
            for(int j=0;j<temp.length;j++){
                
                
               arr.add(temp[j]); 
               
               if(((j%7)-1)==0){
                   
                product.add(temp[j]);  
               }
               if(((j%7)-2)==0){
                   
                issue.add(temp[j]);  
               }
               if(((j%7)-3)==0){
                   
                company.add(temp[j]);  
               }
               if(((j%7)-4)==0){
                   
                state.add(temp[j]);  
               }
               if(((j%7)-5)==0){
                   
                complaint_id.add(temp[j]);  
               }
               if(((j%7)-6)==0){
                   
                zip_code.add(temp[j]);  
               }
               
    
            }

            }
      
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Dosya bulunamadi");
            
        }
        catch(IOException ex){
            
            System.out.println("Dosya acilirken bir hata ile karsilasildi");
            
 }

        int thread_num;
        int thread_same_time_num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Olusturmak istediginiz thread sayisini giriniz:");
        thread_num=scan.nextInt();
        System.out.println("Ayni anda calistirmak istediginiz thread sayisini giriniz:");
        thread_same_time_num=scan.nextInt();
        
        System.out.println("Olusturulan Toplam Thread Sayisi:"+thread_num);
        System.out.println("Ayni anda calisan Thread Sayisi:"+thread_same_time_num);
        
        System.out.println("--------------------------------------------------");
        
        ExecutorService executor=Executors.newFixedThreadPool(thread_same_time_num);  // Ayni anda calistirilacak thread sayisi
        
        long all_thread_start_time=0;
        long all_thread_end_time=0;
        
        entry_end_time=System.currentTimeMillis();
       double all_entry_time=(double)(entry_end_time-entry_start_time)/1000;
  

      all_thread_start_time=System.currentTimeMillis();
        
        
        for(int thread_value=1;thread_value<=thread_num;thread_value++){  // tüm threadleri çalıştıran kod,5 tane thread oluşturulursa 5 tane çalıştırır, 2 tane aynı anda çalıştır denilmişse 2-2-1 şeklinde çalıştırır
    
   executor.submit(new Product(product,thread_value,product_data));  
   executor.submit(new Issue(issue,thread_value,issue_data));
   executor.submit(new Company(company,thread_value,company_data));
   executor.submit(new State(state,thread_value,state_data));
   }
        
  executor.shutdown();  // Threadlerin isi bitince threadleri kapat
 
  

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);  // Threadlerin isinin bitmesini maksimum 1 gun bekler,1 gunu gecerse otomatik executor kapanır
            
              } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         all_thread_end_time=System.currentTimeMillis();
       double all_thread_time=(double)(all_thread_end_time-all_thread_start_time)/1000;
        
        System.out.println("Threadlerin toplam calisma suresi:"+all_thread_time+" sn");
        
        System.out.println("Threadlere gelene kadar ki calisma suresi:"+all_entry_time+" sn");
        
        double one_thread_time=all_thread_time/thread_num/4;
        
        System.out.println("Tek bir threadin calisma suresi:"+one_thread_time);
        
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pencere(product_data,issue_data,company_data,state_data,all_thread_time,one_thread_time).setVisible(true);
            }
        });
        

    
        
    }

    
}
