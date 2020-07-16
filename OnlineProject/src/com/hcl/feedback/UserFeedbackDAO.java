package com.hcl.feedback;

import java.util.List;


public interface UserFeedbackDAO {
	public void saveUserFeedback (UserFeedbackDetails userfeedbackDetails);
	public List<UserFeedbackDetails> showAllFeedback();
}
