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
class User2 {
    private String name,status,date;
    
    public User2(String name, String date, String status)
    {
         this.name=name;
         this.status=status;
         this.date=date;
                 }
        public String getname()
        {
            return name;
        }
        public String getstatus()
        {
            return status;
        }
        public String getdate()
        {
            return date;
        }
}
