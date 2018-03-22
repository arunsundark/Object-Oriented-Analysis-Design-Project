import java.util.Date;

public abstract class FlightBasicDetails 
{
	 protected String from;
	 protected String to;
     protected Date date;
     
     public String getFrom()
     {
    	 return this.from;
     } 
     public String getTo()
     {
    	 return this.to;
     } 
     public Date getDate() 
     {
    	 return this.date;
     }
     public void setFrom(String _from )
     {
    	this.from=_from; 
     } 
     public void setTo(String _to ) 
     {
    	this.to=_to;
     } 
     public void setDate(Date _travelDate )
     {
    	this.date=_travelDate;
     }

     
}
