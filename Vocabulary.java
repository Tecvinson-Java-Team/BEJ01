public class Vocabulary {
    private String yorubaWord;
    private String englishMeaning;
    private String yorubaSentence;
    private String englishSentence;
    public Vocabulary(String yorubaWord, String englishMeaning, String yorubaSentence, String englishSentence) {
        this.yorubaWord = yorubaWord;
        this.englishMeaning = englishMeaning;
        this.yorubaSentence = yorubaSentence;
        this.englishSentence = englishSentence;
    }
    public String getYorubaWord() {
        return yorubaWord;
    }
    public void setYorubaWord(String yorubaWord) {
        this.yorubaWord = yorubaWord;
    }
    public String getEnglishMeaning() {
        return englishMeaning;
    }
    public void setEnglishMeaning(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }
    public String getYorubaSentence() {
        return yorubaSentence;
    }
    public void setYorubaSentence(String yorubaSentence) {
        this.yorubaSentence = yorubaSentence;
    }
    public String getEnglishSentence() {
        return englishSentence;
    }
    public void setEnglishSentence(String englishSentence) {
        this.englishSentence = englishSentence;
    }
}
