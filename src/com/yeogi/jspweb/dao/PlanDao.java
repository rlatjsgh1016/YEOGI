
public interface PlanDao {
	void set(String str);
	void set(int num);
	void set(String date)
	
	
	//��ȹ�ʱ�â
	Tourplan getTourplan(String id);
	
	//Ÿ�����̺�
	PlanPost getPlanPost(String id);
	
	//������� �޸�
	PlanPostSpend getPlanPostSpend(String id);
	
	//�� ? 
	Tour_Plan getTourPlan(String id);
	
	List<Loc> getLoc();
	List<Loc> getLoc(String query);
	
	List<t_plan_mod_ahtu_list> getPlanFriend();
	List<t_plan_post> getPlanPost(String id);
	List<t_plan_loc_list> getLocList(int day);
	List<t_Plan_Post_Spd_list> getPlanSpendList();
	
	
	
	
}
