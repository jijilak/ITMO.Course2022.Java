package ITMO.Laboratory2;

public class Friend {
   private String name;
    private int bday;
    private String character;
    private String style;

    public Friend(){
    }
    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int bday){
        this.name = name;
        this.bday = bday;
    }
    public Friend(String name, int bday, String character){
        this.name = name;
        this.bday = bday;
        this.character = character;
    }
    public Friend(String name, int bday, String character, String style){
        this.name = name;
        this.bday = bday;
        this.character = character;
        this.style = style;
    }
    String getName(){
        return name;
    }
    int getBday(){
        return bday;
    }
    String getCharacter(){
        return character;
    }
    String getStyle(){
        return style;
    }
    @Override
    public  String toString(){
        return "Имя: " + name +"; Рождён: " + bday + "; Характер: " + character + "; Стиль" + style;
    }
}
