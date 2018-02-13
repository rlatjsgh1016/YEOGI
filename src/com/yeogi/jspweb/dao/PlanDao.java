
public interface PlanDao {
	void set(String str);
	void set(int num);
	void set(String date)
	
	
	//계획초기창
	Tourplan getTourplan(String id);
	
	//타임테이블
	PlanPost getPlanPost(String id);
	
	//지출관련 메모
	PlanPostSpend getPlanPostSpend(String id);
	
	//왜 ? 
	Tour_Plan getTourPlan(String id);
	
	List<Loc> getLoc();
	List<Loc> getLoc(String query);
	
	List<t_plan_mod_ahtu_list> getPlanFriend();
	List<t_plan_post> getPlanPost(String id);
	List<t_plan_loc_list> getLocList(int day);
	List<t_Plan_Post_Spd_list> getPlanSpendList();
	
	
	
	
}
