package BufferedReader;

import java.io.Serializable;

public class UserObjectIOStream implements Serializable
{

	private int uid;
	private String unmae;
	private String password;
	public int getUid()
	{
		return uid;
	}
	public void setUid(int uid) 
	{
		this.uid = uid;
	}
	public String getUnmae()
	{
		return unmae;
	}
	public void setUnmae(String unmae) 
	{
		this.unmae = unmae;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
