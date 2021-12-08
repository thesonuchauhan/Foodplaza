package com.foodPlaza.Pojo;

public class Feedback {
	private int FeedbackId;
	private String custName;
	private String emailId;
	private String review;

	public Feedback() {

	}

	public Feedback(String custName, String emailId, String review) {

		this.custName = custName;
		this.emailId = emailId;
		this.review = review;
	}

	public int getFeedbackId() {
		return FeedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		FeedbackId = feedbackId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Feedback [FeedbackId=" + FeedbackId + ", custName=" + custName + ", emailId=" + emailId + ", review="
				+ review + "]";
	}

}
