package CommandPattern;

import java.util.ArrayList;

public class Waiter
    {
       private Command command;
       public void SetOrder(Command command) {
    	   this.command=command;
       }
        
        public void Notify()                                                    
        {
              command.ExcuteCommand();  
            
        }
    }