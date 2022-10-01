package ro.java.ctrln;

public class OuterClassWithLocalClass {
    private static final int SIZE = 5;
    private String[] messageList = {"message1", "message2", "message3", "message4", "message5", "message6"};

    public void showMessages(){
        class LocalClass{
            private int nextIndex = 0;

            public boolean hasNext(){
                return (this.nextIndex <= messageList.length -1);
            }
            public String next(){
                return messageList[this.nextIndex++];
            }

        }
        LocalClass localClass = new LocalClass();
        while(localClass.hasNext()){
            System.out.println("Mesajul este: " + localClass.next());
        }
    }

    public static void main(String[] args) {
        OuterClassWithLocalClass outerClassWithLocalClass = new OuterClassWithLocalClass();
        outerClassWithLocalClass.showMessages();
    }
}
