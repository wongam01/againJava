package interfaces;

interface Parseable {
    // 구문 분석 작업을 수행
    public abstract void parse(String fileName); // 추상 메서드 -> 길잡이 역할
}

public class ParseableManger {
    // 리턴 타입이 Parseable interface 이다.
    public static Parseable getParser (String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}


class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "-XML parsing completed");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "HTML parsing completed");
    }
}

class ParseTest {
    public static void main(String[] args) {
        Parseable parser = ParseableManger.getParser("XML");
        // getParser 메소드를 통해 parser 는 XMLParser 인스턴스의 주소값을 갖게된다.
        parser.parse("document.xml");
        // parse 를 호출하면 parser 가 참조하고 있는 XMLParser 인스턴스의 parse 메서드가 호출된다.
        parser = ParseableManger.getParser("HTML");
        parser.parse("document2.HTML");
    }
}
