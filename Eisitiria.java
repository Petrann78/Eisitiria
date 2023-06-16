package eisitiria;




import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JWindow;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;



 


/**
 *
 * @author pbouf
 */


public class Eisitiria extends JFrame {
    
    //Declare variable outside of methods so that they are visible everywhere inside the class

   private JTextArea area3;
    private JTextArea area2;
    private JButton save; 
   private ArrayList <DataTickets> data; 
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JTextField field4;
    private JTextField field5;
    private JTextField field6;
    private JTextField field7;
    private JTextField field8;
    private JTextField field9;
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    
    
    private JCheckBox box1;
    private JCheckBox box2;
    float total_cost;
    int NT;
    
    
    
    
  
 
  
  
  
  public Eisitiria()
  
  {
  super();
   data = new ArrayList();
  
  }
  
  
  
  
  
  public static void main(String[] args) {
      MainWindow();
    }
    

  public static void MainWindow(){      //???????????? ?? ?????? frame
 
   Eisitiria frame = new Eisitiria(); 
      frame.setSize(400, 400);
      frame.setTitle("Main Window");
      frame.setVisible(true);
      
      frame.setResizable(true);
      frame.setBackground(Color.LIGHT_GRAY);
      
      frame.prepareMainWindow();        //????? ??? ?????? prepareMainWindow
                                        
  
  
  
  
  
  
  
  }
  
  
  
private void prepareMainWindow() {             
    
    
   JPanel panel = new JPanel();
                                                    //?????????????? ?? ??????? ??? ????????? ?????????
    JButton NewTicket = new JButton("New Ticket");   
    JButton TicketList = new JButton("Tickets List");
    JButton About = new JButton("About");
    JButton Exit = new JButton("Exit");
                                                    //?????????? ?? Menu ?? ?? Items ??? ??????? ?? ???????????
    JMenu menu = new JMenu("Menu");
    JMenuBar menubar = new JMenuBar();
   JMenuItem newTicketItem = new JMenuItem("New Ticket");
   JMenuItem ticketsListItem = new JMenuItem("List of Tickets");
   JMenuItem AboutItem = new JMenuItem("About");
   JMenuItem ExitItem = new JMenuItem("Exit");
    
                                                  //??????????? ?? ??????? ?? ?? Items ?? ??? panel ?? ?? 
                                                  //??? menu ??????????
    panel.add(NewTicket);                         
    panel.add(TicketList);
    panel.add(About);
    panel.add(Exit);
    panel.setVisible(true);
    
    menu.add(newTicketItem);
    menu.add(ticketsListItem);
    menu.add(AboutItem);
    menu.add(ExitItem);
                                                  //??????????? ??? MenuBar ??? frame ???? ????? ??????? ?? Menu ?? 
     menubar.add(menu);                           //???????? ?? items
     this.setJMenuBar(menubar);  
                                                  //???????? ??? ???????? ???? ???????? ?? ? ?? ???????? ??? ?????? 
     this.addWindowListener(new WindowAdapter(){  //exitApp()
     @Override
     public void windowClosing(WindowEvent e){
              exitApp();
         
     }
    
     });
     
     
     
     
     
        
    
     NewTicket.addActionListener(new ActionListener(){ //???????? ???? ???????? ?? ?????? NewTicket ?? ???????? ?
        public void actionPerformed(ActionEvent e) {   //??????? NewTicketWindow()
        NewTicketWindow();
        }
     });
         
     TicketList.addActionListener(new ActionListener(){ //???? ???????? ?? ?????? TicketList, ???????? ? IssuedTicketsWindow()
         public void actionPerformed(ActionEvent e) {
             IssuedTicketsWindow();
         }  
     });
     
     
     
                                                        
     
     About.addActionListener(new ActionListener (){    //???? ??????? ??  ?????? About, ?? ???????? ?   AboutWindow()
         
         
        public void actionPerformed(ActionEvent e) {
                AboutWindow();
            }
        });  
         
         
        
     
      Exit.addActionListener(new ActionListener() { //???????? ???? ???????? ?? ?????? ?? ???????? ? exitApp()
           
        @Override
            public void actionPerformed(ActionEvent e) {
                exitApp();
            }
        });
    
    
      
      newTicketItem.addActionListener(new ActionListener(){ //???? ???????? ?? item newTicketItem ?? ???????? ? NewTicketWindow()
      @Override
      public void actionPerformed(ActionEvent e) {
      NewTicketWindow();
      }
      
      });
      
      
      
      
      
      
      
      
    
     ticketsListItem.addActionListener(new ActionListener(){ //???????? ??  ticketsListItem ?? ???????? ?
                                                             //IssuedTicketsWindow()
         @Override
         public void actionPerformed(ActionEvent e) {
         IssuedTicketsWindow();
         }
         
         
         
         
     });
      
      AboutItem.addActionListener(new ActionListener(){ //???????? ?? AboutItem, ?? ???????? ? AboutWindow()
          @Override
          public void actionPerformed(ActionEvent e) {
          AboutWindow();
          }
          
          
      });
      
      
       ExitItem.addActionListener(new ActionListener() {//???????? ?? ExitItem, ?? ???????? ? exitApp()
            @Override
            public void actionPerformed(ActionEvent e) {
                exitApp();
            }
        });
      
      
      
      
      
      
      
      
      
    
    
    
    
    
    
    
    
    
    this.add(panel, BorderLayout.SOUTH);   //??????? ?? panel ??? ???? ????? ??? ?????????
   
    this.setSize(300, 300);
    this.setVisible(true);
    
}






public static void AboutWindow(){     //???????????? ?? frame2 ??? ?? About Window

Eisitiria frame2 = new Eisitiria();

        frame2.setSize(400, 400);
        frame2.setTitle("About Window");
        frame2.setVisible(true);
       
        frame2.setResizable(true);
        frame2.setBackground(Color.LIGHT_GRAY);
        frame2.prepareAboutWindow();    //??????? ??? prepareAboutWindow() ??? ?? frame2

}






private void prepareAboutWindow() {

JTextArea area = new JTextArea();
ImageIcon icon = new ImageIcon("ProjectProcess.png");
  JLabel label = new JLabel(icon);

area.setEditable(false);                                  //??????????????? ??? ??????????? ??? ??? area
area.append(" -> App name: Airplane Ticket Application");    //??????? ??? ?? ???????? ???? ?? ??? ????? ??? ?????
area.append("\n");
area.append(" -> Author: Petros Boufidis");
area.append("\n");
area.append(" -> Registration Number: 19390162");
area.append("\n");
area.append(" -> project's delivery date : 13/6/2021");



label.setIcon(icon);

this.add(label);
this.addWindowListener(new WindowAdapter() {    //?? ?? ???? ?? ???????? ???????? ?????? ???????? ?? ? ?? ???????? ?
            @Override                                       //exitApp()
            public void windowClosing(WindowEvent e) {
                PreviousFrame(); }
            });
this.add(area);
this.setSize(300,300);
this.setVisible(true);





}

public static void NewTicketWindow(){  // ????????????? ?? frame3 ??? ?? ???????? ??????? ???? ??????????

Eisitiria frame3 = new Eisitiria();

        frame3.setSize(400, 400);
        frame3.setTitle("New Ticket Window");
        frame3.setVisible(true);
        frame3.setLayout( new BorderLayout());
        frame3.setResizable(true);
        frame3.setBackground(Color.LIGHT_GRAY);
      
        frame3.prepareNewTicketWindow();


}

private void prepareNewTicketWindow(){
   
JPanel panel_2 = new JPanel(); //???????????? ??? panel ??? ?? ?????? save
 box1 = new JCheckBox();   //???????????? 2 chechboxes
 box2 = new JCheckBox();
                           //???????????? 7 Textfields ??? ?? ???????? ??? ????????? ??????????? ???? ??????????
field1 = new JTextField();
field2 = new JTextField();
field3 = new JTextField();
field4 = new JTextField();
field5 = new JTextField();
field6 = new JTextField();
field7 = new JTextField();
field8 = new JTextField();
field9 = new JTextField();         //???????????? ??? ??????????? ???????? ??? ?? textfields
label1 = new JLabel("Ticket ID:");
label2 = new JLabel("Issued Date:");
label3 = new JLabel("Client Name:");
label4 = new JLabel("Itinerary:");
label5 = new JLabel("Cost:");
label6 = new JLabel("Class:");
label7 = new JLabel("Window Seat:");
label8 = new JLabel("Big Luggage:");
label9 = new JLabel("Discount:");
                                            //????????  ??? ??????? ?? ?????????? ?? labels ??? ???????? ????? ?? ??
label1.setBounds(0, 10 , 50 , 20);          // ?? ?????? ?? ?? ???? ???? 
label2.setBounds(10, 30 ,50 ,20);           
label3.setBounds(10, 50, 50 , 20);
label4.setBounds(10,70, 50 ,20);
label5.setBounds(10, 90,50,20);
label6.setBounds(10, 110,50,20);
label7.setBounds(10, 130, 50, 20);
label8.setBounds(10, 150, 50, 20);
label9.setBounds(10, 170, 50, 20);
field1.setBounds(70, 10, 100, 20);
field2.setBounds(70, 30, 100, 20);
field3.setBounds(70, 50, 100, 20);
field4.setBounds(70, 70, 100, 20);
field5.setBounds(70, 90, 100, 20);
field6.setBounds(70, 110, 100, 20);
field7.setBounds(70, 130, 100, 20);
field8.setBounds(70, 150, 100, 20);
field9.setBounds(70, 170, 100, 20);
field1.setBackground(Color.LIGHT_GRAY); //??????? ?? ????? ??? textfields ??????? ????
field2.setBackground(Color.LIGHT_GRAY);
field3.setBackground(Color.LIGHT_GRAY);
field4.setBackground(Color.LIGHT_GRAY);
field5.setBackground(Color.LIGHT_GRAY);
field6.setBackground(Color.LIGHT_GRAY);
field7.setBackground(Color.LIGHT_GRAY);
field8.setBackground(Color.LIGHT_GRAY);
field9.setBackground(Color.LIGHT_GRAY);




                                       //?????????? 2 panel ??? ????? ??????? ?? textfields ?? ??? ????????? ???? 
JPanel panelhope2= new JPanel();       // ??? 2? ?? checkboxes ?? ??? ????????? ????
JPanel panelhope = new JPanel();
panelhope.setLayout(new GridLayout());
panelhope.add(label1);
panelhope.add(field1);
panelhope.add(label2);
panelhope.add(field2);
panelhope.add(label3);
panelhope.add(field3);
panelhope.add(label4);
panelhope.add(field4);
panelhope.add(label5);
panelhope.add(field5);
panelhope.add(label6);
panelhope.add(field6);
panelhope2.add(label7);
panelhope2.add(box1);
panelhope2.add(label8);
panelhope2.add(box2);
panelhope.add(label9);
panelhope.add(field9);




this.add(panelhope, BorderLayout.NORTH);  //??????? ?? 1? ???? ???? ????? ??? ????????? ?? ?? 2? ??? ??????.
this.add(panelhope2,BorderLayout.CENTER);



save = new JButton("Save data of tickets"); //?????????????? ?? ?????? save


panel_2.add(save);                         //?? ?? ??????????? ??? panel_2



this.setBackground(Color.WHITE);          //??????? ?? ????? ????????? ?????
this.add(panel_2, BorderLayout.SOUTH);    //??????? ?? panel_2 ?? ???????? ?? ?????? save ??? ???? ????? ??? ?????????
this.setVisible(true);

save.addActionListener(new ActionListener() {                    //???? ??????? ?? ?????? ,???????? ? PreviousFrame()   
            @Override
            public void actionPerformed(ActionEvent e) {
                PreviousFrame(); }
              

});
          
save.addActionListener(new ActionListener() {                   //???? ??????? ?? ?????? ???????? ? Saving1()     
            @Override
            public void actionPerformed(ActionEvent e) {
           
             Saving1();
            }
              

});





   this.addWindowListener(new WindowAdapter(){   //?? ?? ???? ?? ???????? ???????? ?????? ???????? ?? ? ?? ???????? ?
     public void windowClosing(WindowEvent e){   //exitApp()
              PreviousFrame();
            
     }        
            
});


}

public  void IssuedTicketsWindow(){ //???????????? ?? frame4 ??? ?? ???????? ?? ??? ????? ??????????
    
Eisitiria frame4 = new Eisitiria();

frame4.setSize(400, 400);
frame4.setTitle("List of Tickets Window");
frame4.setVisible(true);
 frame4.setResizable(true);
 frame4.setBackground(Color.LIGHT_GRAY);

frame4.prepareIssuedWindow();



    




}







private void prepareIssuedWindow(){ // ?????????? ??? text area ?? 3 ??????? ?? ?? ?????????? ??????? ??? ????? ???? ???????????
area3 = new JTextArea();
JTextArea area4= new JTextArea();
JPanel panel_3 = new JPanel();
JPanel panel_4 = new JPanel();
JButton back = new JButton("Back");
JButton new_ticket = new JButton("Create New Ticket");
JButton refresh = new JButton("Refresh");



area3.setBounds(100, 100, 200, 200);
area3.setVisible(true);
area3.setEditable(false); //??????????????? ??? ??????????? ??? ??? area3
panel_3.add(back);                  //??????????? ?? ??????? ?? ??? panel ??? ????????????? ??? ????
panel_3.add(new_ticket);
panel_3.add(refresh);

area4.append("Number of tickets: ");
area4.append(String.valueOf(NT));
area4.append("\n");
area4.append("Total Cost: ");
area4.append(String.valueOf(total_cost));
panel_4.add(area4);





this.add(panel_3, BorderLayout.SOUTH); //panel_3 ??? ???? ????? ??? ?????????
this.add(panel_4, BorderLayout.EAST);
this.add(area3);



refresh.addActionListener(new ActionListener(){ //???? ??????? ?? ?????? ?? ???????? ? loadTicketData1() 
@Override
public void actionPerformed(ActionEvent e){     
 
    loadTicketData1(); 

      }

});


      


new_ticket.addActionListener(new ActionListener(){ //???? ??????? ?? ?????? ?? ???????? ? NewTicketWindow() 
@Override
public void actionPerformed(ActionEvent e) {

          NewTicketWindow();


    }

});



back.addActionListener(new ActionListener() { //???? ??????? ?? ?????? ?? ???????? ? PreviousFrame()
 @Override
 public void actionPerformed(ActionEvent e) {
   PreviousFrame();
 
 }

});

this.addWindowListener(new WindowAdapter(){
     public void windowClosing(WindowEvent e){
              PreviousFrame();}
});

        }



 



private void Saving1(){
    
String ID = field1.getText().trim();  //??????? String  ??? ?? field1 ?? ?? ?????????? ???? ????????? ID
String date =field2.getText().trim(); //??????? ?? ??? ??
String name =field3.getText().trim(); //??????? ?? ??? ??
String itinerary=field4.getText().trim(); //??????? ?? ??? ??
float cost= Float.parseFloat(field5.getText()); //??????? ?? ??? ??
String classification=field6.getText().trim(); //??????? ?? ??? ??

float   discount = Float.parseFloat(field9.getText()); //??????? ?? ??? ??

total_cost = total_cost + cost;

String Window;
String Luggage;
boolean window= box1.isSelected();
boolean luggage=box2.isSelected();

if (window)
{
Window="true";


}
else {
    Window="false";
}


if(luggage)
{

Luggage="true";

}
else {

Luggage="false";

}

Saving2(ID,date,name ,itinerary,cost,classification,Window,Luggage,discount);


}

