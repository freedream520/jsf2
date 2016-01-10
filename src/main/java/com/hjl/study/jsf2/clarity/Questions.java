package com.hjl.study.jsf2.clarity;

import java.io.Serializable;

import com.hjl.study.jsf2.util.Messages;

public class Questions implements Serializable {
  private static final long serialVersionUID = -7148843668107920897L;
  private String question;
  private Question[] questions = {      
    new Question(
       Messages.getString("com.hjl.study.jsf2.clarity.messages", "expandQuestion", null),
       new String[] { 
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "hydrogen", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "helium", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "water", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "asphalt", null)
       }),
       
   new Question(
       Messages.getString("com.hjl.study.jsf2.clarity.messages", "waterSGQuestion", null),
       new String[] { 
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "onedotoh", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "twodotoh", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "onehundred", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "onethousand", null)
       }),
       
   new Question(
       Messages.getString("com.hjl.study.jsf2.clarity.messages", "numThermoLawsQuestion", null),
       new String[] { 
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "one", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "three", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "five", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "ten", null)
       }),
       
   new Question(
       Messages.getString("com.hjl.study.jsf2.clarity.messages", "closestSunQuestion", null),
       new String[] { 
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "venus", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "mercury", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "mars", null),
         Messages.getString("com.hjl.study.jsf2.clarity.messages", "earth", null)
       })         
  };
  
  public int size()                        { return questions.length; }
  public String getQuestion()              { return question; }
  public void setQuestion(String question) { this.question = question; }
  public Question[] getQuestions()         { return questions; }
}