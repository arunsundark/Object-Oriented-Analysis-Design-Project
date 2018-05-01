package com.Management.Travel;
import java.util.Date;



public abstract class FlightBasicDetails 
{
	public FlightBasicDetails() {};

	protected String from;
	public String getFrom(){return this.from;} 
	public void setFrom(String _from )
    {
		this.from=_from; 
    } 

	protected String to;
	public String getTo()
    {
   	 return this.to;
    }
	public void setTo(String _to ) 
    {
   	this.to=_to;
    } 
	
    protected Date date;
	public Date getDate() 
	{
		return this.date;
	}
    public void setDate(Date _travelDate ){this.date=_travelDate;}     
}
