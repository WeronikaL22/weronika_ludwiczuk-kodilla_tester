package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DictionaryTestSuite {


    @Test
    public void testAddWord(){
        //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        //when
        dictionary.addWord(polishWord,englishWord);
        //then
        assertEquals(1,dictionary.size());
    }

    @Test
    public void testFindEnglishWords(){
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("gra"); //wynik działania metody przypisuje do zmiennej result

        //then
        //assertEquals(2,result.size()); //samo sprawdzenie rozmiaru kolekcji wynikowej to za mało(?)
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"game"));
        assertEquals(expectedList,result);

    }

    @Test
    public void testFindEnglishWords_withPartOfSpeech(){

        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.VERB,"take"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);
        //then                (czy klasa Dictionary wyszuka jedynie to tłumaczenie które jest rzeczownikiem?)
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        assertEquals(expectedList, result);
    }

}