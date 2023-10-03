package com.feedback.in;

public class CustomerFeedBackDriver {

    public static void main(String[] args) {

        FeedbackService feedbackService = new FeedbackService();

        feedbackService.registerCustomer(new Customer(1,"Sahil"));
        feedbackService.registerCustomer(new Customer(2,"Yomit"));
        feedbackService.registerCustomer(new Customer(3,"Pratik"));
        feedbackService.registerCustomer(new Customer(4,"Somya"));
        feedbackService.registerCustomer(new Customer(5,"Divya"));

        //feedbackService.addFeedback(new Feedback(1,"Excellent",new Customer(1,"Sahil")));
        feedbackService.addFeedback(new Feedback(1,"Excellent",feedbackService.customers[0]));
        feedbackService.addFeedback(new Feedback(2,"Very Good",feedbackService.customers[1]));
        feedbackService.addFeedback(new Feedback(3,"Good",feedbackService.customers[2]));
        feedbackService.addFeedback(new Feedback(4,"Average",feedbackService.customers[3]));
        feedbackService.addFeedback(new Feedback(5,"Below Average",feedbackService.customers[4]));

        Feedback feedback = feedbackService.fetchFeedbackByCustomerId(3);
        System.out.println(feedback.getCustomer().getName());
        System.out.println(feedback.getDescription());
        feedbackService.displayCustomer(feedbackService.customers);
        feedbackService.displayFeedBack(feedbackService.feedbacks);




    }




}
