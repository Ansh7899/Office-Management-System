/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office;

/**
 *
 * @author anshh
 */
class User {
    private int id,amount;
    private String name,trans,month,bonus,creditOn;
    
    public User(int id, String name, String trans, String month, String bonus, String creditOn, int amount)
    {
         this.id=id;
         this.name=name;
         this.trans=trans;
         this.month=month;
         this.bonus=bonus;
         this.creditOn=creditOn;
         this.amount=amount;
    }
        public int getid()
        {
            return id;
            
        }
        public String getname()
        {
            return name;
        }
        public String gettrans()
        {
            return trans;
        }
        public String getmonth()
        {
            return month;
        }
        public String getbonus()
        {
            return bonus;
        }
        public String getcreditOn()
        {
            return creditOn;
        }
        public int getamount()
        {
            return amount;
        }
}
