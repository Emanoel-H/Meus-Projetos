package DevocionalHelper.Domain;

import java.util.Scanner;

public class DevocionalCaller {
    private Integer book;
    private Integer chapter;
    private Integer verse;

    public void runProgram(Integer book){
        int a, b;
        Scanner sc = new Scanner(System.in);
        switch(book){
            case(1):
                System.out.println("Agora escolha um número de 1 a 50");
                a = sc.nextInt();
        }
    }

    public Integer getBook() {
        return book;
    }

    public void setBook(Integer book) {
        this.book = book;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public Integer getVerse() {
        return verse;
    }

    public void setVerse(Integer verse) {
        this.verse = verse;
    }
}
