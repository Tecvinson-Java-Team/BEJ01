import java.util.ArrayList;
import java.util.List;

public class Learning {
    private List<Vocabulary> vocabularyList;
    private List<Vocabulary> vocabularyList2;

    public Learning(){
        vocabularyList = new ArrayList<>();
        vocabularyList2 = new ArrayList<>();


        vocabularyList.add(new Vocabulary("Ìdílé", "Family", "Ìdílé mi ń gbé ní ìlú Eko", "My family lives in Lagos"));
        vocabularyList.add(new Vocabulary("Ọjọ́ Ìbí", "Birthday", "Ọjọ́ Ìbí mi ni Ọjọ́ Kẹrin.", "My birthday is on the fourth"));
        vocabularyList.add(new Vocabulary("Ìrísí", "Appearance", "Ìrísí rẹ̀ dàra púpọ̀..", "Your appearance is very beautiful"));
        vocabularyList.add(new Vocabulary("Ìbànújẹ́", "Regret", "Ó ní ìbànújẹ́ fún ohun tó ṣẹlẹ̀.", "He regrets what happened."));
        vocabularyList.add(new Vocabulary("Ìfẹ́", "Love", "Mo ní ìfẹ́ fún èdá ènìyàn.", "I have love for humanity"));
        vocabularyList.add(new Vocabulary("Ìsẹ́lẹ̀", "Event", "Ìṣẹ̀lẹ̀ náà yàtọ̀ sí gbogbo èyí tí a ti rí..", "The event is different from anything we've seen."));
        vocabularyList.add(new Vocabulary("Ìmọ́lára", "Emotions", "Ìmọ́lára mi jẹ́ ayọ̀.", "My emotion is joy."));
        vocabularyList.add(new Vocabulary("Èro", "Thought", "Èro rẹ̀ kàn mi lọ́kàn..", "Your thought touched my heart."));
        vocabularyList.add(new Vocabulary("Ìjì", "Wind", "Ìjì náà ń fẹ̀ gan-an.", "The wind is blowing hard"));
        vocabularyList.add(new Vocabulary("Ìdí", "Reason", "Ìdí rẹ̀ ni pé ó fẹ́ ṣe rere", "His reason is to do good"));

        vocabularyList2.add(new Vocabulary("Mo ń rìn", "I am walking", "Mo ń rìn lọ sí ilé ẹ̀kọ́", "I am walking to the school"));
        vocabularyList2.add(new Vocabulary("Ẹ máa jẹ́ ki ń wọlé", "Please allow me in", "Ẹ máa jẹ́ ki ń wọlé ní ilé", "Please allow me into the house"));
        vocabularyList2.add(new Vocabulary("Mo fẹ́ sọ pé o rí mi", "I want to say you saw me", "Mo fẹ́ sọ pé o rí mi ní àyíká", "I want to say you saw me around"));
        vocabularyList2.add(new Vocabulary("Ọ̀nà wo ni?", "Which way?", "Ọ̀nà wo ni a máa lọ?", "Which way will we go?"));
        vocabularyList2.add(new Vocabulary("Mo ń sùn", "I am sleeping", "Mo ń sùn ní ilé mi", "I am sleeping in my house"));
        vocabularyList2.add(new Vocabulary("Ẹ bá mi wọlé", "Enter with me", "Ẹ bá mi wọlé sí ilé ẹ̀kọ́", "Enter with me into the school"));
        vocabularyList2.add(new Vocabulary("Ṣé o mọ̀ ẹni?", "Do you know the person?", "Ṣé o mọ̀ ẹni tí ó sọ̀rọ̀?", "Do you know the person who spoke?"));
        vocabularyList2.add(new Vocabulary("Mo fẹ́ kọ́rin", "I want to sing", "Mo fẹ́ kọ́rin ní ibi ìjọba", "I want to sing in the government house"));
        vocabularyList2.add(new Vocabulary("Mo ń rẹ́rin", "I am smiling", "Mo ń rẹ́rin fún ìtàn rẹ", "I am smiling at your story"));
        vocabularyList2.add(new Vocabulary("Mo fẹ́ sọ ọrọ̀ mi", "I want to say my word", "Mo fẹ́ sọ ọrọ̀ mi nípa ọ̀rọ̀ tí ó wáyé", "I want to say my word about what happened"));

    }

    public Vocabulary getVocabulary(int index){
        return vocabularyList.get(index);

    }

    public int getTotalVocabularyList() {
        return vocabularyList.size();

    }

    public Vocabulary getVocabulary2(int index){
        return vocabularyList2.get(index);

    }

    public int getTotalVocabularyList2() {
        return vocabularyList2.size();

    }

}
 