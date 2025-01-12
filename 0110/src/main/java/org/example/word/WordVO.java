package org.example.word;

public class WordVO {

    private String kor;
    private  String eng;

    public WordVO(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    public String getKor() {
        return kor;
    }

    public String getEng() {
        return eng;
    }


    @Override
    public String toString() {
        return "WordVO{" +
                "kor='" + kor + '\'' +
                ", eng='" + eng + '\'' +
                '}';
    }
}
