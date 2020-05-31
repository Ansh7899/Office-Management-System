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
class User4 {
 private String own,cname,cnum,clname,tit,date,cid,sta;
    private int lid,cost;
    public User4(String own,String tit,String clname,String date,String cname,String cid,int cost,String sta,int lid, String cnum)
    {
         this.cname=cname;
         this.clname=clname;
         this.lid=lid;
         this.cost=cost;
         this.cid=cid;
         this.tit=tit;
         this.date=date;
         this.cnum=cnum;
         this.own=own;
         this.sta=sta;
      
         
                 }
        public String getcname()
        {
            return cname;
        }
        public String getclname()
        {
            return clname;
        }
        public String getcid()
        {
            return cid;
        } 
        public String getsta()
        {
            return sta;
        } 
        public String getcnum()
        {
            return cnum;
        } 
        public String getown()
        {
            return own;
        } 
        public int getlid()
        {
            return lid;
        }
        public int getcost()
        {
            return cost;
        }
        public String gettit()
        {
            return tit;
        }    
        public String getdate()
        {
            return date;
        }    
}
