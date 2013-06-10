package Domain;

import java.util.ArrayList;

public class DnBRatingCollection extends ArrayList<DnBRating>
{
	// increment if breaking change to serializaion
	public static final long serialVersionUID = 1L;

	public void setCommitted()
	{
		for(DnBRating rating : this)
		{
			rating.setCommitted();
		}
	}
}