 private void Saving2(String ticket_id,String issue_date,String client_name,String itinerary, float cost,String classification,String window_seat,String big_luggage,float discount) {
      DataTickets user = new DataTickets(ticket_id, issue_date, client_name,itinerary,cost,classification,window_seat,big_luggage,discount);

                 data.add(user);

      

      
        
        
            
        
        final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showSaveDialog(Eisitiria.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String fileName = fc.getSelectedFile().getPath();
            if (fileName != null && !fileName.isEmpty()) {
                saveTicketData(fileName);
            }
        }
    }

 private void saveTicketData(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));

       

            //using for-each loop:
            for (int i = 0; i < data.size(); i++) {
                writer.write(data.get(i).toString());
                writer.newLine();
            }

            writer.close();

            JOptionPane.showMessageDialog(
                    Eisitiria.this,
                    data.size() + "  records saved to " + fileName,
                    "Save completed",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(save,
                    "Can't access " + fileName,
                    "File access error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

 
 private void loadTicketData1(){
 
 
 
  final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(Eisitiria.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String fileName = fc.getSelectedFile().getPath();

            if (fileName != null && !fileName.isEmpty()) {
                loadTicketData2(fileName);
                        }
 
             }
 
 
 
 }
 
private void loadTicketData2(String fileName) {
        
       try {
           int numberOfTickets=0;
           String line;
           BufferedReader reader = new BufferedReader(new FileReader(fileName));
           try {
              while( reader.ready())
              {line=reader.readLine();
           area3.append(line);
           area3.append("\n");
              numberOfTickets++;
              }
           reader.close();
           NT=numberOfTickets;
           } catch (IOException ex) {}
       } catch (FileNotFoundException ex) {}
         
       
       
        }       
    


private void PreviousFrame(){ //???? ???????? ?? ????? ?? ?????? ????? ?? ?????????? frame ??????
                              //?? ???????? ?????????? ??? ???? ????????
this.setVisible(false);

}
                            //??? ??? ?????? exitApp()
                            //??????????? ??? ???????? ??? ?????? ?? ?? String: Are you sure you want to exit
                            //? JOptionPane ?????????? ???? ??????? ??????? ?? ??? ??????? ??? ??????
                            //??????? ?????? ???  ??????? ????????? ??? ?? ?? ?????????? ??? ?? ???????.
                            //E????? ??? ??????? ????? ??????? ?? ??? ??????? ??? ??? ???? ????????? 
                            //?????????????? ??? ????????? YES_OPTION,NO_OPTION,CANCEL_OPTION



private void exitApp(){  

 int i = JOptionPane.showConfirmDialog(Eisitiria.this, "Are you sure you want to exit ?");
        if (i == JOptionPane.YES_OPTION) {  //?????? ??????? ??  Yes ???????????? ? ???????? ??? ????????????
            System.exit(0);
            
        }
        else if (i == JOptionPane.NO_OPTION ){ //?????? ??????? ?? No ??? ????? ?????? 
                     this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        else if (i == JOptionPane.CANCEL_OPTION){ //?????? ??????? ?? Cancel ??? ????? ?????? (??? ??? ?????? ??????? ?? 
                 this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);     //???????? ??? ??????????? ???? ?????? ?? ?
}                                                                         // ? ???????


}


 }


















    



















































     
     
     
     
     
      class DataTickets {
    private String ticket_id;
  private String issue_date;
  private String  client_name;
  private String itinerary;
  private float cost;
  private String classification;
  private String window_seat;  
  private String big_luggage;  
  private float discount;
    
    
    
   public DataTickets (){
   ticket_id="Uknown";
   issue_date="Uknown";
   client_name="Uknown";
   itinerary="Uknown";
   cost=0;
   classification="Uknown";
   window_seat="UNKNOWN";
   big_luggage="UNKNOWN";
   discount=0;
   
   
   }
    
    
    
    
    
    public DataTickets (String id ,String date,String name,String Itinerary,float price,String airplane_class,String Window,String luggage,float Discount ){
    
    this.ticket_id = id;
   this.issue_date = date;
   this.client_name= name;
   this.itinerary = Itinerary;
   this.cost = price;
   this.classification = airplane_class;
   this.window_seat = Window;
   this.big_luggage = luggage;
   this.discount = Discount;
        
    
    
    
    
    }
    
    
    
    
    
    
               
                   
    
    
    
    
     public String getTicket() {
        return ticket_id;
    }
     public String getDate () {
     return issue_date;
     
     }
     
     
      public String getName() {
        return client_name;
    }
     
      public String getItinerary() {
        return itinerary;
    }
     
     public float getCost() {
        return cost;
    }
     
      public String getClassification() {
        return classification;
    }
       public String getWindow() {
        return window_seat;
    }
        public String getLug() {
        return big_luggage;
    }
     
      public float getDiscount() {
        return discount;
      }
     
      public void setID(String id) {
        this.ticket_id = id;
      }
      
       public void setDate(String date) {
        this.issue_date = date;
       }
       
        public void setName(String name) {
        this.client_name = name;
        }
        
         public void setIt(String it) {
        this.itinerary= it;
         }
          public void setFirstName(float price) {
        this.cost = price;
          }
          
           public void setFirstName(String classification) {
        this.classification = classification;
           }
        
         public void setWindow(String window) {
        this.window_seat = window;
         }
         
          public void setLug(String luggage) {
        this.big_luggage = luggage;
          }
     
      public void setDiscount(float discount) {
        this.discount = discount;
      }
     
      
     
     
     
     
      @Override
    public String toString() {
        return ticket_id + "\t" + issue_date + "\t" + client_name  
                + "\t" + itinerary + "\t" + cost +"\t" +classification 
                + "\t" + window_seat + "\t" + big_luggage
                + "\t" + discount;
     
     
     
     
     
}
      }