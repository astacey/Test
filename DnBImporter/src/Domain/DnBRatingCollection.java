package Domain;

import java.util.ArrayList;

public class DnBRatingCollection extends ArrayList<DnBRating>
{

	public void setCommitted()
	{
		for(DnBRating rating : this)
		{
			rating.setCommitted();
		}
	}
}
