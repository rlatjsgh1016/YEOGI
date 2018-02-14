import java.util.Date;

public interface PlanDao {

	void insert(String travelTitle, Date startDate, Date endDate, String theme, int companion)
	
	

	Tourplan getTourplan(String id);
	

	List<Location> getLocation();
	List<Location> getLocation(String query);
	
	List<PlanModifyList> getModifyFriend();
	List<Post> getPost(String id);
	List<LocationList> getLocationList(int day);
	List<PostSpendList> getSpendList();
	
	
	
	
}
