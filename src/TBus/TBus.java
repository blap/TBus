/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TBus;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.rms.*;



/**
 * @author Bruno
 */



public class TBus extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command itemBusca;
    private Command itemBD;
    private Command backCommand;
    private Command exitCommand1;
    private Command itemADD;
    private Command exitCommand2;
    private Command backInicio;
    private Command backCommand1;
    private Command itemSave;
    private Command backCommand2;
    private Command exitCommand3;
    private Command itemDetalhe;
    private Command exitCommand4;
    private Command backCommand3;
    private Command itemEditar;
    private Command itemDetalhe1;
    private Command itemSobre;
    private Command itemDel;
    private Command backCommand4;
    private Form TBus;
    private TextField textField;
    private StringItem stringItem;
    private StringItem stringItem1;
    private Form BD;
    private ChoiceGroup choiceGroup;
    private Form ADD;
    private TextField textField3;
    private TextField textField2;
    private TextField textField5;
    private TextField textField4;
    private Form Busca;
    private ChoiceGroup choiceGroup1;
    private StringItem stringItem2;
    private Form Editar;
    private TextField textField6;
    private TextField textField1;
    private TextField textField8;
    private TextField textField7;
    private Form Sobre;
    private StringItem stringItem3;
    //</editor-fold>//GEN-END:|fields|0|

    private RecordStore rs;
    private String RS_NAME = "";
    int id = 0;
    private int x = 0;
    private RecordEnumeration re;
    private String temp1 = "";
    private String temparray[];
    private String temparray2[] = new String [100];
    
    /**
     * The TBus constructor.
     */
    public TBus() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|
    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getTBus());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == ADD) {//GEN-BEGIN:|7-commandAction|1|45-preAction
            if (command == backCommand1) {//GEN-END:|7-commandAction|1|45-preAction
                // write pre-action user code here

                add(textField2.getString()+"\t"+textField3.getString()+"\t"+textField4.getString()+"\t"+textField5.getString());
                System.out.println(getRecord(1)+"\n");

                additemCG(choiceGroup);

                switchDisplayable(null, getBD());//GEN-LINE:|7-commandAction|2|45-postAction
                // write post-action user code here
            } else if (command == exitCommand2) {//GEN-LINE:|7-commandAction|3|43-preAction
                // write pre-action user code here
                
                close();
                         
               
                exitMIDlet();//GEN-LINE:|7-commandAction|4|43-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|36-preAction
        } else if (displayable == BD) {
            if (command == backCommand) {//GEN-END:|7-commandAction|5|36-preAction
                // write pre-action user code here
                switchDisplayable(null, getTBus());//GEN-LINE:|7-commandAction|6|36-postAction
                // write post-action user code here
            } else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|7|34-preAction
                // write pre-action user code here
                
                close();
               
                
                exitMIDlet();//GEN-LINE:|7-commandAction|8|34-postAction
                // write post-action user code here
            } else if (command == itemADD) {//GEN-LINE:|7-commandAction|9|39-preAction
                // write pre-action user code here
                switchDisplayable(null, getADD());//GEN-LINE:|7-commandAction|10|39-postAction
                // write post-action user code here

                textField2.setString("");
                textField3.setString("");
                textField4.setString("");
                textField5.setString("");
                                
            } else if (command == itemDel) {//GEN-LINE:|7-commandAction|11|91-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|12|91-postAction
                // write post-action user code here
                
                try
                {                    
                    rs.deleteRecord(choiceGroup1.getSelectedIndex()+1);
                }catch (RecordStoreException e) {System.out.println("RecordStoreException: "+e);}

                additemCG(choiceGroup1);
                
            } else if (command == itemEditar) {//GEN-LINE:|7-commandAction|13|85-preAction
                // write pre-action user code here
                switchDisplayable(null, getEditar());//GEN-LINE:|7-commandAction|14|85-postAction
                // write post-action user code here
                
                id = choiceGroup.getSelectedIndex() + 1;  
                System.out.println("id: "+id);
                String temp = getRecord(id);
                System.out.println("temp: "+temp);
                String[] temp2 = split(temp,"\t");
                textField1.setString(temp2[0]);
                System.out.println("temp2[0]: "+temp2[0]);
                textField6.setString(temp2[1]);
                System.out.println("temp2[1]: "+temp2[1]);
                textField7.setString(temp2[1]);
                System.out.println("temp2[2]: "+temp2[2]);
                textField8.setString(temp2[3]);
                System.out.println("temp2[3]: "+temp2[3]);
                
            }//GEN-BEGIN:|7-commandAction|15|63-preAction
        } else if (displayable == Busca) {
            if (command == backCommand2) {//GEN-END:|7-commandAction|15|63-preAction
                // write pre-action user code here
                switchDisplayable(null, getTBus());//GEN-LINE:|7-commandAction|16|63-postAction
                // write post-action user code here
                
                textField.setString("");
                
            } else if (command == exitCommand3) {//GEN-LINE:|7-commandAction|17|61-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|18|61-postAction
                // write post-action user code here
                
                close();
               
                
            }//GEN-BEGIN:|7-commandAction|19|75-preAction
        } else if (displayable == Editar) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|19|75-preAction
                // write pre-action user code here
                switchDisplayable(null, getBD());//GEN-LINE:|7-commandAction|20|75-postAction
                // write post-action user code here
                
                set(textField1.getString()+"\t"+textField6.getString()+"\t"+textField7.getString()+"\t"+textField8.getString()+"\t",id);
                additemCG(choiceGroup);
                
            } else if (command == exitCommand4) {//GEN-LINE:|7-commandAction|21|77-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|22|77-postAction
                // write post-action user code here
                
                close();
               
                
            }//GEN-BEGIN:|7-commandAction|23|98-preAction
        } else if (displayable == Sobre) {
            if (command == backCommand4) {//GEN-END:|7-commandAction|23|98-preAction
                // write pre-action user code here
                switchDisplayable(null, getTBus());//GEN-LINE:|7-commandAction|24|98-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|19-preAction
        } else if (displayable == TBus) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|25|19-preAction
                // write pre-action user code here
                
                close();
               
                
                exitMIDlet();//GEN-LINE:|7-commandAction|26|19-postAction
                // write post-action user code here
            } else if (command == itemBD) {//GEN-LINE:|7-commandAction|27|30-preAction
                // write pre-action user code here
                switchDisplayable(null, getBD());//GEN-LINE:|7-commandAction|28|30-postAction
                // write post-action user code here

                additemCG(choiceGroup);

            } else if (command == itemBusca) {//GEN-LINE:|7-commandAction|29|23-preAction
                // write pre-action user code here
                switchDisplayable(null, getBusca());//GEN-LINE:|7-commandAction|30|23-postAction
                // write post-action user code here
                
               try
                {
                  // Record store is not empty
                  if (rs.getNumRecords() > 0)
                  {
                    // Setup the search filter with the user requested text
                    SearchFilter search = new SearchFilter(textField.getString());

                    re = rs.enumerateRecords(search, null, false);
                    
                    temp1 = "";
                    
                    choiceGroup1.deleteAll();
                    
                    // A match was found using the filter
                    if (re.numRecords() > 0)
                      // Show match in the stringItem on the form 
                    {
                        for (int i = 1; i<=re.numRecords(); i++)
                      {
                          
                          temp1 = new String(re.nextRecord());
                          System.out.println("temp1: "+temp1);  
                          temparray = split(temp1,"\t");
                          System.out.println("temparray[0]: "+temparray[0]);
                          System.out.println("temparray[1]: "+temparray[1]);
                          System.out.println("temparray[2]: "+temparray[2]);
                          System.out.println("temparray[3]: "+temparray[3]);
                          choiceGroup1.append(temparray[0],null);
                          temparray2[i-1] = temparray[3];
                          System.out.println("temparray2["+(i-1)+"]: "+temparray2[i-1]);
                                                     
                      }                        
                        temp1 = temparray2[choiceGroup1.getSelectedIndex()];
                        stringItem2.setText(temp1);             
                    }
                    
                    re.destroy();   // Free enumerator       
                      
                  }
                }
                catch (Exception e){}
               
                
            } else if (command == itemSobre) {//GEN-LINE:|7-commandAction|31|94-preAction
                // write pre-action user code here
                switchDisplayable(null, getSobre());//GEN-LINE:|7-commandAction|32|94-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|33|7-postCommandAction
        }//GEN-END:|7-commandAction|33|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|34|
    //</editor-fold>//GEN-END:|7-commandAction|34|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command(LocalizationSupport.getMessage("exit"), Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: TBus ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of TBus component.
     * @return the initialized component instance
     */
    public Form getTBus() {
        if (TBus == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            TBus = new Form("TBus", new Item[] { getStringItem(), getTextField(), getStringItem1() });//GEN-BEGIN:|14-getter|1|14-postInit
            TBus.addCommand(getExitCommand());
            TBus.addCommand(getItemBusca());
            TBus.addCommand(getItemBD());
            TBus.addCommand(getItemSobre());
            TBus.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
            RS_NAME = "TBus";
            open(RS_NAME);


        }//GEN-BEGIN:|14-getter|2|
        return TBus;
    }
    //</editor-fold>//GEN-END:|14-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemBusca ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of itemBusca component.
     * @return the initialized component instance
     */
    public Command getItemBusca() {
        if (itemBusca == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            itemBusca = new Command(LocalizationSupport.getMessage("search2"), Command.ITEM, 1);//GEN-LINE:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return itemBusca;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            textField = new TextField(LocalizationSupport.getMessage("enter"), "", 100, TextField.ANY);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|24-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            stringItem = new StringItem(LocalizationSupport.getMessage("search"), LocalizationSupport.getMessage("search.text"));//GEN-LINE:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|26-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of stringItem1 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            stringItem1 = new StringItem(LocalizationSupport.getMessage("help"), LocalizationSupport.getMessage("help.text"));//GEN-LINE:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return stringItem1;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemBD ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initiliazed instance of itemBD component.
     * @return the initialized component instance
     */
    public Command getItemBD() {
        if (itemBD == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            itemBD = new Command(LocalizationSupport.getMessage("DB"), Command.ITEM, 2);//GEN-LINE:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return itemBD;
    }
    //</editor-fold>//GEN-END:|29-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initiliazed instance of exitCommand1 component.
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|33-getter|0|33-preInit
            // write pre-init user code here
            exitCommand1 = new Command(LocalizationSupport.getMessage("exit"), Command.EXIT, 0);//GEN-LINE:|33-getter|1|33-postInit
            // write post-init user code here
        }//GEN-BEGIN:|33-getter|2|
        return exitCommand1;
    }
    //</editor-fold>//GEN-END:|33-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            backCommand = new Command(LocalizationSupport.getMessage("back"), Command.BACK, 1);//GEN-LINE:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|35-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: BD ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initiliazed instance of BD component.
     * @return the initialized component instance
     */
    public Form getBD() {
        if (BD == null) {//GEN-END:|31-getter|0|31-preInit
            // write pre-init user code here
            BD = new Form(LocalizationSupport.getMessage("transport"), new Item[] { getChoiceGroup() });//GEN-BEGIN:|31-getter|1|31-postInit
            BD.addCommand(getExitCommand1());
            BD.addCommand(getBackCommand());
            BD.addCommand(getItemADD());
            BD.addCommand(getItemEditar());
            BD.addCommand(getItemDel());
            BD.setCommandListener(this);//GEN-END:|31-getter|1|31-postInit
            // write post-init user code here
        }//GEN-BEGIN:|31-getter|2|
        return BD;
    }
    //</editor-fold>//GEN-END:|31-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemADD ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of itemADD component.
     * @return the initialized component instance
     */
    public Command getItemADD() {
        if (itemADD == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            itemADD = new Command(LocalizationSupport.getMessage("add"), Command.ITEM, 2);//GEN-LINE:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return itemADD;
    }
    //</editor-fold>//GEN-END:|38-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initiliazed instance of exitCommand2 component.
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            exitCommand2 = new Command(LocalizationSupport.getMessage("exit"), Command.EXIT, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return exitCommand2;
    }
    //</editor-fold>//GEN-END:|42-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|44-getter|0|44-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|44-getter|0|44-preInit
            // write pre-init user code here
            backCommand1 = new Command(LocalizationSupport.getMessage("backsave"), Command.BACK, 1);//GEN-LINE:|44-getter|1|44-postInit
            // write post-init user code here
        }//GEN-BEGIN:|44-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|44-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backInicio ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initiliazed instance of backInicio component.
     * @return the initialized component instance
     */
    public Command getBackInicio() {
        if (backInicio == null) {//GEN-END:|47-getter|0|47-preInit
            // write pre-init user code here
            backInicio = new Command("Voltar", Command.BACK, 0);//GEN-LINE:|47-getter|1|47-postInit
            // write post-init user code here
        }//GEN-BEGIN:|47-getter|2|
        return backInicio;
    }
    //</editor-fold>//GEN-END:|47-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemSave ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initiliazed instance of itemSave component.
     * @return the initialized component instance
     */
    public Command getItemSave() {
        if (itemSave == null) {//GEN-END:|54-getter|0|54-preInit
            // write pre-init user code here
            itemSave = new Command("Item", Command.ITEM, 0);//GEN-LINE:|54-getter|1|54-postInit
            // write post-init user code here
        }//GEN-BEGIN:|54-getter|2|
        return itemSave;
    }
    //</editor-fold>//GEN-END:|54-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ADD ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initiliazed instance of ADD component.
     * @return the initialized component instance
     */
    public Form getADD() {
        if (ADD == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            ADD = new Form(LocalizationSupport.getMessage("add"), new Item[] { getTextField2(), getTextField3(), getTextField4(), getTextField5() });//GEN-BEGIN:|40-getter|1|40-postInit
            ADD.addCommand(getExitCommand2());
            ADD.addCommand(getBackCommand1());
            ADD.setCommandListener(this);//GEN-END:|40-getter|1|40-postInit
            // write post-init user code here
        }//GEN-BEGIN:|40-getter|2|
        return ADD;
    }
    //</editor-fold>//GEN-END:|40-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            textField2 = new TextField(LocalizationSupport.getMessage("code"), null, 10, TextField.ANY);//GEN-LINE:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|50-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initiliazed instance of textField3 component.
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            textField3 = new TextField(LocalizationSupport.getMessage("origin"), null, 100, TextField.ANY);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return textField3;
    }
    //</editor-fold>//GEN-END:|51-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initiliazed instance of textField4 component.
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            textField4 = new TextField(LocalizationSupport.getMessage("destination"), null, 100, TextField.ANY);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return textField4;
    }
    //</editor-fold>//GEN-END:|52-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|53-getter|0|53-preInit
    /**
     * Returns an initiliazed instance of textField5 component.
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|53-getter|0|53-preInit
            // write pre-init user code here
            textField5 = new TextField(LocalizationSupport.getMessage("time"), null, 100, TextField.ANY);//GEN-LINE:|53-getter|1|53-postInit
            // write post-init user code here
        }//GEN-BEGIN:|53-getter|2|
        return textField5;
    }
    //</editor-fold>//GEN-END:|53-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|57-getter|0|57-preInit
    /**
     * Returns an initiliazed instance of choiceGroup component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|57-getter|0|57-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup(LocalizationSupport.getMessage("list"), Choice.EXCLUSIVE);//GEN-LINE:|57-getter|1|57-postInit
            // write post-init user code here
        }//GEN-BEGIN:|57-getter|2|
        return choiceGroup;
    }
    //</editor-fold>//GEN-END:|57-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initiliazed instance of exitCommand3 component.
     * @return the initialized component instance
     */
    public Command getExitCommand3() {
        if (exitCommand3 == null) {//GEN-END:|60-getter|0|60-preInit
            // write pre-init user code here
            exitCommand3 = new Command(LocalizationSupport.getMessage("exit"), Command.EXIT, 0);//GEN-LINE:|60-getter|1|60-postInit
            // write post-init user code here
        }//GEN-BEGIN:|60-getter|2|
        return exitCommand3;
    }
    //</editor-fold>//GEN-END:|60-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initiliazed instance of backCommand2 component.
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|62-getter|0|62-preInit
            // write pre-init user code here
            backCommand2 = new Command(LocalizationSupport.getMessage("back"), Command.BACK, 1);//GEN-LINE:|62-getter|1|62-postInit
            // write post-init user code here
        }//GEN-BEGIN:|62-getter|2|
        return backCommand2;
    }
    //</editor-fold>//GEN-END:|62-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Busca ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initiliazed instance of Busca component.
     * @return the initialized component instance
     */
    public Form getBusca() {
        if (Busca == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            Busca = new Form(LocalizationSupport.getMessage("search2"), new Item[] { getStringItem2(), getChoiceGroup1() });//GEN-BEGIN:|58-getter|1|58-postInit
            Busca.addCommand(getExitCommand3());
            Busca.addCommand(getBackCommand2());
            Busca.setCommandListener(this);//GEN-END:|58-getter|1|58-postInit
            // write post-init user code here
            
            ItemStateListener listener = new ItemStateListener() 
            {
      
                public void itemStateChanged(Item item) 
                {
                    if (item == choiceGroup1) 
                    {
                    
                        if (choiceGroup1.getSelectedIndex() >= 0)
                        {
                            temp1 = temparray2[choiceGroup1.getSelectedIndex()];
                            stringItem2.setText(temp1);
                        }                  
                    
                    } 
                    
                }
                
            };

    // register for events
    Busca.setItemStateListener(listener);
            
        }//GEN-BEGIN:|58-getter|2|
        return Busca;
    }
    //</editor-fold>//GEN-END:|58-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initiliazed instance of choiceGroup1 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|66-getter|0|66-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup(LocalizationSupport.getMessage("result"), Choice.EXCLUSIVE);//GEN-LINE:|66-getter|1|66-postInit
            // write post-init user code here                        
        }//GEN-BEGIN:|66-getter|2|
        return choiceGroup1;
    }
    //</editor-fold>//GEN-END:|66-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemDetalhe ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of itemDetalhe component.
     * @return the initialized component instance
     */
    public Command getItemDetalhe() {
        if (itemDetalhe == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            itemDetalhe = new Command("Item", Command.ITEM, 0);//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return itemDetalhe;
    }
    //</editor-fold>//GEN-END:|70-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|74-getter|0|74-preInit
    /**
     * Returns an initiliazed instance of backCommand3 component.
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|74-getter|0|74-preInit
            // write pre-init user code here
            backCommand3 = new Command(LocalizationSupport.getMessage("backsave"), Command.BACK, 1);//GEN-LINE:|74-getter|1|74-postInit
            // write post-init user code here
        }//GEN-BEGIN:|74-getter|2|
        return backCommand3;
    }
    //</editor-fold>//GEN-END:|74-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand4 ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initiliazed instance of exitCommand4 component.
     * @return the initialized component instance
     */
    public Command getExitCommand4() {
        if (exitCommand4 == null) {//GEN-END:|76-getter|0|76-preInit
            // write pre-init user code here
            exitCommand4 = new Command(LocalizationSupport.getMessage("exit"), Command.EXIT, 0);//GEN-LINE:|76-getter|1|76-postInit
            // write post-init user code here
        }//GEN-BEGIN:|76-getter|2|
        return exitCommand4;
    }
    //</editor-fold>//GEN-END:|76-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemEditar ">//GEN-BEGIN:|84-getter|0|84-preInit
    /**
     * Returns an initiliazed instance of itemEditar component.
     * @return the initialized component instance
     */
    public Command getItemEditar() {
        if (itemEditar == null) {//GEN-END:|84-getter|0|84-preInit
            // write pre-init user code here
            itemEditar = new Command(LocalizationSupport.getMessage("edit"), Command.ITEM, 3);//GEN-LINE:|84-getter|1|84-postInit
            // write post-init user code here
        }//GEN-BEGIN:|84-getter|2|
        return itemEditar;
    }
    //</editor-fold>//GEN-END:|84-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Editar ">//GEN-BEGIN:|72-getter|0|72-preInit
    /**
     * Returns an initiliazed instance of Editar component.
     * @return the initialized component instance
     */
    public Form getEditar() {
        if (Editar == null) {//GEN-END:|72-getter|0|72-preInit
            // write pre-init user code here
            Editar = new Form(LocalizationSupport.getMessage("edit"), new Item[] { getTextField1(), getTextField6(), getTextField7(), getTextField8() });//GEN-BEGIN:|72-getter|1|72-postInit
            Editar.addCommand(getBackCommand3());
            Editar.addCommand(getExitCommand4());
            Editar.setCommandListener(this);//GEN-END:|72-getter|1|72-postInit
            // write post-init user code here
        }//GEN-BEGIN:|72-getter|2|
        return Editar;
    }
    //</editor-fold>//GEN-END:|72-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|80-getter|0|80-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|80-getter|0|80-preInit
            // write pre-init user code here
            textField1 = new TextField(LocalizationSupport.getMessage("code"), null, 100, TextField.ANY);//GEN-LINE:|80-getter|1|80-postInit
            // write post-init user code here
        }//GEN-BEGIN:|80-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|80-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|81-getter|0|81-preInit
    /**
     * Returns an initiliazed instance of textField6 component.
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|81-getter|0|81-preInit
            // write pre-init user code here
            textField6 = new TextField(LocalizationSupport.getMessage("origin"), null, 100, TextField.ANY);//GEN-LINE:|81-getter|1|81-postInit
            // write post-init user code here
        }//GEN-BEGIN:|81-getter|2|
        return textField6;
    }
    //</editor-fold>//GEN-END:|81-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of textField7 component.
     * @return the initialized component instance
     */
    public TextField getTextField7() {
        if (textField7 == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            textField7 = new TextField(LocalizationSupport.getMessage("destination"), null, 100, TextField.ANY);//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return textField7;
    }
    //</editor-fold>//GEN-END:|82-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField8 ">//GEN-BEGIN:|83-getter|0|83-preInit
    /**
     * Returns an initiliazed instance of textField8 component.
     * @return the initialized component instance
     */
    public TextField getTextField8() {
        if (textField8 == null) {//GEN-END:|83-getter|0|83-preInit
            // write pre-init user code here
            textField8 = new TextField(LocalizationSupport.getMessage("time"), null, 100, TextField.ANY);//GEN-LINE:|83-getter|1|83-postInit
            // write post-init user code here
        }//GEN-BEGIN:|83-getter|2|
        return textField8;
    }
    //</editor-fold>//GEN-END:|83-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemDetalhe1 ">//GEN-BEGIN:|87-getter|0|87-preInit
    /**
     * Returns an initiliazed instance of itemDetalhe1 component.
     * @return the initialized component instance
     */
    public Command getItemDetalhe1() {
        if (itemDetalhe1 == null) {//GEN-END:|87-getter|0|87-preInit
            // write pre-init user code here
            itemDetalhe1 = new Command("Detalhes", Command.ITEM, 0);//GEN-LINE:|87-getter|1|87-postInit
            // write post-init user code here
        }//GEN-BEGIN:|87-getter|2|
        return itemDetalhe1;
    }
    //</editor-fold>//GEN-END:|87-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemDel ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initiliazed instance of itemDel component.
     * @return the initialized component instance
     */
    public Command getItemDel() {
        if (itemDel == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            itemDel = new Command(LocalizationSupport.getMessage("del"), Command.ITEM, 4);//GEN-LINE:|90-getter|1|90-postInit
            // write post-init user code here
        }//GEN-BEGIN:|90-getter|2|
        return itemDel;
    }
    //</editor-fold>//GEN-END:|90-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|92-getter|0|92-preInit
    /**
     * Returns an initiliazed instance of stringItem2 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {//GEN-END:|92-getter|0|92-preInit
            // write pre-init user code here
            stringItem2 = new StringItem(LocalizationSupport.getMessage("time"), null);//GEN-LINE:|92-getter|1|92-postInit
            // write post-init user code here
        }//GEN-BEGIN:|92-getter|2|
        return stringItem2;
    }
    //</editor-fold>//GEN-END:|92-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemSobre ">//GEN-BEGIN:|93-getter|0|93-preInit
    /**
     * Returns an initiliazed instance of itemSobre component.
     * @return the initialized component instance
     */
    public Command getItemSobre() {
        if (itemSobre == null) {//GEN-END:|93-getter|0|93-preInit
            // write pre-init user code here
            itemSobre = new Command(LocalizationSupport.getMessage("about"), Command.ITEM, 3);//GEN-LINE:|93-getter|1|93-postInit
            // write post-init user code here
        }//GEN-BEGIN:|93-getter|2|
        return itemSobre;
    }
    //</editor-fold>//GEN-END:|93-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|97-getter|0|97-preInit
    /**
     * Returns an initiliazed instance of backCommand4 component.
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {//GEN-END:|97-getter|0|97-preInit
            // write pre-init user code here
            backCommand4 = new Command(LocalizationSupport.getMessage("back"), Command.BACK, 0);//GEN-LINE:|97-getter|1|97-postInit
            // write post-init user code here
        }//GEN-BEGIN:|97-getter|2|
        return backCommand4;
    }
    //</editor-fold>//GEN-END:|97-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Sobre ">//GEN-BEGIN:|95-getter|0|95-preInit
    /**
     * Returns an initiliazed instance of Sobre component.
     * @return the initialized component instance
     */
    public Form getSobre() {
        if (Sobre == null) {//GEN-END:|95-getter|0|95-preInit
            // write pre-init user code here
            Sobre = new Form(LocalizationSupport.getMessage("about"), new Item[] { getStringItem3() });//GEN-BEGIN:|95-getter|1|95-postInit
            Sobre.addCommand(getBackCommand4());
            Sobre.setCommandListener(this);//GEN-END:|95-getter|1|95-postInit
            // write post-init user code here
        }//GEN-BEGIN:|95-getter|2|
        return Sobre;
    }
    //</editor-fold>//GEN-END:|95-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|100-getter|0|100-preInit
    /**
     * Returns an initiliazed instance of stringItem3 component.
     * @return the initialized component instance
     */
    public StringItem getStringItem3() {
        if (stringItem3 == null) {//GEN-END:|100-getter|0|100-preInit
            // write pre-init user code here
            stringItem3 = new StringItem(LocalizationSupport.getMessage("about"), LocalizationSupport.getMessage("about.text"));//GEN-LINE:|100-getter|1|100-postInit
            // write post-init user code here
        }//GEN-BEGIN:|100-getter|2|
        return stringItem3;
    }
    //</editor-fold>//GEN-END:|100-getter|2|



    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
    public void open(String RS_NAME1)
    {
        try
        {
            rs = RecordStore.openRecordStore(RS_NAME1, true);
        } catch (RecordStoreNotFoundException e) {System.out.println("RecordStoreNotFoundException: "+e);}
        catch (RecordStoreException e) {System.out.println("RecordStoreException: "+e);}
    }

    public void close()
    {
        try
        {
            rs.closeRecordStore();
        } catch( RecordStoreNotOpenException e ){System.out.println("RecordStoreNotOpenException: "+e);}
        catch( RecordStoreException e ){System.out.println("RecordStoreException: "+e);}
    }
    
    private void add(String nome)
    {
        id = 0;
        try
         {
            id = rs.getNextRecordID();
         } catch (RecordStoreException ex) {System.out.println("RecordStoreException: "+ex);}

        try
        {
            byte[] data = nome.getBytes();
            id = rs.addRecord(data, 0, data.length);
        } catch( RecordStoreException e ){System.out.println("RecordStoreException: "+e);}
    }
    
    public String getRecord(int id)
    {
        String toReturn = "";
        try
        {
            byte[] data = rs.getRecord( id );
            toReturn = new String(data,0,data.length);

        }catch (ArrayIndexOutOfBoundsException e) {System.out.println("ArrayIndexOutOfBoundsException: "+e);}
        catch (InvalidRecordIDException e) {System.out.println("InvalidRecordIDException: "+e);}
        catch (RecordStoreNotOpenException e) {System.out.println("RecordStoreNotOpenException: "+e);}
        catch (RecordStoreException e) {System.out.println("RecordStoreException: "+e);}
        return toReturn;
    }
         
    /**Identifies the substrings in a given string that are delimited
    by one or more characters specified in an array, and then
    places the substrings into a String array.
    */
    public static String[] split(String strString, String strDelimiter)
    {
        String[] strArray;
        int iOccurrences = 0;
        int iIndexOfInnerString = 0;
        int iIndexOfDelimiter = 0;
        int iCounter = 0;

        //Check for null input strings.
        if (strString == null)
        {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        //Check for null or empty delimiter strings.
        if (strDelimiter.length() <= 0 || strDelimiter == null)
        {
            throw new IllegalArgumentException("Delimeter cannot be null or empty.");
        }

        //strString must be in this format: (without {} )
        //"{str[0]}{delimiter}str[1]}{delimiter} ...
        // {str[n-1]}{delimiter}{str[n]}{delimiter}"

        //If strString begins with delimiter then remove it in order
        //to comply with the desired format.

        if (strString.startsWith(strDelimiter))
        {
            strString = strString.substring(strDelimiter.length());
        }

        //If strString does not end with the delimiter then add it
        //to the string in order to comply with the desired format.
        if (!strString.endsWith(strDelimiter))
        {
            strString += strDelimiter;
        }

        //Count occurrences of the delimiter in the string.
        //Occurrences should be the same amount of inner strings.
        while((iIndexOfDelimiter = strString.indexOf(strDelimiter, iIndexOfInnerString)) != -1)
        {
            iOccurrences += 1;
            iIndexOfInnerString = iIndexOfDelimiter +
            strDelimiter.length();
        }

        //Declare the array with the correct size.
        strArray = new String[iOccurrences];

        //Reset the indices.
        iIndexOfInnerString = 0;
        iIndexOfDelimiter = 0;

        //Walk across the string again and this time add the
        //strings to the array.
        while((iIndexOfDelimiter = strString.indexOf(strDelimiter, iIndexOfInnerString)) != -1)
        {

            //Add string to array.
            strArray[iCounter] = strString.substring(iIndexOfInnerString,iIndexOfDelimiter);

            //Increment the index to the next character after
            //the next delimiter.
            iIndexOfInnerString = iIndexOfDelimiter + strDelimiter.length();

            //Inc the counter.
            iCounter += 1;
        }
    return strArray;
    }
    
    private void additemCG(ChoiceGroup CG)
    {
        x = 0;
        String temp = "";
        //String[] temp2;
        try
        {
            x = rs.getNumRecords();
        } catch (RecordStoreNotOpenException ex) {System.out.println("RecordStoreNotOpenException: "+ex);}
        //System.out.println("x: "+x);

        CG.deleteAll();

        for (int y = 1; y<=x; y++)
        {
            temp = getRecord(y);
            
            System.out.println("getRecord("+y+"): "+getRecord(y)+"\n");

            //temp2 = split(temp,"\n");
            //CG.append(temp2[0],null);
            CG.append(temp,null);
        }
    }
        
    /*--------------------------------------------------
    * Search for text within a record
    * Each record passed in contains only text (String)
    *-------------------------------------------------*/
    class SearchFilter implements RecordFilter
    {
      private String searchText = null;

      public SearchFilter(String searchText)
      {
        // This is the text to search for
        this.searchText = searchText.toLowerCase();
      }

      public boolean matches(byte[] candidate)
      {
        String str = new String(candidate).toLowerCase();

        // Look for a match   
        if (searchText != null && str.indexOf(searchText) != -1)
          return true;
        else
          return false;
      }
    }

    public void set(String nome, int id)
        {
            try
            {
                byte[] data = nome.getBytes();
                rs.setRecord(id, data, 0, data.length);
            }catch (RecordStoreFullException e) {System.out.println("RecordStoreFullException: "+e);}
            catch( RecordStoreNotOpenException e ){System.out.println("RecordStoreNotOpenException: "+e);}
            catch( RecordStoreException e ){System.out.println("RecordStoreException: "+e);}
        }

   
}
