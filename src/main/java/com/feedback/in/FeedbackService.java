package com.feedback.in;

public class FeedbackService {

        public Feedback[] feedbacks = new Feedback[5];
        int feedbackIndex = 0;
        public Customer[] customers = new Customer[5];

        int customerIndex = 0;

        public void registerCustomer(Customer customer){

                customers[customerIndex]  = customer;
                customerIndex++;
        }

        public void addFeedback(Feedback feedback){
                feedbacks[feedbackIndex]  = feedback;
                feedbackIndex++;
        }

        public Feedback fetchFeedbackByCustomerId(int id){
                for (Feedback feedbackList:feedbacks) {
                        if(feedbackList.getCustomer().getId() == id){
                                return feedbackList;
                        }
                }
                return null;
        }

        public  void displayCustomer(Customer[] customers1){
                for (Customer customer:customers1) {
                        System.out.println("Customer id and name ::" +customer.getName()+" "+customer.getId());
                }
        }

        public void displayFeedBack(Feedback[] feedbacks1){
                for (Feedback feedback:feedbacks1) {
                        System.out.println("Feedback are::"+feedback.getDescription()+" "+feedback.getCustomer().getName());
                }
        }




}
