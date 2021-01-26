package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>(); //klucze - polskie słowa, wartości-listy słów angileskich

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);

    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())){
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);   // dodaje do zmiennej result tylko te wyrazy ang których part of speech jest zgodne w wyszukanym
    }
        return result;
}

    public int size(){                //ile pozycji znajduje się w słowniku
        return dictionary.size();
    }

}
