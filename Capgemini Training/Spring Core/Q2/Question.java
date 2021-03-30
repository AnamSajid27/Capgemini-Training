package com.capgemini.springAssignment.Q2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
    private  int questionId;
    private  String  question;

    private List<String> answers;
    private Set<String>  answersSet;
    private Map<Integer,String> answersMap;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Set<String> getAnswersSet() {
        return answersSet;
    }

    public void setAnswersSet(Set<String> answersSet) {
        this.answersSet = answersSet;
    }

    public Map<Integer, String> getAnswersMap() {
        return answersMap;
    }

    public void setAnswersMap(Map<Integer, String> answersMap) {
        this.answersMap = answersMap;
    }

    public void displayAnswerList(){
        System.out.println(questionId+". "+question);
        for(String ans:answers){
            System.out.println(ans);
      }
    }

    public void displayAnswerSet(){
        System.out.println(questionId+". "+question);
        for(String ans:answersSet){
            System.out.println(ans);
        }
    }
    public void displayAnswerMap(){
        System.out.println(questionId+". "+question);
        Set set = answersMap.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry m1 =(Map.Entry)itr.next();
            System.out.println(m1.getKey()+". "+m1.getValue());
        }
    }
}
