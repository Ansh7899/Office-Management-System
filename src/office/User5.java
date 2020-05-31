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
class User5 {
    public String ename,start,end,reason;
    public User5(String ename,String start,String end,String reason)
    {
        this.start=start;
        this.end=end;
        this.reason=reason;
        this.ename=ename;
          }
    public String getstart()
    {
        return start;
    }
    public String getend()
    {
        return end;
    }
    public String getreason()
    {
        return reason;
    }
    public String getename()
    {
        return ename;
    }
}
