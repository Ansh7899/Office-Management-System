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
class User3 {
    private String name,des,add,state,con,cid;
    private int id,sal,pin;
    public User3(int id,String name,String des,int sal,String add,String state,int pin,String con,String cid)
    {
         this.name=name;
         this.id=id;
         this.des=des;
         this.sal=sal;
         this.add=add;
         this.pin=pin;
         this.con=con;
         this.cid=cid;
         this.state=state;
                 }
        public String getname()
        {
            return name;
        }
        public String getdes()
        {
            return des;
        }
        public String getadd()
        {
            return add;
        } 
        public String getstate()
        {
            return state;
        } 
        public String getcon()
        {
            return con;
        } 
        public String getcid()
        {
            return cid;
        } 
        public int getid()
        {
            return id;
        }
        public int getsal()
        {
            return sal;
        }
        public int getpin()
        {
            return pin;
        }
}
