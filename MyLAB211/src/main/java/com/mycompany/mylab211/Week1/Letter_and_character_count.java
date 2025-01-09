/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mylab211.Week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/**
 *
 * @author LENOVO LEGION
 */
public class Letter_and_character_count {
    private String input;

    public Letter_and_character_count() {
        this.input = input;
    }
    
    Map<String, Integer> countWord(String input){
        StringTokenizer word = new StringTokenizer(input);
        Map<String, Integer> wordcount = new HashMap<String, Integer>();
        while(word.hasMoreTokens()){
            String words = word.nextToken();
            wordcount.put(words, wordcount.getOrDefault(word, 0)+1);
        }
        return wordcount;
    }
    
    Map<Character, Integer> countCharacter(String input){
        Map<Character, Integer> charCount = new HashMap<>();
        for(char ch : input.toCharArray()){
            if(ch != ' '){
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        return charCount;
    }
    
}
